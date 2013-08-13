package com.ucclub.model;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7068105161360089892L;
    private Integer rid;  //角色id 
    private String rolename; //角色名称
    private List<Privilege> privaPrivileges;  //权限列表
	private String rolecomment; //--权限说明
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public List<Privilege> getPrivaPrivileges() {
		return privaPrivileges;
	}
	public void setPrivaPrivileges(List<Privilege> privaPrivileges) {
		this.privaPrivileges = privaPrivileges;
	}
	public String getRolecomment() {
		return rolecomment;
	}
	public void setRolecomment(String rolecomment) {
		this.rolecomment = rolecomment;
	}
    
}
