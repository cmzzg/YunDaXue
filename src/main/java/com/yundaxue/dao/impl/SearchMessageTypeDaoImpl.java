package com.yundaxue.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.ISearchMessageTypeDao;
import com.yundaxue.util.selectpojo.SelectAllMessages;
/**
 * 
 * @author ZZG
 *
 */
public class SearchMessageTypeDaoImpl implements ISearchMessageTypeDao {

	public List<SelectAllMessages> searchMessageType(int index, int sizePage, int typeid) {
		String sql = "SELECT message_info.message_id, message_info.message_title, message_info.message_creatime, user_info.user_name FROM user_info INNER JOIN message_info ON message_info.user_id = user_info.user_id WHERE message_info.message_type_id = ? ORDER BY message_info.message_id DESC LIMIT ?,?";
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<SelectAllMessages> lsam = new ArrayList<SelectAllMessages>();
		SelectAllMessages sam = null;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1,typeid);
			pstat.setInt(2, (index - 1) * sizePage);
			pstat.setInt(3, sizePage);
			rs = pstat.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(rs, pstat,conn);
		}
		return lsam;
	}

}
