package com.catbagan.productview.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catbagan.productview.models.Product;
import com.catbagan.productview.repositories.ProductRepository;
import com.catbagan.productview.services.ProductService;

/**
 * Default Product Service
 * @author jenseric
 *
 */
@Service
public class DefaultProductService implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Collection<Product> getAllProduct() {
		final List<Product> products = new ArrayList<>();
		getProductRepository().findAll().forEach(products::add);
		return products;
	}

	@Override
	public void addProduct(final Product product) {
		getProductRepository().save(product);
	}
	
	@Override
	public void deleteProduct(final Long id) {
		getProductRepository().delete(id);
	}
	

	@Override
	public Product findById(long id) {
		return getProductRepository().findOne(id);
	}
	
	/**
	 * @return the productRepository
	 */
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	/**
	 * @param productRepository the productRepository to set
	 */
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}



	
	
}
