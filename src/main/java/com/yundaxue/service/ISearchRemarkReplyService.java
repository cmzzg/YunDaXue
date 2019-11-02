package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchRemarkReplyService {
	/**
	 * 分页查询留言下的所有评论
	 * @param index 当前页码
	 * @param sizePage 每页的条数
	 * @param messageid 留言id
	 * @return 返回分页的评论内容
	 */
	List<SelectAllRemarksWithinMessage> searchRemark(int index, int sizePage, int messageid);
	
	/**
	 * 分页查询评论下的所有回复
	 * @param index 当前页码
	 * @param sizePage 每页条目数
	 * @param remarkid 评论id
	 * @return 返回分页的回复内容
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage,int remarkid);
}
