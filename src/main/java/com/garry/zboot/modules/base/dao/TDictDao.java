package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TDict;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
* class_name: TDictDao
* package: com.garry.zboot.modules.base.dao
* describe: 数据字典处理
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:06
**/
public interface TDictDao extends ZbootBaseDao<TDict,String> {
    /**
     * 排序获取全部
     * @return
     */
    @Query(value = "select * from t_dict d order by d.sort_order", nativeQuery = true)
    List<TDict> findAllOrderBySortOrder();

    /**
     * 通过type获取
     * @param type
     * @return
     */
    List<TDict> findByType(String type);

    /**
     * 模糊搜索
     * @param key
     * @return
     */
    @Query(value = "select * from t_dict d where d.title like %:key% or d.type like %:key% order by d.sort_order", nativeQuery = true)
    List<TDict> findByTitleOrTypeLike(@Param("key") String key);
}