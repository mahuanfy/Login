package com.eu.login.service;

import com.eu.login.entity.Login;

/**
 * Created by 马欢欢 on 17-11-6.
 */
public interface LoginService {
    /**
     * 登录
     * @param login
     * @return
     * @throws Exception
     */
    Login login(Login login)throws Exception;
}
