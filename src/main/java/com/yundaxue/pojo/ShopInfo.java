package com.yundaxue.pojo;

/**
 * 
 * @author zzg
 *
 */
public class ShopInfo{
	private Integer shop_id;
	private Integer user_id;
	private String shop_Name; 
	private String shop_Describe; 
	private String shop_Image; 
	private double shop_Price; 
	private double shop_Original_Price; 
	private String shop_Condition ;
	private Integer transaction_Info_Type;
	private String shop_release_time;
	private Integer shop_Show;
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getShop_Name() {
		return shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getShop_Describe() {
		return shop_Describe;
	}
	public void setShop_Describe(String shop_Describe) {
		this.shop_Describe = shop_Describe;
	}
	public String getShop_Image() {
		return shop_Image;
	}
	public void setShop_Image(String shop_Image) {
		this.shop_Image = shop_Image;
	}
	public double getShop_Price() {
		return shop_Price;
	}
	public void setShop_Price(double shop_Price) {
		this.shop_Price = shop_Price;
	}
	public double getShop_Original_Price() {
		return shop_Original_Price;
	}
	public void setShop_Original_Price(double shop_Original_Price) {
		this.shop_Original_Price = shop_Original_Price;
	}
	public String getShop_Condition() {
		return shop_Condition;
	}
	public void setShop_Condition(String shop_Condition) {
		this.shop_Condition = shop_Condition;
	}
	public Integer getTransaction_Info_Type() {
		return transaction_Info_Type;
	}
	public void setTransaction_Info_Type(Integer transaction_Info_Type) {
		this.transaction_Info_Type = transaction_Info_Type;
	}
	public String getShop_release_time() {
		return shop_release_time;
	}
	public void setShop_release_time(String shop_release_time) {
		this.shop_release_time = shop_release_time;
	}
	public Integer getShop_Show() {
		return shop_Show;
	}
	public void setShop_Show(Integer shop_Show) {
		this.shop_Show = shop_Show;
	}
	
}
