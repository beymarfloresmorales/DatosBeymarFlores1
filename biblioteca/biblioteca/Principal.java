package biblioteca;

import java.util.Scanner;
public class Principal {
	public static void main(String [] args) {
		
	
		Autor autor1= new Autor("Federico Garcia Lorca","Española",1898);
		autor1.fallecer(1936);
		Autor autor2= new Autor("Garcilazo de la Vega", "Española", 1503);

		
		System.out.println(autor1);
		System.out.println(autor2);
		
		Libros libro1= new Libros("ISBN-1","El romancero Gitano",autor1);
		Libros libro2= new Libros("ISBN-2","Los comentarios reales",autor2);
		System.out.println(libro1);
		System.out.println(libro2);
		
		libro1.prestarLibro();
		libro1.prestarLibro();
		libro1.devolverLibro();
		libro1.devolverLibro();
	}
} 