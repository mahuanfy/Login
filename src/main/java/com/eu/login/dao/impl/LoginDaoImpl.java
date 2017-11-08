package com.eu.login.dao.impl;

import com.eu.login.dao.LoginDao;
import com.eu.login.entity.Login;
import com.eu.login.utils.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 马欢欢 on 17-11-6.
 */
public class LoginDaoImpl implements LoginDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    @Override
    public Login login(Login login) {
        Login user = new Login();
        try {
            //获取连接
            conn = JdbcUtil.getConnect();
            //写sql文件
            String sql = "select * from login where username = ? and password = ?";
            //创建执行任务

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, login.getUsername());
            pstmt.setString(2, login.getPassword());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                //取得用户名
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, pstmt, conn);
        }
        return null;
    }

    @Override
    public void register(Login login) {
        try {
            //获取连接
            conn = JdbcUtil.getConnect();

            String sql = "insert into login (username,password,sex) values(?,?,?)";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, login.getUsername());
            pstmt.setString(2, login.getPassword());
            pstmt.setString(3, login.getSex());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(pstmt, conn);
        }
    }
}
