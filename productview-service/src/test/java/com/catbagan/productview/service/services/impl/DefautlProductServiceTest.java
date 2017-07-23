package com.catbagan.productview.service.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.catbagan.productview.persistence.models.Product;
import com.catbagan.productview.persistence.repositories.ProductRepository;
import com.catbagan.productview.service.services.ProductService;

/**
 * 
 * @author Jenseric.Catbagan
 *
 */
public class DefautlProductServiceTest {

	@InjectMocks
	ProductService productService = new DefaultProductService();
	
	@Mock
	ProductRepository productRepository;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getAllProduct() {
		final Collection<Product> products = new ArrayList<>();
		products.add(new Product("code","name", "description"));
		products.add(new Product("code2","name2", "description2"));
		Mockito.when(productRepository.findAll()).thenReturn(products);
		
		final Collection<Product> results = productService.getAllProduct(); 
		for (Product product : results) {
			Assert.assertEquals(product.getCode(), product.getCode());	
			Assert.assertEquals(product.getName(), product.getName());	
			Assert.assertEquals(product.getDescription(),product.getDescription());		
		}
	}
}
