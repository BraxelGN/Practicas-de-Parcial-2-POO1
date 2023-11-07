package main;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Password pw1 = new Password();
		Password pw2 = new Password();
		Password pw3 = new Password();
		Password pw4 = new Password(5);
		Password pw5 = new Password(50);
		
		pw1.generarPassword(true);
		pw2.generarPassword(true);
		pw3.generarPassword(true);
		
		System.out.println("Es fuerte: "+ pw1.esFuerte(pw1.getContraseña()));
		System.out.println(pw1);
		System.out.println("Es fuerte: "+ pw2.esFuerte(pw2.getContraseña()));
		System.out.println(pw2);
		System.out.println("Es fuerte: "+ pw3.esFuerte(pw3.getContraseña()));
		System.out.println(pw3);
		System.out.println("Es fuerte: "+ pw5.esFuerte(pw5.getContraseña()));
		System.out.println(pw5);
		System.out.println("Es fuerte: "+ pw4.esFuerte(pw4.getContraseña()));
		System.out.println(pw4);
		
		Passwords contraseñas = new Passwords();
		contraseñas.agregarPassword(pw5);
		contraseñas.agregarPassword(pw4);
		contraseñas.agregarPassword(pw3);
		contraseñas.agregarPassword(pw2);
		contraseñas.agregarPassword(pw1);
		
		List<Password> listaDebil;
		listaDebil = contraseñas.getPasswordsDebiles();
		System.out.println(listaDebil);
		}
}
