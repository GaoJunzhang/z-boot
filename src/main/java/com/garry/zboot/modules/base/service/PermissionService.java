package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TPermission;

import java.util.List;

/**
 * 权限接口
 * @author Exrick
 */
public interface PermissionService extends ZbootBaseService<TPermission,String> {

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