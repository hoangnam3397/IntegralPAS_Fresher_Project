package com.dxc.fresher.integralPAS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/product-view/{id}")
	public String viewCustomer(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-view";
	}
	
	@RequestMapping("/product-update/{id}")
	public String updateCustomer(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-update";
	}

	@RequestMapping("/insertProduct")
	public String doSaveCustomer(@ModelAttribute("product") Product product, Model model) {
		productService.insert(product);;
		model.addAttribute("listProduct", productService.findAll());
		return "product-list";
	}

	@RequestMapping("/updateProduct")
	public String doUpdateCustomer(@ModelAttribute("Customer") Product product, Model model) {
		productService.update(product);
		model.addAttribute("listProduct", productService.findAll());
		return "product-list";
	}
	
	@RequestMapping("/productDelete/{id}")
	public String doDeleteCustomer(@PathVariable int id, Model model) {
		productService.delete(id);
		model.addAttribute("listProduct", productService.findAll());
		return "product-list";
	}

}
