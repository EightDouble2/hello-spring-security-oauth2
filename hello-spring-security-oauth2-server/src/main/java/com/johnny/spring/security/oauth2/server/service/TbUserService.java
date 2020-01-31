package com.johnny.spring.security.oauth2.server.service;

import com.johnny.spring.security.oauth2.server.domain.TbUser;

public interface TbUserService{
    TbUser getByUsername(String username);
}
