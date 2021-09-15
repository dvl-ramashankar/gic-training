package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String adharCard;
	private String panCard;
	private int contactno;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

}
