package com.propertytax.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.propertytax.main.dto.PropertyZoneDto;

@Entity
@Table(name = "zone")
public class PropertyZone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "zone")
	private String zone;
	
	public PropertyZone(PropertyZoneDto propertyZoneDto) {
		this.id = propertyZoneDto.getId();
		this.zone = propertyZoneDto.getZone();
	}
	public PropertyZone() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
