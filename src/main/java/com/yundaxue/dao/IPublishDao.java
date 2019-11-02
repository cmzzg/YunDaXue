package com.yundaxue.dao;

import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;

/**
 * 所有类型的发布接口
 * @author ZZ
 *
 */
public interface IPublishDao {
	/**
	 * 把得到的留言表写入数据库
	 * @param message 留言信息实体类对象
	 * @return 受影响行数
	 */
	int publishMessageDao(Message message);
	/**
	 * 失物招领Dao把数据写入数据库
	 * @param laf 失物招领实体类对象
	 * @return 受影响行数
	 */
	int publishLostFoundDao(LostAndFound laf);
	/**
	 * 发布二手交易写入数据库
	 * @param si 二手交易实体类对象
	 * @return 返回受影响行数
	 */
	int publishTransactionDao(ShopInfo si);
	
	/**
	 * 发布活动或通知（仅特殊账号可以发布）
	 * @param ai 活动或通知实体类对象
	 * @return 返回受影响行数
	 */
	int publishActivityDao(ActivityInfo ai);
}
