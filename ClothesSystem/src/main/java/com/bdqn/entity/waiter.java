package com.bdqn.entity;
/**
 * 营业员表
 * @author 王骏龙
 *
 */
public class waiter {
	private int waiter_Id;//员工id
	private String waiter_Name;//员工姓名
	private String waiter_Sex;//员工性别
	private int waiter_Type;//在职状态0请假，1在职。2离职	
	private shops shops;//所属店铺对象
	private String waiter_Birthday;//员工生日
	private String waiter_Phone;//员工联系电话
	public int getWaiter_Id() {
		return waiter_Id;
	}
	public void setWaiter_Id(int waiter_Id) {
		this.waiter_Id = waiter_Id;
	}
	public String getWaiter_Name() {
		return waiter_Name;
	}
	public void setWaiter_Name(String waiter_Name) {
		this.waiter_Name = waiter_Name;
	}
	public String getWaiter_Sex() {
		return waiter_Sex;
	}
	public void setWaiter_Sex(String waiter_Sex) {
		this.waiter_Sex = waiter_Sex;
	}
	public int getWaiter_Type() {
		return waiter_Type;
	}
	public void setWaiter_Type(int waiter_Type) {
		this.waiter_Type = waiter_Type;
	}
	public shops getShops() {
		return shops;
	}
	public void setShops(shops shops) {
		this.shops = shops;
	}
	public String getWaiter_Birthday() {
		return waiter_Birthday;
	}
	public void setWaiter_Birthday(String waiter_Birthday) {
		this.waiter_Birthday = waiter_Birthday;
	}
	public String getWaiter_Phone() {
		return waiter_Phone;
	}
	public void setWaiter_Phone(String waiter_Phone) {
		this.waiter_Phone = waiter_Phone;
	}
	
	
}
