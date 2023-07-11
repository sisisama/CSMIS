package com.CSMIS.CSMISKhaingFamily.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unregisteredeat")
public class Unregisteredeat {
	
	@EmbeddedId
	private UnregisteredeatKey id;
	
	
	public UnregisteredeatKey getId() {
		return id;
	}

	public void setId(UnregisteredeatKey id) {
		this.id = id;
	}

	private String dept;
	
	private String division;
	
	private String employeeName;
	
	private String role;
	
	private String staffId;
	
	private String status;
	
	private String team;

	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
