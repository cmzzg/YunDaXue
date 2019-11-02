package com.yundaxue.dao;

import com.yundaxue.pojo.RemarkInfo;
import com.yundaxue.pojo.ReplyInfo;

/**
 * 
 * @author zbx
 *
 */
public interface IPublishRemarkDao {
	/**
	 * 
	 * @param ri 评论的实体类对象
	 * @return 返回一个受影响行数
	 */
	int PublishRemarkDao(RemarkInfo ri);
	/**
	 * 
	 * @param rpl  回复的实体类对象
	 * @return 返回一个受影响行数
	 */
	int PublishReply(ReplyInfo rpl);
	
}
