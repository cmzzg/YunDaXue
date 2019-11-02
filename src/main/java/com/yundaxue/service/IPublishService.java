package com.yundaxue.service;

import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;

/**
 * 所有发布内容的Service层
 * @author ZZ
 *
 */
public interface IPublishService {
	
	/**
	 * 
	 * @param mag message实体类
	 * @return 发布结果
	 */
	String publishMessageService(Message mag);
	/**
	 * 
	 * @param laf LostAndFound实体类
	 * @return 发布结果
	 */
	String LostFoundService(LostAndFound laf);
	/**
	 * 
	 * @param si ShopInfo实体类
	 * @return 发布结果
	 */
	String publishTransactionService(ShopInfo si);
	/**
	 * 
	 * @param ai ActivityInfo实体类
	 * @return 发布结果
	 */
	String publishActivityService(ActivityInfo ai);

}
