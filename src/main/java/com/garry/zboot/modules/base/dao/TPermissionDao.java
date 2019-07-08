package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TPermission;

import java.util.List;

/**
* class_name: TPermissionDao
* package: com.garry.zboot.modules.base.dao
* describe: 权限数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:09
**/
public interface TPermissionDao extends ZbootBaseDao<TPermission,String> {
    /**
     * 通过层级查找
     * 默认升序
     * @param level
     * @return
     */
    List<TPermission> findByLevelOrderBySortOrder(Integer level);

    /**
     * 通过parendId查找
     * @param parentId
     * @return
     */
    List<TPermission> findByParentIdOrderBySortOrder(String parentId);

    /**
     * 通过类型和状态获取
     * @param type
     * @param status
     * @return
     */
    List<TPermission> findByTypeAndStatusOrderBySortOrder(Integer type, Integer status);

    /**
     * 通过名称获取
     * @param title
     * @return
     */
    List<TPermission> findByTitle(String title);

    /**
     * 模糊搜索
     * @param title
     * @return
     */
    List<TPermission> findByTitleLikeOrderBySortOrder(String title);
}
