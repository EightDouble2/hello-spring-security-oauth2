package com.johnny.spring.security.oauth2.server.server;

import com.johnny.spring.security.oauth2.server.domain.TbUser;

public interface TbUserService{
    TbUser getByUsername(String username);
}
