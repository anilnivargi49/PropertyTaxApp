package com.propertytax.main.dto;

import java.math.BigDecimal;

public interface ReportDto {
	String getZoneName();
	String getPropertyType();
	BigDecimal getAmountCollected();
}
