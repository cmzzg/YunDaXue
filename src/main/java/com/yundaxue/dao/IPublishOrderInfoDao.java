package com.yundaxue.dao;

import com.yundaxue.pojo.OrderInfo;

/**
 * 生成订单信息Dao层
 * @author zbx,zzg
 *
 */
public interface IPublishOrderInfoDao {
	/**
	 * 把生成的订单信息写入数据库
	 * @param oi
	 * @return
	 */
	int publishOrderInfo(OrderInfo oi);
}
