package com.dxc.fresher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.fresher.dao.ProductDAO;
import com.dxc.fresher.entities.Product;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductDAO ProductDAO;
	
	public List<Product> findAll() {
		return ProductDAO.findAll();
	}

	public Product findById(int id) {
		return ProductDAO.findById(id);
	}
	
	public void save(Product Product){
		// validate business
		ProductDAO.save(Product);
	}

	public void update(Product Product){
		// validate business
		ProductDAO.update(Product);
	}
	
	public void delete(int id){
		// validate business
		ProductDAO.delete(id);
	}
}
