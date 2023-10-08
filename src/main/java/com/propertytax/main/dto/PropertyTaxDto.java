package com.propertytax.main.dto;

import java.math.BigDecimal;

import com.propertytax.main.entity.PropertyTax;

public class PropertyTaxDto {
	
	private Long id;
	private String assessmentYear;
	private String ownerName;
	private String email;
	private String propertyAddress;
	private String zonalClassification;
	private String propertyDescription;
	private String status;
	private String constructedYear;
	private Integer propertyArea;
	private BigDecimal tax;
	
	public PropertyTaxDto() {
		
	}
	
	public PropertyTaxDto(PropertyTax propertyTax) {
		this.id = propertyTax.getId();
		this.assessmentYear = propertyTax.getAssessmentYear();
		this.constructedYear = propertyTax.getConstructedYear();
		this.email = propertyTax.getEmail();
		this.ownerName = propertyTax.getOwnerName();
		this.propertyAddress = propertyTax.getPropertyAddress();
		this.propertyArea = propertyTax.getPropertyArea();
		this.propertyDescription = propertyTax.getPropertyDescription();
		this.status = propertyTax.getStatus();
		this.tax = propertyTax.getTax();
		this.zonalClassification = propertyTax.getZonalClassification();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssessmentYear() {
		return assessmentYear;
	}
	public void setAssessmentYear(String assessmentYear) {
		this.assessmentYear = assessmentYear;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public String getZonalClassification() {
		return zonalClassification;
	}
	public void setZonalClassification(String zonalClassification) {
		this.zonalClassification = zonalClassification;
	}
	public String getPropertyDescription() {
		return propertyDescription;
	}
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConstructedYear() {
		return constructedYear;
	}
	public void setConstructedYear(String constructedYear) {
		this.constructedYear = constructedYear;
	}
	
	public Integer getPropertyArea() {
		return propertyArea;
	}
	public void setPropertyArea(Integer propertyArea) {
		this.propertyArea = propertyArea;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
}
