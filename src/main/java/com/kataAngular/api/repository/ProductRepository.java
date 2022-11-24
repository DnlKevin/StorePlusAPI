package com.kataAngular.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kataAngular.api.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
}