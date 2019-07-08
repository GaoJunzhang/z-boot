package com.garry.zboot.modules.base.dao;

import com.garry.zboot.base.ZbootBaseDao;
import com.garry.zboot.modules.base.model.TQuartzJob;

import java.util.List;

public interface TQuartzJobDao extends ZbootBaseDao<TQuartzJob,String> {
    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<TQuartzJob> findByJobClassName(String jobClassName);
}
