package com.garry.zboot.modules.base.service;


import com.garry.zboot.base.ZbootBaseService;
import com.garry.zboot.modules.base.model.TUser;
import com.garry.zboot.modules.base.vo.SearchVo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 用户接口
 * @author Exrickx
 */
@CacheConfig(cacheNames = "user")
public interface UserService extends ZbootBaseService<TUser,String> {

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    @Cacheable(key = "#username")
    TUser findByUsername(String username);

    /**
     * 通过手机获取用户
     * @param mobile
     * @return
     */
    TUser findByMobile(String mobile);

    /**
     * 通过邮件和状态获取用户
     * @param email
     * @return
     */
    TUser findByEmail(String email);

    /**
     * 多条件分页获取用户
     * @param user
     * @param searchVo
     * @param pageable
     * @return
     */
    Page<TUser> findByCondition(TUser user, SearchVo searchVo, Pageable pageable);

    /**
     * 通过部门id获取
     * @param departmentId
     * @return
     */
    List<TUser> findByDepartmentId(String departmentId);
}
