package com.yundaxue.pojo;

/**
 * 评论实体类
 * @author zbx
 *
 */
public class RemarkInfo {
	private Integer remark_id;
	private String remark_image;
	private Integer user_id;
	private String remark_creatime;
	private String remark_content;
	private Integer message_id;
	public Integer getRemark_id() {
		return remark_id;
	}
	public void setRemark_id(Integer remark_id) {
		this.remark_id = remark_id;
	}
	public String getRemark_image() {
		return remark_image;
	}
	public void setRemark_image(String remark_image) {
		this.remark_image = remark_image;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getRemark_creatime() {
		return remark_creatime;
	}
	public void setRemark_creatime(String remark_creatime) {
		this.remark_creatime = remark_creatime;
	}
	public String getRemark_content() {
		return remark_content;
	}
	public void setRemark_content(String remark_content) {
		this.remark_content = remark_content;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
}
