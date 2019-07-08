package com.garry.zboot.modules.base.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.garry.zboot.modules.base.model.TPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper extends BaseMapper<TPermission> {
    /**
     * 通过用户id获取
     * @param userId
     * @return
     */
    List<TPermission> findByUserId(@Param("userId") String userId);
}
