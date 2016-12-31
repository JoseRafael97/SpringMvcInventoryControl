package br.edu.ifpb.sgb.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Classe que representa um Endereço 
 * @author rafaelfeitosa
 *
 */
public class Address {

	@NotBlank
	private String city;
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String number;
	
	@NotBlank
	private String street;
	
	@NotBlank
	private String neighborhood;
	
	@NotBlank @Size(min=9)
	private String zipCode;
	
	private String complement;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	

}
