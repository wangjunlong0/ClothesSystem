package com.bdqn.entity;
/**
 * 库存表
 * @author 王骏龙
 *
 */
public class stock {
	private int stock_Id;//库存编号
	private shops shops;//商铺对象
	private clothes clothes;//商品对象（根据货号获取）
	private int clothes_Size;//尺码大小，1~5为M，L，XL，XXL，XXXL
	private String clothes_Color;//商品颜色
	private int clothes_Number;//库存数量
	public int getStock_Id() {
		return stock_Id;
	}
	public void setStock_Id(int stock_Id) {
		this.stock_Id = stock_Id;
	}
	public shops getShops() {
		return shops;
	}
	public void setShops(shops shops) {
		this.shops = shops;
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
	public int getClothes_Number() {
		return clothes_Number;
	}
	public void setClothes_Number(int clothes_Number) {
		this.clothes_Number = clothes_Number;
	}
	
	
}
