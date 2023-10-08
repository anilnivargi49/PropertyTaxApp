package com.propertytax.main.dto;

import java.math.BigDecimal;

import com.propertytax.main.entity.PropertyTaxMaster;

public class PropertyTaxMasterDto {
	
	private Long id;
	private Long descriptionId;
	private Long zoneId;
	private BigDecimal unitAreaValue;
	private String status;
	
	public PropertyTaxMasterDto(PropertyTaxMaster propertyTaxMaster) {
		this.id = propertyTaxMaster.getId();
		this.descriptionId = propertyTaxMaster.getDescriptionId();
		this.unitAreaValue = propertyTaxMaster.getUnitAreaValue();
		this.zoneId = propertyTaxMaster.getZoneId();
		this.status = propertyTaxMaster.getStatus();
	}
	public PropertyTaxMasterDto() {
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(Long descriptionId) {
		this.descriptionId = descriptionId;
	}
	public Long getZoneId() {
		return zoneId;
	}
	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}
	public BigDecimal getUnitAreaValue() {
		return unitAreaValue;
	}
	public void setUnitAreaValue(BigDecimal unitAreaValue) {
		this.unitAreaValue = unitAreaValue;
	}
}
