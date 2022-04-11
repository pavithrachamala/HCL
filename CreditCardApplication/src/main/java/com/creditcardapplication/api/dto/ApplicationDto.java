package com.creditcardapplication.api.dto;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ApplicationDto {
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private LocalDate dob;
	@NotBlank
	private String panNumber;
	private String mobileNumber;
	@NotBlank
	private double annualSalary;
	
	public ApplicationDto(@NotBlank String firstName, @NotBlank String lastName, LocalDate dob,
			@NotBlank String panNumber, String mobileNumber, @NotBlank double annualSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.panNumber = panNumber;
		this.mobileNumber = mobileNumber;
		this.annualSalary = annualSalary;
	}

	public ApplicationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	
	
}
