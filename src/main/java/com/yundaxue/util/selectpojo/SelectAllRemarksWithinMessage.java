package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

/**
 * 查询留言中的所有评论，包括评论用户名，评论时间，评论正文，评论id
 * @author zbx
 *
 */
public class SelectAllRemarksWithinMessage {
	private String user_name;
	private Timestamp remark_creatime;
	private String remark_content;
	private Integer remark_id;
	private String remark_image;
	public String getRemark_image() {
		return remark_image;
	}
	public void setRemark_image(String remark_image) {
		this.remark_image = remark_image;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String remark_user_name) {
		this.user_name = remark_user_name;
	}
	public Timestamp getRemark_creatime() {
		return remark_creatime;
	}
	public void setRemark_creatime(Timestamp remark_creatime) {
		this.remark_creatime = remark_creatime;
	}
	public String getRemark_content() {
		return remark_content;
	}
	public void setRemark_content(String remark_content) {
		this.remark_content = remark_content;
	}
	public Integer getRemark_id() {
		return remark_id;
	}
	public void setRemark_id(Integer remark_id) {
		this.remark_id = remark_id;
	}
	
}
