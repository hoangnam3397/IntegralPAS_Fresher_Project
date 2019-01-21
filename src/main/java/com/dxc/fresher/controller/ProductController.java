package com.dxc.fresher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.fresher.entities.Product;
import com.dxc.fresher.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value={"/", "/product-list"})
	public String listProduct(Model model) {
		model.addAttribute("listProduct", productService.findAll());
		return "product-list";
	}

	@RequestMapping("/product-save")
	public String insertProduct(Model model) {
		model.addAttribute("product", new Product());
		return "Product-save";
	}

	@RequestMapping("/product-view/{id}")
	public String viewProduct(@PathVariable int id, Model model) {
		Product Product = productService.findById(id);
		model.addAttribute("product", Product);
		return "Product-view";
	}
	
	@RequestMapping("/product-update/{id}")
	public String updateProduct(@PathVariable int id, Model model) {
		Product Product = productService.findById(id);
		model.addAttribute("product", Product);
		return "Product-update";
	}

	@RequestMapping("/saveProduct")
	public String doSaveProduct(@ModelAttribute("product") Product Product, Model model) {
		productService.save(Product);
		model.addAttribute("listProduct", productService.findAll());
		return "Product-list";
	}

	@RequestMapping("/updateProduct")
	public String doUpdateProduct(@ModelAttribute("product") Product Product, Model model) {
		productService.update(Product);
		model.addAttribute("listProduct", productService.findAll());
		return "Product-list";
	}
	
	@RequestMapping("/productDelete/{id}")
	public String doDeleteProduct(@PathVariable int id, Model model) {
		productService.delete(id);
		model.addAttribute("listProduct", productService.findAll());
		return "Product-list";
	}
}
