package com.johnny.spring.security.oauth2.server.server;

import com.johnny.spring.security.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectByUserId(Long id);
}
