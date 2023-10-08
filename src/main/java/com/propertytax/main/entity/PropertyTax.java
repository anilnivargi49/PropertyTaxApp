package com.propertytax.main.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.propertytax.main.dto.PropertyTaxDto;

@Entity
@Table(name = "property_tax")
public class PropertyTax {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "assessment_year")
	private String assessmentYear;
	
	@Column(name = "owner_name")
	private String ownerName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "property_address")
	private String propertyAddress;
	
	@Column(name = "zonal_classification")
	private String zonalClassification;
	
	@Column(name = "property_description")
	private String propertyDescription;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "constructed_year")
	private String constructedYear;
	
	@Column(name = "area")
	private Integer propertyArea;
	
	@Column(name = "tax")
	private BigDecimal tax;
	
	public PropertyTax(PropertyTaxDto propertyTaxDto) {
		this.assessmentYear = propertyTaxDto.getAssessmentYear();
		this.constructedYear = propertyTaxDto.getConstructedYear();
		this.email = propertyTaxDto.getEmail();
		this.ownerName = propertyTaxDto.getOwnerName();
		this.propertyAddress = propertyTaxDto.getPropertyAddress();
		this.propertyArea = propertyTaxDto.getPropertyArea();
		this.propertyDescription = propertyTaxDto.getPropertyDescription();
		this.status = propertyTaxDto.getStatus();
		this.tax = propertyTaxDto.getTax();
		this.zonalClassification = propertyTaxDto.getZonalClassification();
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
