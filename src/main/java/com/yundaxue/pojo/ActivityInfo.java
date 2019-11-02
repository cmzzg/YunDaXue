package com.yundaxue.pojo;


/**
 * 
 * @author ZZG
 *
 */
public class ActivityInfo {
	private Integer activity_id;
	private Integer college_id;
	private String issue_theme;
	private String issue_content;
	private String issue_address;
	private Integer issue_quantity;//ÈËÊý
	private Integer issue_grade;
	private String issue_degin_time;
	public Integer getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(Integer activity_id) {
		this.activity_id = activity_id;
	}
	public Integer getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}
	public String getIssue_theme() {
		return issue_theme;
	}
	public void setIssue_theme(String issue_theme) {
		this.issue_theme = issue_theme;
	}
	public String getIssue_content() {
		return issue_content;
	}
	public void setIssue_content(String issue_content) {
		this.issue_content = issue_content;
	}
	public String getIssue_address() {
		return issue_address;
	}
	public void setIssue_address(String issue_address) {
		this.issue_address = issue_address;
	}
	public Integer getIssue_quantity() {
		return issue_quantity;
	}
	public void setIssue_quantity(Integer issue_quantity) {
		this.issue_quantity = issue_quantity;
	}
	public Integer getIssue_grade() {
		return issue_grade;
	}
	public void setIssue_grade(Integer issue_grade) {
		this.issue_grade = issue_grade;
	}
	public String getIssue_degin_time() {
		return issue_degin_time;
	}
	public void setIssue_degin_time(String issue_degin_time) {
		this.issue_degin_time = issue_degin_time;
	}
	public String getIssue_end_time() {
		return issue_end_time;
	}
	public void setIssue_end_time(String issue_end_time) {
		this.issue_end_time = issue_end_time;
	}
	private String issue_end_time;
	
}
