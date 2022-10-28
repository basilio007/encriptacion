package cript_main;

import java.util.Scanner;

import cript_object.CriptObject;

public class CriptMain {

	public static void main(String[] args) {
		
		
		
		CriptObject text = new CriptObject();	
		
		text.lectordatos();
		
		System.out.println(text.desencriptar());
		
	}
}

