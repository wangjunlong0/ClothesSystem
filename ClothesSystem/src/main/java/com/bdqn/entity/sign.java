package com.bdqn.entity;
/**
 * 员工签到情况表
 * @author 王骏龙
 *
 */
public class sign {
	private int sign_id;//签到表编号
	private waiter waiter;//员工对象
	private String sign_data;//签到日期
	private int sign_Type;//签到类型，1上班，0请假
	private String sign_Comments;//备注（选填）
	public int getSign_id() {
		return sign_id;
	}
	public void setSign_id(int sign_id) {
		this.sign_id = sign_id;
	}
	public waiter getWaiter() {
		return waiter;
	}
	public void setWaiter(waiter waiter) {
		this.waiter = waiter;
	}
	public String getSign_data() {
		return sign_data;
	}
	public void setSign_data(String sign_data) {
		this.sign_data = sign_data;
	}
	public int getSign_Type() {
		return sign_Type;
	}
	public void setSign_Type(int sign_Type) {
		this.sign_Type = sign_Type;
	}
	public String getSign_Comments() {
		return sign_Comments;
	}
	public void setSign_Comments(String sign_Comments) {
		this.sign_Comments = sign_Comments;
	}
	
}
