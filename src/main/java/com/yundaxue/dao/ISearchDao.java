package com.yundaxue.dao;

import java.util.List;

/*import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;*/
import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;

public interface ISearchDao {
	/**
	 * 分页展示所有留言信息
	 * @param index  当前页码
	 * @param sizePage  每页几条信息
	 * @return 留言类型的实体类集合
	 */
	List<SelectAllMessages> searchMessage(int index,int sizePage);
	/**
	 * 分页展示所有二手商品信息
	 * @param index  当前页码
	 * @param sizePage  每页几条信息
	 * @return 商品类型的实体类集合
	 */
	List<omnipotent> searchShopInfo(int index,int sizePage);
	/**
	 * 分页展示所有失物招领信息
	 * @param index  当前页码
	 * @param sizePage  每页几条信息
	 * @return 失物招领类型的实体类集合
	 */
	List<omnipotent> searchLostFound(int index,int sizePage);
	/**
	 * 分页查看所有活动
	 * @param index 当前页码
	 * @param sizePage 每页显示几条信息
	 * @return 活动类的实体类集合
	 */
	List<omnipotent> searchActivity(int index,int sizePage);
}
