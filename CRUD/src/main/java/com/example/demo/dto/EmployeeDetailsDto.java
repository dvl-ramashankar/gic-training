package com.example.demo.dto;

public class EmployeeDetailsDto {

	private String adharCard;
	private String panCard;
	private int contactno;
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
