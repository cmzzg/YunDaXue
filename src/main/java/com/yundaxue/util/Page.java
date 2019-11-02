package com.yundaxue.util;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author ZZG
 *
 */
public class Page {
	private Integer totalCount;   //总记录数
	private Integer index; //当前页码
	private Integer pageCount; //总页码
	private Integer pageSize; //每页显示的信息行数
	private List<omnipotent> users = new ArrayList<omnipotent>();
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getPageCount() {
		return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
	}
//	public void setPageCount(Integer pageCount) {
//		this.pageCount = pageCount;
//	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<omnipotent> getUsers() {
		return users;
	}
	public void setUsers(List<omnipotent> users) {
		this.users = users;
	}
	
}
