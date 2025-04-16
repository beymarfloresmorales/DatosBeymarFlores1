package tratamientotablas;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulacionTablaConArrays {
	
	private static int indicador=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu="1-Alta\n"+
					"2-Baja\n"+
					"3-Modificar\n"+
					"4-Consulta\n"+
					"5-Consulta ordenada\n"+
					"6-Salir";
		int[] array=new int[0];	
		int posicion, valor;
		int opcion;
		do {
			System.out.println("Elige una opción:");
			System.out.println(menu);
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Alta");
				System.out.println("Dame un valor");
				valor=sc.nextInt();
				array=alta(array,valor);
				break;
			case 2:
				System.out.println("Baja");
				System.out.println("Introduce posicion:");
				posicion=sc.nextInt();
				array=eliminar(array, posicion);
				break;
			case 3:
				System.out.println("Modificar");
				System.out.println("¿Que posicion quieres modificar?");
				posicion=sc.nextInt();
				System.out.println("Dame un valor");
				valor=sc.nextInt();
				modificar(array, posicion, valor);
				break;
			case 4:
				System.out.println("Consulta");
				consultar(array);
				break;
			case 5:
				System.out.println("Lista ordenada");
				consulaOrdenada(array);
				break;
			case 6:				
				System.out.println("El programa ha acabado.");
				break;
			default:
				System.out.println("Opcion incorrecta.");
			}
			
		}while(opcion!=6);
	}
	
	static int[] alta(int[] array, int valor) {
		
		array=Arrays.copyOf(array, array.length+1);
		array[array.length-1]=valor;
		return array;
		
	}
	
	static void consultar(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	static int[] eliminar(int[] array, int posicion) {
		array[posicion]=array[array.length-1];
		return Arrays.copyOf(array, array.length-1);
		
	}
	
	static void modificar(int[] array, int posicion, int valor) {
		array[posicion]=valor;
	}
	
	static void consulaOrdenada(int[] array) {
		int[] arrayCopia=Arrays.copyOf(array, array.length);
		Arrays.sort(arrayCopia);
		System.out.println(Arrays.toString(arrayCopia));
	}
}
