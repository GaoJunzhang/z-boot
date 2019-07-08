package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TQuartzJobDao;
import com.garry.zboot.modules.base.model.TQuartzJob;
import com.garry.zboot.modules.base.service.QuartzJobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 定时任务接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class QuartzJobServiceImpl implements QuartzJobService {

    @Autowired
    private TQuartzJobDao quartzJobDao;

    @Override
    public TQuartzJobDao getRepository() {
        return quartzJobDao;
    }

    @Override
    public List<TQuartzJob> findByJobClassName(String jobClassName) {

        return quartzJobDao.findByJobClassName(jobClassName);
    }
}