package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TUserRoleDao;
import com.garry.zboot.modules.base.model.TUserRole;
import com.garry.zboot.modules.base.service.UserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户角色接口实现
 * @Author gaojunzhang
 * @Date 2019/7/8 23:26
 */
@Slf4j
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private TUserRoleDao userRoleDao;

    @Override
    public TUserRoleDao getRepository() {
        return userRoleDao;
    }

    @Override
    public List<TUserRole> findByRoleId(String roleId) {
        return userRoleDao.findByRoleId(roleId);
    }

    @Override
    public void deleteByUserId(String userId) {
        userRoleDao.deleteByUserId(userId);
    }
}
