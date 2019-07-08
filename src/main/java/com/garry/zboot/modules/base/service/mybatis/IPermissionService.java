package com.garry.zboot.modules.base.service.mybatis;

import com.baomidou.mybatisplus.extension.service.IService;
import com.garry.zboot.modules.base.model.TPermission;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author Exrickx
 */
@CacheConfig(cacheNames = "userPermission")
public interface IPermissionService extends IService<TPermission> {

    /**
     * 通过用户id获取
     * @param userId
     * @return
     */
    @Cacheable(key = "#userId")
    List<TPermission> findByUserId(String userId);
}
