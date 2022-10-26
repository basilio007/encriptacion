package cript_object;

import java.util.Scanner;

public class CriptObject {

	String frase;
	int clave;
	private static char alfabeto[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M',
									 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public void cript_object() {
		super();
	}
	public cript_object(String frase,int clave) {
		super();
		this.frase = frase;
		this.clave = clave;
	}
	public CriptObject(String frase, int clave) {
		super();
		this.frase = frase;
		this.clave = clave;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public static char[] getAlfabeto() {
		return alfabeto;
	}
	public static void setAlfabeto(char[] alfabeto) {
		CriptObject.alfabeto = alfabeto;
	}
	public void lectordatos() {
		Scanner lector2 = new Scanner(System.in);
		System.err.println("introduce una frase");
		this.frase=lector2.nextLine().toUpperCase(null);
		
		System.out.println("introduce la clave");
		this.clave=lector2.nextInt();
				
		lector2.close();
				}
public char[] encriptar[] {
	
	char mensajeEncriptado = (char) this.frase.length();
	
	for(int i=0; i<this.getFrase().length(); i++) {
		if(getFrase().charAt(i)==' ') {
			mensajeEncriptado[i]=getFrase().charAt(i);
		}
		
	}
}
}

