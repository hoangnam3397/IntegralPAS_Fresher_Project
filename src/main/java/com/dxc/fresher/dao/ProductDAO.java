package com.dxc.fresher.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dxc.fresher.entities.Product;
import com.dxc.fresher.entities.ProductMapper;

@Repository
@Transactional
public class ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Product Product) {
		String sql = "INSERT INTO Product (name, description) VALUES (?, ?)";
		jdbcTemplate.update(sql, Product.getName(), Product.getdescription());
	}

	public void delete(int id) {
		String sql = "DELETE FROM Product WHERE id = " + id;
		jdbcTemplate.update(sql);
	}
	
	public void update(Product product) {
		String sql = "UPDATE Product SET name = ?, description = ? WHERE id = ? ";
		jdbcTemplate.update(sql, product.getName(), product.getdescription(), product.getId());
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
