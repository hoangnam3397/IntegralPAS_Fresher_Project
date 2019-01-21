package com.dxc.fresher.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product Product = new Product();
		Product.setId(rs.getInt("id"));
		Product.setName(rs.getString("name"));
		Product.setdescription(rs.getString("description"));
		return Product;
	}

}
