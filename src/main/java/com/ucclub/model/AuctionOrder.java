package com.ucclub.model;

import java.io.Serializable;
import java.util.Date;

public class AuctionOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2005871507527608549L;
	private Integer id; //--serial 主键id
	private String auctionid; //varchar(20) 代拍id
	private String imgurl; // varchar(256) 代拍链接 
	private String imglocation;// varchar(128) 代拍本地图片
	private String mername; //varchar(80)  商品名
	private String memberid; //varchar(20) 用户id
	private String sellerid; //varchar(30) 出品者id
	private Integer amount; //integer 数量 default 1
	private Integer freezemoney; //integer 冻结金额 
	private Integer mtype;//smallint用户类型 default 0 普通  1月度VIP 2 季度VIP 3半年VIP 4年度VIP 
	private Integer bidprice;//integer 出价 
	private Integer endprice; //integer 落扎价格
	private Integer serviceprice; //integer 代拍服务费
	private Integer deliveryprice; //integer 日本国内配送费
	private Integer bankprice;     //integer  银行手续费
	private Integer orderstatus;  //smallint 订单状态  0新订单  1代拍成功  2 代拍失败 3 代拍成功联系卖家中 4 支付中 5 支付成功 
	private Integer freezestatus; //smallint 冻结金额状态 0 正常 1不可用
	private Date createtime;     //timestamp default now()代拍时间
	private Date endtime;        //timestamp  代拍结束时间
	private String orderid;      //varchar(32)订单id 
	private String auctionuser;  //varchar(30)代拍用户
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuctionid() {
		return auctionid;
	}
	public void setAuctionid(String auctionid) {
		this.auctionid = auctionid;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getImglocation() {
		return imglocation;
	}
	public void setImglocation(String imglocation) {
		this.imglocation = imglocation;
	}
	public String getMername() {
		return mername;
	}
	public void setMername(String mername) {
		this.mername = mername;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getFreezemoney() {
		return freezemoney;
	}
	public void setFreezemoney(Integer freezemoney) {
		this.freezemoney = freezemoney;
	}
	public Integer getMtype() {
		return mtype;
	}
	public void setMtype(Integer mtype) {
		this.mtype = mtype;
	}
	public Integer getBidprice() {
		return bidprice;
	}
	public void setBidprice(Integer bidprice) {
		this.bidprice = bidprice;
	}
	public Integer getEndprice() {
		return endprice;
	}
	public void setEndprice(Integer endprice) {
		this.endprice = endprice;
	}
	public Integer getServiceprice() {
		return serviceprice;
	}
	public void setServiceprice(Integer serviceprice) {
		this.serviceprice = serviceprice;
	}
	public Integer getDeliveryprice() {
		return deliveryprice;
	}
	public void setDeliveryprice(Integer deliveryprice) {
		this.deliveryprice = deliveryprice;
	}
	public Integer getBankprice() {
		return bankprice;
	}
	public void setBankprice(Integer bankprice) {
		this.bankprice = bankprice;
	}
	public Integer getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}
	public Integer getFreezestatus() {
		return freezestatus;
	}
	public void setFreezestatus(Integer freezestatus) {
		this.freezestatus = freezestatus;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public void setAuctionuser(String auctionuser) {
		this.auctionuser = auctionuser;
	}
	public String getAuctionuser() {
		return auctionuser;
	}
	
	
	 

}
