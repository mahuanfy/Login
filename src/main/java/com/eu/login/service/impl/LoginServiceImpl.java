package com.eu.login.service.impl;

import com.eu.login.dao.LoginDao;
import com.eu.login.dao.impl.LoginDaoImpl;
import com.eu.login.entity.Login;
import com.eu.login.service.LoginService;

/**
 * Created by 马欢欢 on 17-11-6.
 */
public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao = new LoginDaoImpl();

    @Override
    public Login login(Login login) throws Exception {
        Login user = loginDao.login(login);

        return user;
    }
}
