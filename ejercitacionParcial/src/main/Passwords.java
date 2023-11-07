package main;

import java.util.LinkedList;
import java.util.List;
public class Passwords {

	private List<Password> contraseñas;
	
	public Passwords() {
		contraseñas = new LinkedList<Password>();
	}
	
	public void agregarPassword(Password pw){
		contraseñas.add(pw);
	}
	
	public List<Password> getPasswordsDebiles() 
	{
		List<Password> contraseñasDebiles = new LinkedList<Password>();
		Password pw = new Password();
		for(int i=0; i<contraseñas.size();i++) {
			pw = contraseñas.get(i);
			if(!pw.esFuerte(pw.getContraseña())) {
				contraseñasDebiles.add(pw);
			}
		}
		return contraseñasDebiles;
	}
}
