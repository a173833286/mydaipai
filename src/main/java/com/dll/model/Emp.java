package com.dll.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Emp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6795282147535090014L;
	@NotEmpty
	private Integer empNo;
	@Size(max=32 , min=6 )
	private String name;
	private String phone;
	private Date hireDate;
	private String dept;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", name=" + name + ", phone=" + phone
				+ ",hireDate="+new SimpleDateFormat("yyyy-MM-dd").format(hireDate)+",dept="+dept+"]";
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}


  
}
