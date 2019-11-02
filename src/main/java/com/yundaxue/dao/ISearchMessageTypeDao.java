package com.yundaxue.dao;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllMessages;

public interface ISearchMessageTypeDao {
	/**
	 * 按照类别分页查询留言
	 * @param index 当前页码
	 * @param sizePage 一页的留言条数
	 * @param messageType 留言类型
	 * @return
	 */
	List<SelectAllMessages> searchMessageType(int index, int sizePage, int messageType);
}
