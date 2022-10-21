package cript_main;

import java.util.Scanner;

public class CriptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		String letras = "ABCDEFGHIJKLMNSTUVWXYZ";
		String frase ;
System.out.println("introduce frase");
frase=lector.nextLine();



	}
	public static String codificar(String letras,String frase ){
		String textodescodificado ="";
		frase = frase.toUpperCase();
		char caracter;
		for(int i=0; i<letras.length(); i++) {
			caracter= frase.charAt(i);
			int posicion = letras.indexOf(caracter);
			if (posicion == -1) {
				
			
				textodescodificado+=caracter;
				
				
			}else {
				textodescodificado+=letras.charAt((posicion+3) % letras.length());
			}
			
			
		}
		return textodescodificado;
		
	}
	

}
