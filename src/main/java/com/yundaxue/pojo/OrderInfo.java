package com.yundaxue.pojo;
/**
 * 
 * @author zzg
 *
 */
public class OrderInfo extends Object {
	private Integer order_id;
	private Integer user_buyer_id;
	private Integer user_seller_id;
	private Integer shop_id;
	private Integer order_status;
	private String order_time; 
	private double order_price;
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getUser_buyer_id() {
		return user_buyer_id;
	}
	public void setUser_buyer_id(Integer user_buyer_id) {
		this.user_buyer_id = user_buyer_id;
	}
	public Integer getUser_seller_id() {
		return user_seller_id;
	}
	public void setUser_seller_id(Integer user_seller_id) {
		this.user_seller_id = user_seller_id;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
}
