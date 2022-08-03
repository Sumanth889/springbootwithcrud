package com.example.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.Product;
import com.example.scheduler.repsitory.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product)
	{
		return productRepository.save(product);
	}
}
