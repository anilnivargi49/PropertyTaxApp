package com.propertytax.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertytax.main.entity.PropertyZone;

@Repository
public interface ZoneRepository extends JpaRepository<PropertyZone, Long>{

}
