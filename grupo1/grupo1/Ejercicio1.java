package grupo1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dame el nombre:");
		String nombre=sc.next();
		
		System.out.print("Dame la edad:");
		int edad=sc.nextInt();
		
		System.out.print("Dame el precio:");
		double precio=sc.nextDouble();
		
		if (esMayor65(edad)) {
			precio=aplicarDescuento(precio);
		}
		
		imprimirPrecio(nombre,precio);
		
		
	}
	
	static boolean esMayor65(int edad) {
		return edad>65;
	}
	
	static double aplicarDescuento(double precio) {
		return precio -precio*0.2;
	}
	
	static void imprimirPrecio(String nombre, double precio) {
		System.out.println("El precio final para "+nombre+ 
				" es de "+precio);
	}
	
}
