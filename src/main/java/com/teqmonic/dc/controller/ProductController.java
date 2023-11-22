package com.teqmonic.dc.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teqmonic.dc.entity.Product;
import com.teqmonic.dc.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductController {

	private final ProductRepository repository;

	@GetMapping("/api/products")
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@PostMapping("/api/products")
	public HttpStatus saveProduct(@RequestBody Product product) {
		repository.save(product);
		return HttpStatus.CREATED;
	}
}
