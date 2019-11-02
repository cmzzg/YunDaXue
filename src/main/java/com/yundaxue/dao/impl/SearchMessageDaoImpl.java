package com.yundaxue.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.ISearchDao;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.ShopInfo;
import com.yundaxue.pojo.UserInfo;
import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;
/**
 * 
 * @author ZZG
 *
 */
public class SearchMessageDaoImpl implements ISearchDao {

	public int getCount(String tableName){
		String sql = "select count(1) from " + tableName;
		ResultSet rs = null ;
		int count = -1;
		PreparedStatement pstat =null;
		Connection conn = BaseDao.getConn();
		try {
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, pstat,conn);
		}
		return count;
	}
	
	public int getCountByRequirement(int typeid, String tableName, String requirementName){
		int count = -1;
		ResultSet rs = null ;
		PreparedStatement pstat =null;
		Connection conn = BaseDao.getConn();
		try {
			String sql = "select count(1) from "+  tableName  +" where "+  requirementName  +" = ?";
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, typeid);
			rs = pstat.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, pstat,conn);
		}
		return count;
	}
	
	public List<SelectAllMessages> searchMessage( int index, int sizePage) {
		String sql = "SELECT user_info.user_nickname," +
				"user_info.user_avatar ," +
				"message_info.message_type_id ," +
				"message_info.message_image ," +
				"message_info.message_creatime , " +
				"message_info.message_title , " +
				"message_info.message_id ," +
				"message_info.message_content ,"+
				"message_info.like_id"+
				" FROM message_info INNER JOIN user_info ON message_info.user_id = user_info.user_id ORDER BY message_info.message_id DESC LIMIT ?,?";
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<SelectAllMessages> lsam = new ArrayList<SelectAllMessages>();
		SelectAllMessages sam = null;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, (index - 1) * sizePage);
			pstat.setInt(2, sizePage);
			rs = pstat.executeQuery();
			while (rs.next()) {
				sam = new SelectAllMessages();
				sam.setMessage_id(rs.getInt("message_id"));
				sam.setMessage_title(rs.getString("message_title"));
				sam.setMessage_creatime(rs.getTimestamp("message_creatime"));
				sam.setUser_nickname(rs.getString("user_nickname"));
				sam.setAvatatUrl(rs.getString("user_avatar"));
				sam.setMessage_type_id(rs.getInt("message_type_id"));
				sam.setMessage_image(rs.getString("message_image"));
				sam.setMessage_content(rs.getString("message_content"));
				sam.setLike_id(rs.getInt("like_id"));
				lsam.add(sam);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(rs, pstat,conn);
		}
		return lsam;
	}

	public List<omnipotent> searchLostFound(int index, int sizePage) {
		List<omnipotent> lm = new ArrayList<omnipotent>();
		String sql = "SELECT user_info.user_name,lost_found_info.lost_found_content,lost_found_info.lost_found_type,lost_found_info.lost_found_title,lost_found_info.lost_found_id,user_info.user_id,lost_found_info.lost_found_image FROM lost_found_info INNER JOIN user_info ON lost_found_info.user_id = user_info.user_id ORDER BY lost_found_info.lost_found_id DESC LIMIT ?,?";
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		ResultSet rs = null;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, (index - 1)* sizePage);
			pstat.setInt(2, sizePage);
			rs = pstat.executeQuery();
			while (rs.next()) {
				omnipotent op =new omnipotent();
				LostAndFound laf = new LostAndFound();
				UserInfo ui = new UserInfo();
				laf.setLost_found_title(rs.getString("lost_found_title"));
				laf.setLost_found_type_id(rs.getInt("lost_found_type"));
				laf.setLost_found_image(rs.getString("lost_found_image"));
				laf.setLost_found_id(rs.getInt("lost_found_id"));
				laf.setLost_found_content(rs.getString("lost_found_content"));
				ui.setUser_name(rs.getString("user_name"));
				ui.setUser_id(rs.getInt("user_id"));
				op.setLaf(laf);
				op.setUi(ui);
				lm.add(op);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(null,pstat,conn);
		}
		return lm;
	}

	public List<omnipotent> searchActivity(int index, int sizePage) {
		return null;
	}

public List<omnipotent> searchShopInfo(int index, int sizePage){
	String sql = "SELECT shop_info.shop_image,shop_info.shop_price,shop_info.shop_original_prices,shop_info.transaction_type_id,transaction_type.tansaction_type_data,shop_info.shop_release_time,shop_info.shop_title,shop_info.shop_id,shop_info.shop_seller FROM shop_info INNER JOIN user_info ON shop_info.shop_seller = user_info.user_id INNER JOIN transaction_type ON shop_info.transaction_type_id = transaction_type.type_id WHERE shop_info.shop_show = 1 ORDER BY shop_info.shop_id DESC LIMIT ?,?";
	Connection conn = BaseDao.getConn();
	PreparedStatement pstat = null;
	ResultSet rs = null;
	List<omnipotent> lm = new ArrayList<omnipotent>();
	try {
		pstat = conn.prepareStatement(sql);
		pstat.setInt(1, (index - 1) * sizePage);
		pstat.setInt(2, sizePage);
		rs = pstat.executeQuery();
		while (rs.next()) {
			omnipotent op =new omnipotent();
			ShopInfo si = new ShopInfo();
			UserInfo ui = new UserInfo();
			si.setShop_Image(rs.getString("shop_image"));
			si.setShop_Price(rs.getDouble("shop_Price"));
			si.setShop_Original_Price(rs.getDouble("shop_original_prices"));
			si.setTransaction_Info_Type(rs.getInt("transaction_type_id"));
			ui.setUser_name(rs.getString("user_name"));
			System.out.println(rs.getString("message_image"));
			op.setSi(si);
			op.setUi(ui);
			lm.add(op);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		BaseDao.closeAll(rs, pstat,conn);
	}
	return lm;
	}
}
