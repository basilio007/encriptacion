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

String jhj = codificar(letras , frase);
System.out.println("El texto "+frase+" codificado en metodo Cesar es: "+jhj);

	}
	public static String codificar(String letras,String frase ){
		String textcodificado ="";
		frase = frase.toUpperCase();

		char caracter;
		for(int i=0; i<frase.length(); i++) {
			caracter= frase.charAt(i);
			int posicion = letras.indexOf(caracter);
			if (posicion == -1) {
				
			
				textcodificado+=caracter;
				
				
			}else {
				textcodificado+=letras.charAt((posicion+3) % letras.length());
			}
			
			
		}
		return textcodificado;
		
	}
	/*public static String descodificar(String letras,String frase ){
		String textdescodificado ="";
		frase = frase.toUpperCase();
		char caracter;
		for(int i=0; i<frase.length(); i++) {
			caracter= frase.charAt(i);
			int posicion = letras.indexOf(caracter);
			if (posicion == -1) {
				
			
				textdescodificado+=caracter;
				
				
			}else if (posicion = 3 < 0){
				
				textdescodificado+=letras.charAt(letras.length() + (posicion - 3));
			}else {
				textdescodificado+=letras.charAt(posicion - 3) % (letras.length());
			}
			
			
		}
		
			
	}*/
	

}
