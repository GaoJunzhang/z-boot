package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TRoleDao;
import com.garry.zboot.modules.base.model.Role;
import com.garry.zboot.modules.base.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色接口实现
 * @Author gaojunzhang
 * @Date 2019/7/8 23:26
 */
@Slf4j
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TRoleDao roleDao;

    @Override
    public TRoleDao getRepository() {
        return roleDao;
    }

    @Override
    public List<Role> findByDefaultRole(Boolean defaultRole) {
        return roleDao.findByDefaultRole(defaultRole);
    }
}
