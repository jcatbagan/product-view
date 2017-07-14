package com.catbagan.productview.services;

import java.util.Collection;

import com.catbagan.productview.models.Product;

/**
 * Service to delete product.
 * @author jenseric
 *
 */
public interface ProductService {
	
	/**
	 * Returns product by id
	 * @return product
	 */
	public Product findById(final long id);
	
	/**
	 * Returns all products in database
	 * @return a collection of products. An empty list if no product exist.
	 */
	public Collection<Product> getAllProduct();

	/**
	 * Adds product in the system.
	 * @param product the product to add in the system.
	 */
	public void addProduct(final Product product);
	
	/**
	 * Delete a product
	 * @param id id of the product
	 */
	public void deleteProduct(final Long id);

}
