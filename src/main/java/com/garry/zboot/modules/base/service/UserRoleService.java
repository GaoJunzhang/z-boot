package com.garry.zboot.modules.base.service;


import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TUserRole;

import java.util.List;

/**
 * 用户角色接口
 * @Author gaojunzhang
 * @Date 2019/7/8 23:29
 */
public interface UserRoleService extends ZbootBaseService<TUserRole,String> {

    /**
     * 通过roleId查找
     * @param roleId
     * @return
     */
    List<TUserRole> findByRoleId(String roleId);

    /**
     * 删除用户角色
     * @param userId
     */
    void deleteByUserId(String userId);
}
