package com.hibernate.test;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student {

	// Sets this value as the primary key
	@Id
	// Auto generates the id
	@GeneratedValue
	private int id;
	
	// Can specify database attributes here
	@Column(name="FULL_NAME", nullable=false)
	private String name;
	
	// Hibernate will ignore this value when making database items
	@Transient
	private String hibernateIgnore;
	
	// Unsure on what this does
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	
	
	
	/* Getter and setters */
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
