package br.edu.ifpb.sgb.model;

/**
 * Representa o usuário que acessa o sistema.
 * @author rafaelfeitosa
 *
 */
public class User {
	
	private String name;
	
	private String email;
	
	private String dateOfBirth;
	
	private boolean active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
