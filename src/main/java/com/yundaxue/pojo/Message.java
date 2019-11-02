package com.yundaxue.pojo;

/**
 * 留言的实体类
 * @author ZZ
 *
 */
public class Message {
	private Integer message_id;
	private Integer user_id;
	private Integer message_type_id;
	private String message_image;
	private String message_creatime;
	private String message_title;
	private String message_content;
	private Integer like_number; 
	
	public String getMessage_creatime() {
		return message_creatime;
	}
	public void setMessage_creatime(String message_creatime) {
		this.message_creatime = message_creatime;
	}
	public Integer getLike_number() {
		return like_number;
	}
	public void setLike_number(Integer like_number) {
		this.like_number = like_number;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getMessage_type_id() {
		return message_type_id;
	}
	public void setMessage_type_id(Integer message_type_id) {
		this.message_type_id = message_type_id;
	}
	public String getMessage_image() {
		return message_image;
	}
	public void setMessage_image(String message_image) {
		this.message_image = message_image;
	}
	public String getMessage_title() {
		return message_title;
	}
	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	
}
