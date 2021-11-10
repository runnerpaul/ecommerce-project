package com.luv2code.springbootecommerce.dao;

import com.luv2code.springbootecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @CrossOrigin("http://localhost:4200") -- not required as cross origin has been added to MyDataRestConfig.configureRepositoryRestConfiguration()
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
