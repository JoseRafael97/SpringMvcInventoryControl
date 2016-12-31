package br.edu.ifpb.sgb.model;

import java.util.List;

/**
 * Classe que representa as categorias e subcateria de um produto.
 * @author rafaelfeitosa
 *
 */
public class Category {
	
	private String name;
	private String description;

	private List<Category> subcategories;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Category> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}
	
}
