package br.edu.ifpb.sgb.enumerations;

public enum MensureType {
	
	CENTIMETRO("Centímetro","cm" ),
	METRO("Metro","m"),
	KILOGRAMA("Kilograma", "kg"),
	LITRO("Litro", "l"),
	MILIGRAMAS("Miligramas", "ml");
	
	
	String nome;
	String sigla;
	
	private MensureType(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

}
