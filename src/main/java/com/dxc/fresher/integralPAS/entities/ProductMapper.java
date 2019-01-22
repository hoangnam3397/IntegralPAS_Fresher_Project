package com.dxc.fresher.integralPAS.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet arg0, int arg1) throws SQLException {
		Product product=new Product();
		product.setId(arg0.getInt("id"));
		product.setName(arg0.getString("productname"));
		product.setDescription(arg0.getString("description"));
		return product;
	}
	

}
