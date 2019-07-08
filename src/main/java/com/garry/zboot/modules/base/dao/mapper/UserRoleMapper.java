package com.garry.zboot.modules.base.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.garry.zboot.modules.base.model.TRole;
import com.garry.zboot.modules.base.model.TUserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper extends BaseMapper<TUserRole> {
    /**
     * 通过用户id获取
     * @param userId
     * @return
     */
    List<TRole> findByUserId(@Param("userId") String userId);

    /**
     * 通过用户id获取用户角色关联的部门数据
     * @param userId
     * @return
     */
    List<String> findDepIdsByUserId(@Param("userId") String userId);
}
