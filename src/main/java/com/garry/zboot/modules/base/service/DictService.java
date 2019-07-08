package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TDict;

import java.util.List;

/**
 * 字典接口
 * @author Exrick
 */
public interface DictService extends ZbootBaseService<TDict,String> {

    /**
     * 排序获取全部
     * @return
     */
    List<TDict> findAllOrderBySortOrder();

    /**
     * 通过type获取
     * @param type
     * @return
     */
    TDict findByType(String type);

    /**
     * 模糊搜索
     * @param key
     * @return
     */
    List<TDict> findByTitleOrTypeLike(String key);
}