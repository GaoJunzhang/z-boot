package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TQuartzJob;

import java.util.List;

/**
 * 定时任务接口
 * @author Exrick
 */
public interface QuartzJobService extends ZbootBaseService<TQuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<TQuartzJob> findByJobClassName(String jobClassName);
}