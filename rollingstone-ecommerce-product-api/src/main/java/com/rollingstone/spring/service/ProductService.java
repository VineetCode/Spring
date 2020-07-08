package com.rollingstone.spring.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.rollingstone.spring.model.Product;

public interface ProductService {
	public Product save(Product product);
	public Optional<Product> get(long id);
	public Page<Product> getProductsByPage(Integer pageNumber,Integer pageSize);
	public void update(long id, Product product);
	public void delete(long id);

}
