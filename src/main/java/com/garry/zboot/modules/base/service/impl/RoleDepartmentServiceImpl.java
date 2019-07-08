package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TRoleDepartmentDao;
import com.garry.zboot.modules.base.model.TRoleDepartment;
import com.garry.zboot.modules.base.service.RoleDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色部门接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class RoleDepartmentServiceImpl implements RoleDepartmentService {

    @Autowired
    private TRoleDepartmentDao roleDepartmentDao;

    @Override
    public TRoleDepartmentDao getRepository() {
        return roleDepartmentDao;
    }

    @Override
    public List<TRoleDepartment> findByRoleId(String roleId) {

        return roleDepartmentDao.findByRoleId(roleId);
    }

    @Override
    public void deleteByRoleId(String roleId) {

        roleDepartmentDao.deleteByRoleId(roleId);
    }

    @Override
    public void deleteByDepartmentId(String departmentId) {

        roleDepartmentDao.deleteByDepartmentId(departmentId);
    }
}