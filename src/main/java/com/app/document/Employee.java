package com.app.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	private String id;

	private Integer empId;
	private String empName;
	private Address addr;
	public Employee() {
		super();
	}
	public Employee(Integer empId, String empName, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}

}
