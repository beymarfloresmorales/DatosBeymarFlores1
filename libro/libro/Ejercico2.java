package libro;

import java.util.Scanner;

public class Ejercico2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Jugadar A escribe una palabra:");
		String palabraAdivinar=sc.next();
		String palabraGuiones=cargarGuiones(palabraAdivinar.length());
		
		char letra;
		
		int i;
		for (i=1; i<=7; i++) {
			System.out.println("Dame una letra:");
			letra=sc.next().charAt(0);
			palabraGuiones=buscarLetra(palabraAdivinar, palabraGuiones,letra);
			System.out.println(palabraGuiones);
			if (palabraGuiones.equals(palabraAdivinar)) {
				System.out.println("Enhorabuena, has ganado en "+i+" intentos");
				break;
			}
			
		}
		if (i==8) {
			System.out.println("Has perdido.");
		}
		
	}
	
	static String buscarLetra(String palabra, String palabraDescubierta, char letra) {
		String palabraGuiones="";
		
		for (int i=0; i<palabra.length();i++) {
			if ( palabra.charAt(i)==letra) {
				palabraGuiones+=letra;
			}
			else if (palabraDescubierta.charAt(i)!='_') {
				palabraGuiones+=palabraDescubierta.charAt(i);
			}
			else {
				palabraGuiones+="_";
			}			
		}
				
		
		
		return palabraGuiones;
		
	}
	
	static String cargarGuiones (int longitud) {
		String palabraGuiones="";
		for (int i=0; i<longitud; i++) {
			palabraGuiones+="_";
		}
		return palabraGuiones;
		
	}
	
	
	
}
