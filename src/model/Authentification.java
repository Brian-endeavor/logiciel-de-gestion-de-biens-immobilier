package model;

public class Authentification {
	private int id;
	private String password;
	
	public Authentification(int id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public int getId() {
		return this.id;
	}
	public String getPassword() {
		return this.password;
	}
	public void setId(int id_new) {
		this.id = id_new;
		}
	public void setPassword(String password_new) {
		this.password = password_new;
	}
}
