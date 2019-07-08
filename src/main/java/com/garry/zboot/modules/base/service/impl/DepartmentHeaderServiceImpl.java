package com.garry.zboot.modules.base.service.impl;

import com.garry.zboot.modules.base.dao.TDepartmentHeaderDao;
import com.garry.zboot.modules.base.model.TDepartmentHeader;
import com.garry.zboot.modules.base.service.DepartmentHeaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门负责人接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class DepartmentHeaderServiceImpl implements DepartmentHeaderService {

    @Autowired
    private TDepartmentHeaderDao departmentHeaderDao;

    @Override
    public TDepartmentHeaderDao getRepository() {
        return departmentHeaderDao;
    }


    @Override
    public List<String> findHeaderByDepartmentId(String departmentId, Integer type) {

        List<String> list = new ArrayList<>();
        List<TDepartmentHeader> headers = departmentHeaderDao.findByDepartmentIdAndType(departmentId, type);
        headers.forEach(e->{
            list.add(e.getUserId());
        });
        return list;
    }

    @Override
    public void deleteByDepartmentId(String departmentId) {

        departmentHeaderDao.deleteByDepartmentId(departmentId);
    }

    @Override
    public void deleteByUserId(String userId) {

        departmentHeaderDao.deleteByUserId(userId);
    }
}