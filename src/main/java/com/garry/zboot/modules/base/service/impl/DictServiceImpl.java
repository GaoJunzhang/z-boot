package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TDictDao;
import com.garry.zboot.modules.base.model.TDict;
import com.garry.zboot.modules.base.service.DictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 字典接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class DictServiceImpl implements DictService {

    @Autowired
    private TDictDao dictDao;

    @Override
    public TDictDao getRepository() {
        return dictDao;
    }

    @Override
    public List<TDict> findAllOrderBySortOrder() {

        return dictDao.findAllOrderBySortOrder();
    }

    @Override
    public TDict findByType(String type) {

        List<TDict> list = dictDao.findByType(type);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<TDict> findByTitleOrTypeLike(String key) {

        return dictDao.findByTitleOrTypeLike(key);
    }
}