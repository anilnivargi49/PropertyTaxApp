package com.propertytax.main.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.propertytax.main.dto.PropertyTaxMasterDto;

@Entity
@Table(name = "property_tax_master")
public class PropertyTaxMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "description_id")
	private Long descriptionId;
	
	@Column(name = "zone_id")
	private Long zoneId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "unit_area_value")
	private BigDecimal unitAreaValue;
	
	public PropertyTaxMaster(PropertyTaxMasterDto propertyTaxMasterDto  ) {
		this.id = propertyTaxMasterDto.getId();
		this.descriptionId = propertyTaxMasterDto.getDescriptionId();
		this.unitAreaValue = propertyTaxMasterDto.getUnitAreaValue();
		this.zoneId = propertyTaxMasterDto.getZoneId();
		this.status = propertyTaxMasterDto.getStatus();
	}
	
	public PropertyTaxMaster() {
		
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
