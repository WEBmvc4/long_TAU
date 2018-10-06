package com.mkyong.rntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "persons")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PersonID")
    private int idPersions;  
	@Column(name="lastname")
    private String lastName;
	@Column(name="firstname")	
	private String fistName;
	public Student() {
		super();
	}
	public Student(int idPersions, String lastName, String fistName) {
		super();
		this.idPersions = idPersions;
		this.lastName = lastName;
		this.fistName = fistName;
	}
	public int getIdPersions() {
		return idPersions;
	}
	public void setIdPersions(int idPersions) {
		this.idPersions = idPersions;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
