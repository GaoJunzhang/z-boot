package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TRolePermission;

import java.util.List;

public interface TRolePermissionDao extends ZbootBaseDao<TRolePermission,String> {
    /**
     * 通过permissionId获取
     * @param permissionId
     * @return
     */
    List<TRolePermission> findByPermissionId(String permissionId);

    /**
     * 通过roleId获取
     * @param roleId
     */
    List<TRolePermission> findByRoleId(String roleId);

    /**
     * 通过roleId删除
     * @param roleId
     */
    void deleteByRoleId(String roleId);
}
