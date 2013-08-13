package com.ucclub.model;

import java.io.Serializable;
import java.util.Date;

public class Members implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1662291918279408723L;
	private Integer mid;  //用户id
	private String memberid; //用户名
	private String password;  //密码
	private String email;  //邮件 
	private String mobile; //手机
	private Integer status; //状态
	private Date registertime; //注册时间
	private Date lastlogintime;//最后登录时间
	private String nickname;//呢称
	private Integer memberaccount;//余额
	private Date accountupdate;//账户更新时间
	private Integer points;//积分
	private Date pointsupdate;//积分更新时间
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getRegistertime() {
		return registertime;
	}
	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}
	public Date getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getMemberaccount() {
		return memberaccount;
	}
	public void setMemberaccount(Integer memberaccount) {
		this.memberaccount = memberaccount;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Date getAccountupdate() {
		return accountupdate;
	}
	public void setAccountupdate(Date accountupdate) {
		this.accountupdate = accountupdate;
	}
	public Date getPointsupdate() {
		return pointsupdate;
	}
	public void setPointsupdate(Date pointsupdate) {
		this.pointsupdate = pointsupdate;
	}
	
	
}
