package com.yundaxue.pojo;
/**
 * 失物招领实体类
 * @author zbx
 *
 */
public class LostAndFound {
	private Integer lost_found_id;
	private Integer user_id;
	private Integer lost_found_type_id;
	private String lost_found_title;
	private String lost_found_content;
	private String lost_found_image;
	public Integer getLost_found_id() {
		return lost_found_id;
	}
	public void setLost_found_id(Integer lost_found_id) {
		this.lost_found_id = lost_found_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getLost_found_title() {
		return lost_found_title;
	}
	public void setLost_found_title(String lost_found_title) {
		this.lost_found_title = lost_found_title;
	}
	public String getLost_found_content() {
		return lost_found_content;
	}
	public void setLost_found_content(String lost_found_content) {
		this.lost_found_content = lost_found_content;
	}
	public String getLost_found_image() {
		return lost_found_image;
	}
	public void setLost_found_image(String lost_found_image) {
		this.lost_found_image = lost_found_image;
	}
	public int getLost_found_type_id() {
		return lost_found_type_id;
	}
	public void setLost_found_type_id(int lost_found_type_id) {
		this.lost_found_type_id = lost_found_type_id;
	}
	
}
