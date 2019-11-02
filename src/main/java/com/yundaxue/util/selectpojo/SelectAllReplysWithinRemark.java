package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

/**
 * 某条评论下的所有留言，包括留言用户名，留言目标用户名，留言内容，留言时间
 * @author zbx
 *
 */
public class SelectAllReplysWithinRemark {
	private String reply_user_name;
	private String reply_user_target_name;
	private String reply_content;
	private Timestamp reply_creatime;
	private Integer reply_user_id;
	private Integer reply_target_user_id; 
	public String getReply_user_name() {
		return reply_user_name;
	}
	public void setReply_user_name(String reply_user_name) {
		this.reply_user_name = reply_user_name;
	}
	public String getReply_user_target_name() {
		return reply_user_target_name;
	}
	public void setReply_user_target_name(String reply_user_target_name) {
		this.reply_user_target_name = reply_user_target_name;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Timestamp getReply_creatime() {
		return reply_creatime;
	}
	public void setReply_creatime(Timestamp reply_creatime) {
		this.reply_creatime = reply_creatime;
	}
	public Integer getReply_user_id() {
		return reply_user_id;
	}
	public void setReply_user_id(Integer reply_user_id) {
		this.reply_user_id = reply_user_id;
	}
	public Integer getReply_target_user_id() {
		return reply_target_user_id;
	}
	public void setReply_target_user_id(Integer reply_target_user_id) {
		this.reply_target_user_id = reply_target_user_id;
	}
	
	
}
