package com.klu.modal;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="dept") //HQL will be performing the operations on the Entity class not the table "dept"
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptid;
	private String deptname;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private List<Employee> employees;
	
	public void setDeptId(int deptid) {
		this.deptid=deptid;
	}
	
	public int getDeptId() {
		return deptid;
	}
   
	public void setDeptName(String deptname) {
		this.deptname=deptname;
	}
	
	public String getDeptName() {
		return deptname;
	}
	
	
}
