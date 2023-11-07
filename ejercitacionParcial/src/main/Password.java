/*
 * [4 puntos] - Impleméntese una clase llamada Password que siga las siguientes condiciones:

Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que sele pase por parámetro. Generará una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
generarPassword(): genera la contraseña del objeto con la longitud que tenga.
Método get para contraseña y longitud.
Método set para longitud.
[4 puntos] - Impleméntese la clase Passwords que tenga como atributo una colección de objetos Password. Único construtor por defecto y los métodos que implementa serán:

agregarPassword(Password): agrega una password a la colección.
getPasswordsDebiles(): retorna una colección las passwords débiles.
[1 punto] - Impleméntese la clase Main con el método main para hacer uso del framework descripto. Usar como mínimo 5 passwords.

[1 punto] - Defínase y ejemplifíquese Polimorfismo.


 * 
 * */package main;

import java.security.SecureRandom;

public class Password {
	private String cadena = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña="";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña= generarPassword();
	}
	
	public String generarPassword() {
		SecureRandom sr = new SecureRandom();
		String bancoCadena = getCadena();
		StringBuilder cadenaResultado = new StringBuilder();
		for(int i=0;i<getLongitud();i++) {
			int index = sr.nextInt(bancoCadena.length());
			cadenaResultado.append(bancoCadena.charAt(index));
		}
		return cadenaResultado.toString();
	}
	
	public void generarPassword(boolean valor) {
		SecureRandom sr = new SecureRandom();
		String bancoCadena = getCadena();
		StringBuilder cadenaResultado = new StringBuilder();
		for(int i=0;i<getLongitud();i++) {
			int index = sr.nextInt(bancoCadena.length());
			cadenaResultado.append(bancoCadena.charAt(index));
		}
		this.contraseña=cadenaResultado.toString();
	}
	
	public boolean esFuerte(String contraseña) {
		int cantMayus = 0;
		int cantMinus = 0;
		int cantNum = 0;
		for(int i=0; i<getLongitud();i++) {
			if(Character.isLowerCase(contraseña.charAt(i)))
				cantMinus++;
			if(Character.isUpperCase(contraseña.charAt(i)))
				cantMayus++;
			if(Character.isDigit(contraseña.charAt(i)))
				cantNum++;
		}
		System.out.println("cantidad de Mayus: "+cantMayus);
		System.out.println("cantidad de Minus: "+cantMinus);
		System.out.println("cantidad de Num: "+cantNum);
		return(cantMinus>1 && cantMayus>2 && cantNum>5);
	}

	public int getLongitud() {
		return this.longitud;
	}
	public String getContraseña() {
		return this.contraseña;
	}
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}

	@Override
	public String toString() {
		return "Contraseña = [" + contraseña + "]";
	}

	public String getCadena() {
		return cadena;
	}
}
