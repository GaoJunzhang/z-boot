package com.garry.zboot.modules.base.service.mybatis;

import com.baomidou.mybatisplus.extension.service.IService;
import com.garry.zboot.modules.base.model.TRole;
import com.garry.zboot.modules.base.model.TUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
/**
 *
 * @Author gaojunzhang
 * @Date 2019/7/8 23:26
 */
@CacheConfig(cacheNames = "userRole")
public interface IUserRoleService extends IService<TUserRole> {

    /**
     * 通过用户id获取
     * @param userId
     * @return
     */
    @Cacheable(key = "#userId")
    List<TRole> findByUserId(@Param("userId") String userId);

    /**
     * 通过用户id获取用户角色关联的部门数据
     * @param userId
     * @return
     */
    @Cacheable(key = "'depIds:'+#userId")
    List<String> findDepIdsByUserId(String userId);
}
