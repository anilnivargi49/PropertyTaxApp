package com.propertytax.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.propertytax.main.entity.PropertyTaxMaster;

@Repository
public interface PropertyTaxMasterRepository extends JpaRepository<PropertyTaxMaster, Long>{
	
	@Query(value="SELECT * FROM property_tax_master WHERE status=:status "
			+ " AND description_id=:description AND zone_id=:zoneId ", nativeQuery=true)
	public PropertyTaxMaster getTaxMasterProperty(@Param("status") String status,
			@Param("description") Integer descriptionId, @Param("zoneId") Integer zoneId);
}
