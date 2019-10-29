package com.bdqn.entity;
/**
 * 交易记录表
 * @author 王骏龙
 *
 */
public class transaction {
	private int transaction_Id;//交易单号
	private int SetId;//出货方用户编号
	private int GetId;//入货方用户编号（选填）
	private clothes clothes;//商品对象（根据货号获取）
	private int clothes_Size;//衣服尺码
	private String clothes_Color;//衣服颜色
	private int transaction_Number;//交易数量
	private String transaction_Day;//交易日期
	private int transaction_Type;//1调货0出售给客户
	private waiter waiter;//出售的营业员对象
	public int getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public int getSetId() {
		return SetId;
	}
	public void setSetId(int setId) {
		SetId = setId;
	}
	public int getGetId() {
		return GetId;
	}
	public void setGetId(int getId) {
		GetId = getId;
	}
	public clothes getClothes() {
		return clothes;
	}
	public void setClothes(clothes clothes) {
		this.clothes = clothes;
	}
	public int getClothes_Size() {
		return clothes_Size;
	}
	public void setClothes_Size(int clothes_Size) {
		this.clothes_Size = clothes_Size;
	}
	public String getClothes_Color() {
		return clothes_Color;
	}
	public void setClothes_Color(String clothes_Color) {
		this.clothes_Color = clothes_Color;
	}
	public int getTransaction_Number() {
		return transaction_Number;
	}
	public void setTransaction_Number(int transaction_Number) {
		this.transaction_Number = transaction_Number;
	}
	public String getTransaction_Day() {
		return transaction_Day;
	}
	public void setTransaction_Day(String transaction_Day) {
		this.transaction_Day = transaction_Day;
	}
	public int getTransaction_Type() {
		return transaction_Type;
	}
	public void setTransaction_Type(int transaction_Type) {
		this.transaction_Type = transaction_Type;
	}
	public waiter getWaiter() {
		return waiter;
	}
	public void setWaiter(waiter waiter) {
		this.waiter = waiter;
	}
	
	
}
