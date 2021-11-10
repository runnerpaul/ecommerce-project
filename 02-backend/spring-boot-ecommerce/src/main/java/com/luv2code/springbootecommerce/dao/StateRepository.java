package com.luv2code.springbootecommerce.dao;

import com.luv2code.springbootecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// @CrossOrigin("http://localhost:4200") -- not required as cross origin has been added to MyDataRestConfig.configureRepositoryRestConfiguration()
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(@Param("code") String code);

}
