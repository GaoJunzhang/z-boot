package com.garry.zboot.modules.base.service;

import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TDepartmentHeader;

import java.util.List;

/**
 * 部门负责人接口
 * @author Exrick
 */
public interface DepartmentHeaderService extends ZbootBaseService<TDepartmentHeader,String> {

    /**
     * 通过部门和负责人类型获取
     * @param departmentId
     * @param type
     * @return
     */
    List<String> findHeaderByDepartmentId(String departmentId, Integer type);

    /**
     * 通过部门id删除
     * @param departmentId
     */
    void deleteByDepartmentId(String departmentId);

    /**
     * 通过userId删除
     * @param userId
     */
    void deleteByUserId(String userId);
}