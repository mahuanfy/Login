package com.eu.login.dao;

import com.eu.login.entity.Login;

/**
 * Created by 马欢欢 on 17-11-6.
 */
public interface LoginDao {

    /**
     * 登录
     * @param login
     * @return
     * @throws Exception
     */
    Login login(Login login)throws Exception;

    /**
     * 注册
     * @param login
     * @throws Exception
     */
    void register(Login login)throws Exception;
}
