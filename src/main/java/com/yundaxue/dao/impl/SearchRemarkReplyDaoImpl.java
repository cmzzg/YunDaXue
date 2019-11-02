package com.yundaxue.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.ISearchRemarkReplyDao;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author zbx
 *
 *
 */
public class SearchRemarkReplyDaoImpl implements ISearchRemarkReplyDao {
	
	public List<SelectAllRemarksWithinMessage> searchRemarkDao(int index, int sizePage, int messageId) {
		String sql = "SELECT user_info.user_name, remark_info.remark_id, remark_info.remark_image, remark_info.remark_content, remark_info.remark_creatime FROM user_info INNER JOIN remark_info ON remark_info.user_id = user_info.user_id WHERE remark_info.message_id = ? LIMIT ?, ?";
		PreparedStatement pstat = null;
		ResultSet rs =null;
		List<SelectAllRemarksWithinMessage> lsarwm = new ArrayList<SelectAllRemarksWithinMessage>();
		SelectAllRemarksWithinMessage sarwm = null;
		Connection conn = BaseDao.getConn();
		try{
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, messageId);
			pstat.setInt(2, (index - 1) * sizePage);
			pstat.setInt(3, sizePage);
			rs = pstat.executeQuery();
			while(rs.next()){
				sarwm = new SelectAllRemarksWithinMessage();
				sarwm.setUser_name(rs.getString("user_name"));
				sarwm.setRemark_id(rs.getInt("remark_id"));
				sarwm.setRemark_content(rs.getString("remark_content"));
				sarwm.setRemark_creatime(rs.getTimestamp("remark_creatime"));
				sarwm.setRemark_image(rs.getString("remark_image"));
				lsarwm.add(sarwm);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, pstat,conn);
		}
		return lsarwm;
	}

	public List<SelectAllReplysWithinRemark> searchReplyDao(int index, int sizePage, int remarkId) {
		String sql = "SELECT reply_info.reply_user_id, user_info.user_name, reply_info.reply_target_user_id, reply_info.reply_creatime, reply_info.reply_content FROM user_info INNER JOIN reply_info ON reply_info.reply_user_id = user_info.user_id WHERE reply_info.reply_father_id = ? LIMIT ?, ?";
		String sql1 = "SELECT user_info.user_name, reply_info.reply_target_user_id FROM user_info INNER JOIN reply_info ON reply_info.reply_target_user_id = user_info.user_id WHERE reply_info.reply_father_id = ? LIMIT ?, ?";
		PreparedStatement pstat  = null;
		ResultSet rs = null;
		List<SelectAllReplysWithinRemark> lsarwr = new ArrayList<SelectAllReplysWithinRemark>();
		SelectAllReplysWithinRemark sarwr = null;
		int i = -1;
		Connection conn = BaseDao.getConn();
		try{
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, remarkId);
			pstat.setInt(2, (index - 1) * sizePage);
			pstat.setInt(3, sizePage);
			rs = pstat.executeQuery();
			while(rs.next()){
				sarwr = new SelectAllReplysWithinRemark();
				sarwr.setReply_user_id(rs.getInt("reply_user_id"));
				sarwr.setReply_user_name(rs.getString("user_name"));
				sarwr.setReply_target_user_id(rs.getInt("reply_target_user_id"));
				sarwr.setReply_creatime(rs.getTimestamp("reply_creatime"));
				sarwr.setReply_content(rs.getString("reply_content"));
				lsarwr.add(sarwr);
			}
			pstat = BaseDao.getConn().prepareStatement(sql1);
			pstat.setInt(1, remarkId);
			pstat.setInt(2, (index - 1) * sizePage);
			pstat.setInt(3, sizePage);
			rs = pstat.executeQuery();
			while(rs.next()){
				i++;
				lsarwr.get(i).setReply_user_target_name(rs.getString("user_name"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, pstat,conn);
		}
		return lsarwr;
	}

	public List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage, int remarkid) {
		String sql = "SELECT user_info.user_name FROM user_info WHERE remark_info.message_id = ? LIMIT ?, ?";
		PreparedStatement pstat = null;
		ResultSet rs =null;
		List<SelectAllReplysWithinRemark> lsarwr = new ArrayList<SelectAllReplysWithinRemark>();
		SelectAllReplysWithinRemark sarwr = null;
		Connection conn = BaseDao.getConn();
		try{
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, remarkid);
			pstat.setInt(2, (index - 1) * sizePage);
			pstat.setInt(3, sizePage);
			rs = pstat.executeQuery();
			while(rs.next()){
				sarwr.setReply_user_name(rs.getString("user_name"));
				lsarwr.add(sarwr);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(rs,pstat,conn);
		}
		return lsarwr;
	}
}
