package br.edu.ifpb.sgb.model;

import org.hibernate.validator.constraints.NotBlank;

public class Customer {
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String cpfOrCnpj;
	
	private String email;
	
	
	private String telefone;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}


	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
