package com.catbagan.productview.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Entity for Product
 * @author jenseric 
 * 
 */
@Entity
public class Product extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1330832180252333671L;
	
	@Column(unique = true)
	private String code;
	private String name;
	private String description;
	
	public Product() {
		
	}
	
	public Product(final String code, final String name, final String description) {
		this.code = code;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the ean
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param ean the ean to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
