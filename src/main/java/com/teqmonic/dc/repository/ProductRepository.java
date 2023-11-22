package com.teqmonic.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teqmonic.dc.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
