package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TDictData;

import java.util.List;

/**
* class_name: TDictDataDao
* package: com.garry.zboot.modules.base.dao
* describe: 字典数据数据处理层
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/8
* creat_time: 17:08
**/
public interface TDictDataDao extends ZbootBaseDao<TDictData,String> {
    /**
     * 通过dictId和状态获取
     * @param dictId
     * @param status
     * @return
     */
    List<TDictData> findByDictIdAndStatusOrderBySortOrder(String dictId, Integer status);

    /**
     * 通过dictId删除
     * @param dictId
     */
    void deleteByDictId(String dictId);
}
