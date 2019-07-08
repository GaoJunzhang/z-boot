package com.garry.zboot.modules.base.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.garry.zboot.common.utils.SecurityUtil;
import com.garry.zboot.modules.base.dao.TDepartmentDao;
import com.garry.zboot.modules.base.dao.TUserDao;
import com.garry.zboot.modules.base.dao.mapper.PermissionMapper;
import com.garry.zboot.modules.base.dao.mapper.UserRoleMapper;
import com.garry.zboot.modules.base.model.TDepartment;
import com.garry.zboot.modules.base.model.TPermission;
import com.garry.zboot.modules.base.model.TRole;
import com.garry.zboot.modules.base.model.TUser;
import com.garry.zboot.modules.base.service.UserService;
import com.garry.zboot.modules.base.vo.SearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户接口实现
 * @author Exrickx
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserDao userDao;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private TDepartmentDao departmentDao;

    @Autowired
    private SecurityUtil securityUtil;

    @Override
    public TUserDao getRepository() {
        return userDao;
    }

    @Override
    public TUser findByUsername(String username) {
        
        List<TUser> list=userDao.findByUsername(username);
        if(list!=null&&list.size()>0){
            TUser user = list.get(0);
            // 关联部门
            if(StrUtil.isNotBlank(user.getDepartmentId())){
                TDepartment department = departmentDao.getOne(user.getDepartmentId());
                user.setDepartmentTitle(department.getTitle());
            }
            // 关联角色
            List<TRole> roleList = userRoleMapper.findByUserId(user.getId());
            user.setRoles(roleList);
            // 关联权限菜单
            List<TPermission> permissionList = permissionMapper.findByUserId(user.getId());
            user.setPermissions(permissionList);
            return user;
        }
        return null;
    }

    @Override
    public TUser findByMobile(String mobile) {

        List<TUser> list = userDao.findByMobile(mobile);
        if(list!=null&&list.size()>0) {
            TUser user = list.get(0);
            return user;
        }
        return null;
    }

    @Override
    public TUser findByEmail(String email) {

        List<TUser> list = userDao.findByEmail(email);
        if(list!=null&&list.size()>0) {
            TUser user = list.get(0);
            return user;
        }
        return null;
    }

    @Override
    public Page<TUser> findByCondition(TUser user, SearchVo searchVo, Pageable pageable) {

        return userDao.findAll(new Specification<TUser>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<TUser> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                Path<String> usernameField = root.get("username");
                Path<String> mobileField = root.get("mobile");
                Path<String> emailField = root.get("email");
                Path<String> departmentIdField = root.get("departmentId");
                Path<String> sexField=root.get("sex");
                Path<Integer> typeField=root.get("type");
                Path<Integer> statusField=root.get("status");
                Path<Date> createTimeField=root.get("createTime");

                List<Predicate> list = new ArrayList<Predicate>();

                //模糊搜素
                if(StrUtil.isNotBlank(user.getUsername())){
                    list.add(cb.like(usernameField,'%'+user.getUsername()+'%'));
                }
                if(StrUtil.isNotBlank(user.getMobile())){
                    list.add(cb.like(mobileField,'%'+user.getMobile()+'%'));
                }
                if(StrUtil.isNotBlank(user.getEmail())){
                    list.add(cb.like(emailField,'%'+user.getEmail()+'%'));
                }

                //部门
                if(StrUtil.isNotBlank(user.getDepartmentId())){
                    list.add(cb.equal(departmentIdField, user.getDepartmentId()));
                }

                //性别
                if(StrUtil.isNotBlank(user.getSex())){
                    list.add(cb.equal(sexField, user.getSex()));
                }
                //类型
                if(user.getType()!=null){
                    list.add(cb.equal(typeField, user.getType()));
                }
                //状态
                if(user.getStatus()!=null){
                    list.add(cb.equal(statusField, user.getStatus()));
                }
                //创建时间
                if(StrUtil.isNotBlank(searchVo.getStartDate())&&StrUtil.isNotBlank(searchVo.getEndDate())){
                    Date start = DateUtil.parse(searchVo.getStartDate());
                    Date end = DateUtil.parse(searchVo.getEndDate());
                    list.add(cb.between(createTimeField, start, DateUtil.endOfDay(end)));
                }

                //数据权限
                List<String> depIds = securityUtil.getDeparmentIds();
                if(depIds!=null&&depIds.size()>0){
                    list.add(departmentIdField.in(depIds));
                }

                Predicate[] arr = new Predicate[list.size()];
                cq.where(list.toArray(arr));
                return null;
            }
        }, pageable);
    }

    @Override
    public List<TUser> findByDepartmentId(String departmentId) {

        return userDao.findByDepartmentId(departmentId);
    }
}
