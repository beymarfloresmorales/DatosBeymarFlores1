package tratamientotablas;

import java.util.Scanner;

public class ManipulacionTabla {
	
	private static int indicador=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu="1-Alta\n"+
					"2-Baja\n"+
					"3-Modificar\n"+
					"4-Consulta\n"+
					"5-Salir";
		int[] array=new int[10];	
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
				alta(array,valor);
				break;
			case 2:
				System.out.println("Baja");
				System.out.println("Introduce posicion:");
				posicion=sc.nextInt();
				eliminar(array, posicion);
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
				System.out.println("El programa ha acabado.");
				break;
			default:
				System.out.println("Opcion incorrecta.");
			}
			
		}while(opcion!=5);
	}
	
	static void alta(int[] array, int valor) {
		array[indicador]=valor;
		indicador++;
	}
	
	static void consultar(int[] array) {
		for (int i=0; i<indicador; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	static void eliminar(int[] array, int posicion) {
		array[posicion]=array[indicador-1];
		indicador--;
		
	}
	
	static void modificar(int[] array, int posicion, int valor) {
		array[posicion]=valor;
	}
}
