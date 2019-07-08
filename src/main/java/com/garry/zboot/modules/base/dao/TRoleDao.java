package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TRole;

import java.util.List;

/**
* class_name: TRoleDao
* package: com.garry.zboot.modules.base.dao
* describe: 角色数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:12
**/
public interface TRoleDao extends ZbootBaseDao<TRole,String> {
    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<TRole> findByDefaultRole(Boolean defaultRole);
}
