package com.ucclub.model;

import java.io.Serializable;

public class Privilege implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5382881756028615070L;

	private Integer pid;   //--主键ID 0--all  1-- create 2--select 3--update 4--update 5--reject      
	private String pname;  //--权限名称    create
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
