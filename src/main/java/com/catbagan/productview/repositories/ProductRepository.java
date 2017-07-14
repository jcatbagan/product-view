package com.catbagan.productview.repositories;

import org.springframework.data.repository.CrudRepository;

import com.catbagan.productview.models.Product;

/**
 * 
 * @author jenseric
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
