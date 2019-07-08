package com.garry.zboot.modules.base.service.impl.mybatis;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.garry.zboot.modules.base.dao.mapper.UserRoleMapper;
import com.garry.zboot.modules.base.model.TRole;
import com.garry.zboot.modules.base.model.TUserRole;
import com.garry.zboot.modules.base.service.mybatis.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Exrickx
 */
@Service
public class IUserRoleServiceImpl extends ServiceImpl<UserRoleMapper, TUserRole> implements IUserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<TRole> findByUserId(String userId) {

        return userRoleMapper.findByUserId(userId);
    }

    @Override
    public List<String> findDepIdsByUserId(String userId) {

        return userRoleMapper.findDepIdsByUserId(userId);
    }
}
