package br.edu.ifpb.sgb.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class StockProduct {
	
	private Integer amount;
		
	private Float price;
	
	private Product product;
	
	private Provider provider;
	
	@NotBlank
	private Date validate;
	
	private Date createDate;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Float getPrice() {
		return price;
	}
	
	

	public Date getValidate() {
		return validate;
	}

	public void setValidate(Date validate) {
		this.validate = validate;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
}
