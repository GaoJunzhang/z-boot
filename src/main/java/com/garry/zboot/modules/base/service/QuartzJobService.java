package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TQuartzJob;

import java.util.List;

/**
 * 定时任务接口
 * @Author gaojunzhang
 * @Date 2019/7/8 23:28
 */
public interface QuartzJobService extends ZbootBaseService<TQuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<TQuartzJob> findByJobClassName(String jobClassName);
}