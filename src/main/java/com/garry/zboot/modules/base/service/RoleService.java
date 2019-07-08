package com.garry.zboot.modules.base.service;


import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TRole;

import java.util.List;

/**
 * 角色接口
 * @author Exrickx
 */
public interface RoleService extends ZbootBaseService<TRole,String> {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<TRole> findByDefaultRole(Boolean defaultRole);
}
