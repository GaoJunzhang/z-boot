package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TDictData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 字典数据接口
 * @author Exrick
 */
public interface DictDataService extends ZbootBaseService<TDictData,String> {

    /**
     * 多条件获取
     * @param dictData
     * @param pageable
     * @return
     */
    Page<TDictData> findByCondition(TDictData dictData, Pageable pageable);

    /**
     * 通过dictId获取启用字典 已排序
     * @param dictId
     * @return
     */
    List<TDictData> findByDictId(String dictId);

    /**
     * 通过dictId删除
     * @param dictId
     */
    void deleteByDictId(String dictId);
}