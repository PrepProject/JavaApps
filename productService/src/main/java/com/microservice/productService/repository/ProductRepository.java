package com.microservice.productService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.microservice.productService.model.Product;


public interface ProductRepository extends MongoRepository<Product, String>{

}
