package com.catbagan.productview.persistence.repositories;

import org.springframework.data.repository.CrudRepository;

import com.catbagan.productview.persistence.models.Product;

/**
 * 
 * @author jenseric
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
