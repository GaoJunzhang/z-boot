package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TDepartment;

import java.util.List;

/**
* class_name: TDepartmentDao
* package: com.garry.zboot.modules.base.dao
* describe: 部门数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 16:56
**/
public interface TDepartmentDao extends ZbootBaseDao<TDepartment,String> {
    /**
     *  通过父id获取 升序
     * @param parentId
     * @return
     */
    List<TDepartment> findByParentIdOrderBySortOrder(String parentId);

    /**
     * 通过父id获取 升序 数据权限
     * @param parentId
     * @param departmentIds
     * @return
     */
    List<TDepartment> findByParentIdAndIdInOrderBySortOrder(String parentId, List<String> departmentIds);

    /**
     * 通过父id和状态获取 升序
     * @param parentId
     * @param status
     * @return
     */
    List<TDepartment> findByParentIdAndStatusOrderBySortOrder(String parentId, Integer status);

    /**
     * 部门名模糊搜索 升序
     * @param title
     * @return
     */
    List<TDepartment> findByTitleLikeOrderBySortOrder(String title);

    /**
     * 部门名模糊搜索 升序 数据权限
     * @param title
     * @param departmentIds
     * @return
     */
    List<TDepartment> findByTitleLikeAndIdInOrderBySortOrder(String title, List<String> departmentIds);
}
