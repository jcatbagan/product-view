package com.catbagan.productview.web.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.catbagan.productview.persistence.models.Product;
import com.catbagan.productview.service.services.ProductService;
/**
 * 
 * @author jenseric
 *
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public Collection<Product> getAllProduct() {
		return getProductService().getAllProduct();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(final @PathVariable long id) {
		final Product product = getProductService().findById(id);
		return product;
	}
	
	

	/**
	 * @return the productService
	 */
	public ProductService getProductService() {
		return productService;
	}

	/**
	 * @param productService the productService to set
	 */
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	

}
