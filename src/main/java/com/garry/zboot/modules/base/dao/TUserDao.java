package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TUser;

import java.util.List;

/**
* class_name: TUserDao
* package: com.garry.zboot.modules.base.dao
* describe: 用户数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:15
**/
public interface TUserDao extends ZbootBaseDao<TUser,String> {
    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    List<TUser> findByUsername(String username);

    /**
     * 通过手机获取用户
     * @param mobile
     * @return
     */
    List<TUser> findByMobile(String mobile);

    /**
     * 通过邮件获取用户
     * @param email
     * @return
     */
    List<TUser> findByEmail(String email);

    /**
     * 通过部门id获取
     * @param departmentId
     * @return
     */
    List<TUser> findByDepartmentId(String departmentId);
}
