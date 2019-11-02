package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllMessages;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchMessageTypeService {
	/**
	 * 分类查询留言Service层
	 * @param index 当前页码
	 * @param sizePage 每页显示条数
	 * @param messageType 留言类型
	 * @return 返回实体类对象集合
	 */
	List<SelectAllMessages> searchMessageTypeService(int index, int sizePage, int messageType);
}
