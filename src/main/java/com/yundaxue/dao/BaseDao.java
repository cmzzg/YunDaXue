package com.yundaxue.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author zzg,zbx
 *
 */
public class BaseDao {
	private static Connection conn;
	private BaseDao(){

	}
	public static Connection getConn () {
		Context ctx = null;
		try {
			ctx = new InitialContext();
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/news");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeAll(ResultSet rs , Statement stat,Connection conn) {
		try {
			if(rs != null)
				rs.close();
			if(stat != null)
				stat.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
