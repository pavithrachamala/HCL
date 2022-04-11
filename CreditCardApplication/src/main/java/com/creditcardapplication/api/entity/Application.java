package com.creditcardapplication.api.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationNumber;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private LocalDate dob;
	@NotBlank
	private String panNumber;
	private String mobileNumber;
	private double annualSalary;
	private String status;
	@CreationTimestamp
	private LocalDate appliedDate;
	private long creditLimit;
	
	public Application(long applicationNumber, @NotBlank String firstName, @NotBlank String lastName, LocalDate dob,
			@NotBlank String panNumber, String mobileNumber, double annualSalary, String status, LocalDate appliedDate,
			long creditLimit) {
		super();
		this.applicationNumber = applicationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.panNumber = panNumber;
		this.mobileNumber = mobileNumber;
		this.annualSalary = annualSalary;
		this.status = status;
		this.appliedDate = appliedDate;
		this.creditLimit = creditLimit;
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(long applicationNumber) {
		this.applicationNumber = applicationNumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	
	

}
