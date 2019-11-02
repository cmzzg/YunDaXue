package com.yundaxue.pojo;

/**
 * 回复实体类
 * @author zbx
 *
 */
public class ReplyInfo {
	private Integer reply_id;
	private Integer remark_target_id;
	private Integer remark_target_type;
	private Integer reply_user_id;
	private String reply_creatime;
	private String reply_content;
	private Integer reply_target_user_id;
	private Integer reply_father_id;
	public Integer getReply_id() {
		return reply_id;
	}
	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}
	public Integer getRemark_target_id() {
		return remark_target_id;
	}
	public void setRemark_target_id(Integer remark_target_id) {
		this.remark_target_id = remark_target_id;
	}
	public Integer getRemark_target_type() {
		return remark_target_type;
	}
	public void setRemark_target_type(Integer remark_target_type) {
		this.remark_target_type = remark_target_type;
	}
	public Integer getReply_user_id() {
		return reply_user_id;
	}
	public void setReply_user_id(Integer reply_user_id) {
		this.reply_user_id = reply_user_id;
	}
	public String getReply_creatime() {
		return reply_creatime;
	}
	public void setReply_creatime(String reply_creatime) {
		this.reply_creatime = reply_creatime;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Integer getReply_target_user_id() {
		return reply_target_user_id;
	}
	public void setReply_target_user_id(Integer reply_target_user_id) {
		this.reply_target_user_id = reply_target_user_id;
	}
	public Integer getReply_father_id() {
		return reply_father_id;
	}
	public void setReply_father_id(Integer reply_father_id) {
		this.reply_father_id = reply_father_id;
	}
	
}
