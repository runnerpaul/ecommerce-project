package com.luv2code.springbootecommerce.dao;

import com.luv2code.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @CrossOrigin("http://localhost:4200/") -- not required as cross origin has been added to MyDataRestConfig.configureRepositoryRestConfiguration()
@RepositoryRestResource(collectionResourceRel="productCategory", path="product-category")
public interface ProduceCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
