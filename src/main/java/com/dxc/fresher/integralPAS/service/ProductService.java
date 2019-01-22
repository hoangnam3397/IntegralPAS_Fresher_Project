package com.dxc.fresher.integralPAS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.fresher.integralPAS.dao.ProductDAO;
import com.dxc.fresher.integralPAS.entities.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> findAll(){
		return productDAO.findAll();
	}
	  
	public Product findById(int id) {
		    return productDAO.findById(id);  
	}
	public void insert(Product product){
		    // validate business
		 productDAO.insert(product);  
	}
	public void update(Product product){
	    // validate business
		productDAO.update(product);
	}
	public void delete(int id){
	    // validate business
		productDAO.delete(id);
	}
	 
}
