package com.yundaxue.dao.impl;

import java.sql.PreparedStatement;

import com.yundaxue.dao.BaseDao;
import java.sql.Connection;
import java.sql.SQLException;
import com.yundaxue.dao.IPublishDao;
import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;
/**
 * 
 * @author ZZ
 *
 */
public class PublishDaoImpl implements IPublishDao {

	@Override
	public int publishMessageDao(Message message) {
		String sql = "insert into message_info (message_id, user_id, message_type_id, message_image,message_creatime,message_title,message_content,like_number) values (?,?,?,?,?,?,?,?) ";
		Connection conn =BaseDao.getConn();
		int count = -1;
		PreparedStatement pstat =  null;
		try{
			conn.setAutoCommit(false);
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1,0);
			pstat.setInt(2,message.getUser_id());
			pstat.setInt(3, message.getMessage_type_id());
			pstat.setString(4, message.getMessage_image());
			pstat.setString(5, message.getMessage_creatime());
			pstat.setString(6, message.getMessage_title());
			pstat.setString(7, message.getMessage_content());
			pstat.setInt(8, message.getLike_number());
			count = pstat.executeUpdate();
			conn.commit();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, pstat,conn);
		}
		return count;
	}

	@Override
	public int publishLostFoundDao(LostAndFound laf) {
		Connection conn = BaseDao.getConn();
		int count = -1;
		PreparedStatement pstat = null;
		try {
			conn.setAutoCommit(false);
			String sql = "insert into lost_found_info (lost_found_id, user_id, lost_found_type_id, lost_found_title,lost_found_content,lost_found_image) VALUES (?,?,?,?,?,?)";
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1,0);
			pstat.setInt(2,laf.getUser_id());
			pstat.setInt(3, laf.getLost_found_type_id());
			pstat.setString(4,laf.getLost_found_title());
			pstat.setString(5, laf.getLost_found_content());
			pstat.setString(6, laf.getLost_found_image());
			count = pstat.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, pstat,conn);
		}
		
		return count;
	}

	public int publishTransactionDao(ShopInfo si){
		return 0;
	}

	public int publishActivityDao(ActivityInfo ai){
		return 0;
	}

}
