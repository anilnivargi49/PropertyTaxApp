package com.propertytax.main.dto;

import com.propertytax.main.entity.PropertyDescription;

public class PropertyDescriptionDto {
	
	private Long id;
	private String propertyDescription;
	
	public PropertyDescriptionDto() {
	}
	
	public PropertyDescriptionDto(PropertyDescription propertyDescription) {
		this.id = propertyDescription.getId();
		this.propertyDescription = propertyDescription.getDescriptionName();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPropertyDescription() {
		return propertyDescription;
	}
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
}
