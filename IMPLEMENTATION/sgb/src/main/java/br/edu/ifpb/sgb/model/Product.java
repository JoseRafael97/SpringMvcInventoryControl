package br.edu.ifpb.sgb.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import br.edu.ifpb.sgb.enumerations.MensureType;

/**
 * Classe representa um Produto.
 * @author rafaelfeitosa
 *
 */
public class Product {

	@NotBlank
	private String codItem;
	
	@NotBlank
	private String name;
	
	private String description;
	
	@NotBlank
	private String brand;
	
	@NotBlank
	private String amount;

	@NotNull
	private MensureType mensureType;
	
	@NotNull
	private List<Category> category;

	public String getCodItem() {
		return codItem;
	}

	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public MensureType getMensureType() {
		return mensureType;
	}

	public void setMensureType(MensureType mensureType) {
		this.mensureType = mensureType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
