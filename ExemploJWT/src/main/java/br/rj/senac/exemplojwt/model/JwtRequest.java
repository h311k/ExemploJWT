package br.rj.senac.exemplojwt.model;

import java.io.Serializable;

/*
 * Classe necessaria o armazenamento do nome de usuario e senha vindos do client.
 */
public class JwtRequest implements Serializable {
	
	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	
	private String password;

	// contrutor padrao necessario para a conversao do JSON
	public JwtRequest() {
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
