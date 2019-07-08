package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TRoleDepartment;

import java.util.List;

/**
* class_name: TRoleDepartmentDao
* package: com.garry.zboot.modules.base.dao
* describe: 角色部门数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:14
**/
public interface TRoleDepartmentDao extends ZbootBaseDao<TRoleDepartment,String> {
    /**
     * 通过roleId获取
     * @param roleId
     * @return
     */
    List<TRoleDepartment> findByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param roleId
     */
    void deleteByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param departmentId
     */
    void deleteByDepartmentId(String departmentId);
}
