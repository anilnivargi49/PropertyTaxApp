package com.propertytax.main.service;

import java.math.BigDecimal;
import java.util.List;

import com.propertytax.main.dto.PropertyTaxDto;
import com.propertytax.main.dto.ReportDto;

public interface PropertyTaxService {
	
	public PropertyTaxDto saveTaxDetails(PropertyTaxDto loginDto);
	
	public BigDecimal getCalculatedTax(Integer zoneId, Integer desriptionId, 
			String status, String constructedYear, String assessmentYear, String area);
	public List<ReportDto> getZoneWiseTaxReport();

}
