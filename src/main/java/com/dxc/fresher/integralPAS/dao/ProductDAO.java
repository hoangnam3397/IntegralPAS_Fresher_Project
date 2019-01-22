package com.dxc.fresher.integralPAS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.fresher.integralPAS.entities.Product;
import com.dxc.fresher.integralPAS.entities.ProductMapper;

@Repository
@Transactional
public class ProductDAO {
	
	  @Autowired
	  private JdbcTemplate jdbcTemplate;
	  
	  public void insert(Product product) {
		  String sql = "INSERT INTO Product (productname, description) VALUES (?, ?)";
		   jdbcTemplate.update(sql, product.getName(), product.getDescription());
		  
	  }
	  public void delete(int id) {
		    String sql = "DELETE FROM Product WHERE id = " + id;
		    jdbcTemplate.update(sql);
	  }
	  public void update(Product product) {
		    String sql = "UPDATE Product SET productname = ?, description = ? WHERE id = ? ";
		    jdbcTemplate.update(sql, product.getName(), product.getDescription(), product.getId());
	  }
	  public Product findById(int id) {
		    String sql = "SELECT * FROM Product WHERE id = ?";
		    return jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
	  }
		  
	  public List<Product> findAll() {
		    String sql = "SELECT * FROM Product";
		    return jdbcTemplate.query(sql, new ProductMapper());
		  
	  }


}
