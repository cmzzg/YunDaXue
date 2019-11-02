package com.yundaxue.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.IPublishRemarkDao;
import com.yundaxue.pojo.RemarkInfo;
import com.yundaxue.pojo.ReplyInfo;
/**
 * 
 * @author zbx
 *
 */
public class PublishRemarkDaoImpl implements IPublishRemarkDao {
	public int PublishRemarkDao(RemarkInfo ri) {
		String sql = "insert into remark_info values (?,?,?,?,?,?)";
		Connection conn =BaseDao.getConn();
		int count = -1;
		PreparedStatement pstat = null;
		try{
			conn.setAutoCommit(false);
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, 0);
			pstat.setString(2, ri.getRemark_image());
			pstat.setInt(3, ri.getUser_id());
			pstat.setString(4, ri.getRemark_creatime());
			pstat.setString(5, ri.getRemark_content());
			pstat.setInt(6, ri.getMessage_id());
			count = pstat.executeUpdate();
			conn.commit();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return count;
	}

	public int PublishReply(ReplyInfo rpl) {
		String sql = "insert into reply_info values (?,?,?,?,?,?,?,?)";
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		int count = -1;
		try{
			conn.setAutoCommit(false);
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, 0);
			pstat.setInt(2, rpl.getRemark_target_id());
			pstat.setInt(3, rpl.getRemark_target_type());
			pstat.setInt(4, rpl.getReply_user_id());
			pstat.setString(5, rpl.getReply_creatime());
			pstat.setString(6, rpl.getReply_content());
			pstat.setInt(7, rpl.getReply_target_user_id());
			pstat.setInt(8, rpl.getReply_father_id());
			count = pstat.executeUpdate();
			conn.commit();
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(null,pstat,conn);
		}
		return count;
	}

}
