package com.garry.zboot.modules.base.service.impl.mybatis;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.garry.zboot.modules.base.dao.mapper.PermissionMapper;
import com.garry.zboot.modules.base.model.TPermission;
import com.garry.zboot.modules.base.service.mybatis.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Exrickx
 */
@Service
public class IPermissionServiceImpl extends ServiceImpl<PermissionMapper, TPermission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<TPermission> findByUserId(String userId) {

        return permissionMapper.findByUserId(userId);
    }
}
