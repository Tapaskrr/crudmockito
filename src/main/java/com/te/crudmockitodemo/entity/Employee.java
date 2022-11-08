package com.te.crudmockitodemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Employee {
	@Id
	private String empId;
	private String empPwd;
	private String empName;
	private String empMail;
}
