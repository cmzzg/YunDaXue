package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author zbx
 *
 */
public interface ISearchMessageService {
	/**
	 * 显示留言
	 * @param index 当前页码
	 * @param sizePage 一页显示的条目数
	 * @return 万能实体类集合
	 */
	List<SelectAllMessages> searchMessage(int index,int sizePage);
	/**
	 * 显示评论
	 * @param index 当前页码
	 * @param sizePage 一页显示的条目数
	 * @param messageId 留言id
	 * @return 万能实体类集合
	 */
	List<SelectAllRemarksWithinMessage> searchRemark(int index,int sizePage,int messageId);
	/**
	 * 显示回复
	 * @param index 当前页码
	 * @param sizePage 一页显示的条目数
	 * @param remarkId 评论id
	 * @return 万能实体类集合
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage,int remarkId);
	/**
	 * 显示失物招领
	 * @param index 当前页码
	 * @param sizePage 一页显示的条目数
	 * @return 万能实体类集合
	 */
	List<omnipotent> searchLostFound(int index, int sizePage);
	
	
}
