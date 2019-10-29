package com.bdqn.entity;
/**
 * 商铺表
 * @author 王骏龙
 *
 */
public class shops {
	private int shop_Id;//商铺编号
	private String shop_Name;//商铺名称
	private String shop_Password;//商铺密码
	private String shop_Birthday;//商铺创立日期
	private String shop_Address;//商铺地址（选填）
	private String shop_Phone;//商铺联系电话（选填）
	public int getShop_Id() {
		return shop_Id;
	}
	public void setShop_Id(int shop_Id) {
		this.shop_Id = shop_Id;
	}
	public String getShop_Name() {
		return shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getShop_Password() {
		return shop_Password;
	}
	public void setShop_Password(String shop_Password) {
		this.shop_Password = shop_Password;
	}
	public String getShop_Birthday() {
		return shop_Birthday;
	}
	public void setShop_Birthday(String shop_Birthday) {
		this.shop_Birthday = shop_Birthday;
	}
	public String getShop_Address() {
		return shop_Address;
	}
	public void setShop_Address(String shop_Address) {
		this.shop_Address = shop_Address;
	}
	public String getShop_Phone() {
		return shop_Phone;
	}
	public void setShop_Phone(String shop_Phone) {
		this.shop_Phone = shop_Phone;
	}
	
	
}
