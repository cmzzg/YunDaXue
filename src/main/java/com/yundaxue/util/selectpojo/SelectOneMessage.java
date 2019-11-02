package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

/**
 * 进入留言后显示的内容，留言的用户名，留言的标题，留言的创建时间，留言的正文，点赞数。
 * @author zbx
 *
 */
public class SelectOneMessage {
	private String user_name;
	private String message_title;
	private Timestamp message_creatime;
	private String message_content;
	private Integer like_num;
	private Integer message_id;
	public Integer getLike_num() {
		return like_num;
	}
	public void setLike_num(Integer like_num) {
		this.like_num = like_num;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getMessage_title() {
		return message_title;
	}
	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}
	public Timestamp getMessage_creatime() {
		return message_creatime;
	}
	public void setMessage_creatime(Timestamp message_creatime) {
		this.message_creatime = message_creatime;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	
}
