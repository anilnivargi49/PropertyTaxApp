package com.propertytax.main.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertytax.main.dto.PropertyTaxDto;
import com.propertytax.main.dto.ReportDto;
import com.propertytax.main.entity.PropertyTax;
import com.propertytax.main.entity.PropertyTaxMaster;
import com.propertytax.main.repository.PropertyTaxMasterRepository;
import com.propertytax.main.repository.PropertyTaxRepository;

@Service
public class PropertyTaxServiceImpl implements PropertyTaxService{

	@Autowired
	private PropertyTaxRepository propertyTaxRepository;
	
	@Autowired
	private PropertyTaxMasterRepository propertyTaxMasterRepository;
	
	@Override
	public PropertyTaxDto saveTaxDetails(PropertyTaxDto propertyTaxDto) {
		PropertyTax propertyTax = new PropertyTax(propertyTaxDto);
		propertyTax = propertyTaxRepository.save(propertyTax);
		propertyTaxDto.setId(propertyTax.getId());
		return propertyTaxDto;
	}

	@Override
	public BigDecimal getCalculatedTax(Integer zoneId, Integer desriptionId, String status, String constructedYear,
			String assessmentYear, String area) {
		PropertyTaxMaster propertyTaxMaster = propertyTaxMasterRepository.getTaxMasterProperty(status, desriptionId, zoneId);
		BigDecimal amount = BigDecimal.valueOf(Long.valueOf(area)).multiply(propertyTaxMaster.getUnitAreaValue()).multiply(BigDecimal.TEN);
		Integer diffYear = Integer.valueOf(assessmentYear) - Integer.valueOf(constructedYear);
		if (diffYear < 60) {
			amount = amount.subtract(BigDecimal.valueOf(diffYear/100).multiply(amount));
		} else {
			amount = amount.subtract(amount.multiply(BigDecimal.valueOf(0.6)));
		}
		BigDecimal taxAmount1 = amount.multiply(BigDecimal.valueOf(0.2));
		BigDecimal taxAmount2 = amount.multiply(BigDecimal.valueOf(0.24));
		BigDecimal totalTaxAmount = taxAmount1.add(taxAmount2);
		return totalTaxAmount;
	}
	
	@Override
	public List<ReportDto> getZoneWiseTaxReport() {
		 return propertyTaxRepository.getTaxCollectedReport();
	}

}
