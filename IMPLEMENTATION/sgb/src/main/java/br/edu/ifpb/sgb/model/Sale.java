package br.edu.ifpb.sgb.model;

import java.util.Date;
import java.util.List;

public class Sale {
	
	private Date saleDate;
	private List<SaleItemStockProduct> products;
	
	public Date getSaleDate() {
		return saleDate;
	}
	
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	public List<SaleItemStockProduct> getProducts() {
		return products;
	}
	
	public void setProducts(List<SaleItemStockProduct> products) {
		this.products = products;
	}

	
}
