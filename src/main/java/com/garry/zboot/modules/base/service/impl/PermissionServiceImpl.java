package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TPermissionDao;
import com.garry.zboot.modules.base.model.TPermission;
import com.garry.zboot.modules.base.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 权限接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private TPermissionDao permissionDao;

    @Override
    public TPermissionDao getRepository() {
        return permissionDao;
    }

    @Override
    public List<TPermission> findByLevelOrderBySortOrder(Integer level) {

        return permissionDao.findByLevelOrderBySortOrder(level);
    }

    @Override
    public List<TPermission> findByParentIdOrderBySortOrder(String parentId) {

        return permissionDao.findByParentIdOrderBySortOrder(parentId);
    }

    @Override
    public List<TPermission> findByTypeAndStatusOrderBySortOrder(Integer type, Integer status) {

        return permissionDao.findByTypeAndStatusOrderBySortOrder(type, status);
    }

    @Override
    public List<TPermission> findByTitle(String title) {

        return permissionDao.findByTitle(title);
    }

    @Override
    public List<TPermission> findByTitleLikeOrderBySortOrder(String title) {

        return permissionDao.findByTitleLikeOrderBySortOrder(title);
    }
}