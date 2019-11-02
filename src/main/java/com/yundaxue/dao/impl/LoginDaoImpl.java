package com.yundaxue.dao.impl;

import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.ILoginDao;
import com.yundaxue.pojo.UserInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDaoImpl implements ILoginDao {
    @Override
    public int login(UserInfo ui) {
        int count = -1;
        Connection conn = BaseDao.getConn();
        PreparedStatement pstat = null;
        String sql = "INSERT INTO user_info ( `user_avatar`, `user_gender_id`, `user_nickname`) VALUES ( ?, ?, ?)";
        try {
            pstat = conn.prepareStatement(sql);
            pstat.setString(3,ui.getUser_nickname());
            pstat.setInt(2,ui.getUser_gender_id());
            pstat.setString(1,ui.getUser_avatar());
            count = pstat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null,pstat,conn);
        }
        return count;
    }
}
