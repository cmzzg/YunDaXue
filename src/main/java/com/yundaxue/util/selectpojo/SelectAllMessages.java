package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

public class SelectAllMessages {
	private String user_nickname;       			//微信名
	private Integer message_id;         			//留言id,不给用户看
	private String message_title;                  //留言标题
	private Timestamp message_creatime;            //留言创建时间
	private  String avatatUrl;                     //微信头像保存路径
	private  String message_image;                 //留言照片保存路径
	private Integer message_type_id;               //留言的类型
	private  String message_content;               //留言正文
	private Integer like_id;						//点赞数

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public Integer getMessage_id() {
		return message_id;
	}

	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
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

	public String getAvatatUrl() {
		return avatatUrl;
	}

	public void setAvatatUrl(String avatatUrl) {
		this.avatatUrl = avatatUrl;
	}

	public String getMessage_image() {
		return message_image;
	}

	public void setMessage_image(String message_image) {
		this.message_image = message_image;
	}

	public Integer getMessage_type_id() {
		return message_type_id;
	}

	public void setMessage_type_id(Integer message_type_id) {
		this.message_type_id = message_type_id;
	}

	public Integer getLike_id() {
		return like_id;
	}

	public void setLike_id(Integer like_id) {
		this.like_id = like_id;
	}
}
