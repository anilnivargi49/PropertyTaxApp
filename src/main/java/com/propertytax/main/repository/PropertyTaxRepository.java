package com.propertytax.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.propertytax.main.dto.ReportDto;
import com.propertytax.main.entity.PropertyTax;

@Repository
public interface PropertyTaxRepository extends JpaRepository<PropertyTax, Long> {
	
	@Query(value="SELECT z.zone as zoneName, pt.status as propertyType, SUM(pt.tax) as amountCollected FROM property_tax pt "
			+ "	INNER JOIN zone z ON z.id=pt.zonal_classification group by z.zone, pt.status;", nativeQuery = true)
	public List<ReportDto> getTaxCollectedReport();
}
