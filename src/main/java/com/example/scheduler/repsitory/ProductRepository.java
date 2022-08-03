package com.example.scheduler.repsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.scheduler.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
