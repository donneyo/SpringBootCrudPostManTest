package com.neyo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neyo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	Product findByName(String name);
}
