package com.ucclub.model;

import java.util.Date;

public class MemberValify {

	private Integer verifyid; //验证id
	private String verifycode;//Random(6位)
	private String memberid;//(用户名|邮箱|手机)
	private Date verifytime;//请求验证时间
	private Date validtime;//有效期截止时间
	private Integer valifytype;// 0 密码找回 1邮箱验证 2手机验证
	private Integer status;//0状态 1 失效
	
	public Integer getVerifyid() {
		return verifyid;
	}
	public void setVerifyid(Integer verifyid) {  
		this.verifyid = verifyid;
	}
	public String getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public Date getVerifytime() {
		return verifytime;
	}
	public void setVerifytime(Date verifytime) {
		this.verifytime = verifytime;
	}
	public Date getValidtime() {
		return validtime;
	}
	public void setValidtime(Date validtime) {
		this.validtime = validtime;
	}
	public Integer getValifytype() {
		return valifytype;
	}
	public void setValifytype(Integer valifytype) {
		this.valifytype = valifytype;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
