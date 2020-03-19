package com.demo.service;

import java.util.List;

import com.demo.domain.Product;

public interface ProductService {
	public List<Product> listAll();

	public void save(Product product);

	public Product get(Long id);

	public void delete(Long id);

}
