package cript_object;

import java.util.Scanner;

public class CriptObject {

	private String frase;
	private int clave;
	private static char alfabeto[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M',
									 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public void cript_object() {
		
	}
	public void lectordatos() {
		Scanner lector2 = new Scanner(System.in);
		System.out.println("introduce una frase");
		frase=lector2.nextLine().toUpperCase();
		
		System.out.println("introduce la clave");
		clave=lector2.nextInt();
				
		lector2.close();
				}
public char[] encriptar() {
	
	char[] mensajeEncriptado = new char [frase.length()];
	
	for(int i=0; i<frase.length(); i++) {
		if(frase.charAt(i)==' ') {
			mensajeEncriptado[i]=frase.charAt(i);
		}else {
			for(int j=0; j< alfabeto.length; j++ ) {
				if(frase.charAt(i)== alfabeto[j]) {
					
					if(clave<0) {
						mensajeEncriptado[i]=alfabeto[(j+clave+alfabeto.length)%alfabeto.length];	
						j=alfabeto.length;
						
					}else {
						mensajeEncriptado[i]=alfabeto[(j+clave)%alfabeto.length];	
						j=alfabeto.length;
						
					}
					
					
				}else {
					mensajeEncriptado[i]=frase.charAt(i);
				}
				
			}
		}
		
	}
	return mensajeEncriptado;
}
public char[] desencriptar() {
	

	char[] mensajeEncriptado = new char [frase.length()];
	
	for(int i=0; i<frase.length(); i++) {
		if(frase.charAt(i)==' ') {
			mensajeEncriptado[i]=frase.charAt(i);
		}else {
			for(int j=0; j< alfabeto.length; j++ ) {
				if(frase.charAt(i)== alfabeto[j]) {
					
					if(j<clave) {
						mensajeEncriptado[i]=alfabeto[(j-clave+alfabeto.length)%alfabeto.length];	
						j=alfabeto.length;
						
					}else {
						mensajeEncriptado[i]=alfabeto[(j-clave)%alfabeto.length];	
						j=alfabeto.length;
						
					}
					
					
				}else {
					mensajeEncriptado[i]=frase.charAt(i);
				}
				
			}
		}
		
	}
	return mensajeEncriptado;
}
}

