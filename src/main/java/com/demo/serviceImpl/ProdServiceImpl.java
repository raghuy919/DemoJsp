package com.demo.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;
@Service
public class ProdServiceImpl implements ProductService{
	@Autowired
	public ProductRepository repo;

	@Override
	public List<Product> listAll() {
		return repo.findAll();
	}

	@Override
	public void save(Product product) {
		repo.save(product);
	}

	@Override
	public Product get(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
