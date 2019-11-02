package com.yundaxue.dao;

import java.util.List;

import com.yundaxue.pojo.Message;

/**
 * 
 * @author zzg
 *
 */
public interface IGetCountDao {
	
	List<Message> searchMessageDao(String search, int index, int pageSize);
	
}
