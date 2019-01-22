package com.dxc.fresher.integralPAS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dxc.fresher.integralPAS.entities.Product;
import com.dxc.fresher.integralPAS.service.ProductService;

@Controller
public class ProductController {
	@Autowired 
	private ProductService productService;
	
	@RequestMapping(value={"/", "/product-list"})
	  public String listProduct(Model model) {
	    model.addAttribute("listProduct", productService.findAll());
	    System.out.println("show product");
	    return "product-list";
	  }
	@RequestMapping("/product-insert")
	  public String insertProduct(Model model) {
	    model.addAttribute("product", new Product());
	    return "product-insert";
	  }

}
