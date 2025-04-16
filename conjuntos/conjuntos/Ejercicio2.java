package conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		System.out.println("Introduce una frase:");
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		String frase=sc.next();
		System.out.println(frase);
		String[] palabras=frase.split(" ");
	
		ArrayList<String> listaPalabras=new ArrayList<String>();
		// Almacenar palabras lista
		for (int i=0; i<palabras.length; i++) {
			listaPalabras.add(palabras[i]);
		}
		
		//Palabras distintas
		HashSet<String> distintasPalabras=new HashSet<String>(listaPalabras);
				
		// Mostrar las palabras repetidas
		ArrayList<String>  palabrasRepetidas=new ArrayList<String>(listaPalabras);
		for (String palabra:distintasPalabras) {
			palabrasRepetidas.remove(palabra);
		}
		
		// Mostrar palabras que no lo estan
		HashSet<String>  palabrasNoRepetidas=new HashSet<String>(distintasPalabras);
		for (String palabra: palabrasRepetidas) {
			palabrasNoRepetidas.remove(palabra);
		}
		
		System.out.println("Todas las palabras(repetidas o no repetidas):"+listaPalabras);
		System.out.println("Palabras distintas:"+distintasPalabras);
		System.out.println("Palabras repetidas:"+palabrasRepetidas);
		System.out.println("Palabras no repetidas:"+palabrasNoRepetidas);
		
	}

}
