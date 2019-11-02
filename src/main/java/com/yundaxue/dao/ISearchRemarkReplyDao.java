package com.yundaxue.dao;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchRemarkReplyDao {
	/**
	 * 分页查询该留言下所有评论
	 * @param index 当前页数
	 * @param sizePage 每一页的条数
	 * @param messageId 这些评论所属留言id
	 * @return 查询到的实体类对象集合
	 */
	List<SelectAllRemarksWithinMessage> searchRemarkDao(int index, int sizePage, int messageId);

	/**
	 * 分页查询评论下的所有回复
	 * @param index 当前页数
	 * @param sizePage 每一页的条数
	 * @param remarkId 这些回复所属的评论id
	 * @return 查询到的实体类对象
	 */
	List<SelectAllReplysWithinRemark> searchReplyDao(int index, int sizePage, int remarkId);
	
	/**
	 * 分页查询该评论下所有回复
	 * @param index 当前页数
	 * @param sizePage 每一页的条数
	 * @param remarkid 这些回复所属的评论id
	 * @return 查询到的实体类对象
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage, int remarkid);

}