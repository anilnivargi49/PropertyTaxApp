package com.propertytax.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.propertytax.main.dto.PropertyDescriptionDto;

@Entity
@Table(name = "property_description")
public class PropertyDescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "description_name")
	private String descriptionName;
	
	public PropertyDescription(PropertyDescriptionDto propertyDescriptionDto) {
		this.id = propertyDescriptionDto.getId();
		this.descriptionName = propertyDescriptionDto.getPropertyDescription();
	}
	
	public PropertyDescription() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescriptionName() {
		return descriptionName;
	}

	public void setDescriptionName(String descriptionName) {
		this.descriptionName = descriptionName;
	}
}
