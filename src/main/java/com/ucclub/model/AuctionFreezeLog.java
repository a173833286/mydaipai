package com.ucclub.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 冻结金额使用日志
 * @author dll
 *
 */
public class AuctionFreezeLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438086529294966212L;
	private Integer logid;  //--serial  主键
	private String memberid; //--varchar(20) 用户id
	private String comment;  //---varchar(128) 描述
	private Date  createtime; //---timstamp default now()  创建时间
	private String autctionid;//---varchar(20)  代拍id
	private Integer beforemoney;
	private Integer usemoney; //---integer  使用的冻结金额
	private Integer logtype; // ----smallint   1 添加代拍金额，2使用代拍金额
	private Integer afterMoney; //---integer 添加或使用后的代拍金额,该记录后最终的代拍金额
	private String refid; //相关的支付订单号
	public Integer getLogid() {
		return logid;
	}
	public void setLogid(Integer logid) {
		this.logid = logid;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getAutctionid() {
		return autctionid;
	}
	public void setAutctionid(String autctionid) {
		this.autctionid = autctionid;
	}

	public Integer getLogtype() {
		return logtype;
	}
	public void setLogtype(Integer logtype) {
		this.logtype = logtype;
	}
	public Integer getAfterMoney() {
		return afterMoney;
	}
	public void setAfterMoney(Integer afterMoney) {
		this.afterMoney = afterMoney;
	}
	public String getRefid() {
		return refid;
	}
	public void setRefid(String refid) {
		this.refid = refid;
	}
	public Integer getBeforemoney() {
		return beforemoney;
	}
	public void setBeforemoney(Integer beforemoney) {
		this.beforemoney = beforemoney;
	}
	public Integer getUsemoney() {
		return usemoney;
	}
	public void setUsemoney(Integer usemoney) {
		this.usemoney = usemoney;
	}
	
	
	

}
