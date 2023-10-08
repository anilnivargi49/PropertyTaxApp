package com.propertytax.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertytax.main.entity.PropertyDescription;

@Repository
public interface PropertyDescriptionRepository extends JpaRepository<PropertyDescription, Long> {

}
