package grupo1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] productos=new String[0];
		String nombre="";
		int cantidad=0;
		String producto="";
		
		
		String menu="1-Alta producto\n"+
					"2-Mostrar producto\n"+
					"3-Modificar producto\n"+
					"4-Mostrar productos con mas de 10 unidades\n"+
					"5-Generar id de factura\n"+
					"6-Salir\n";
		int opcion;
		do {
			System.out.println(menu);
			System.out.print("Dame una opcion:");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.print("Dame un nombre de producto:");
					nombre=sc.next();
					System.out.print("Dame el numero de unidades:");
					cantidad=sc.nextInt();
					producto=nombre+":"+cantidad;
					productos=annadirProducto(productos,producto);
					break;
				case 2:
					mostrarProductos(productos);
					break;
				case 3:
					System.out.print("Dame un nombre de producto:");
					nombre=sc.next();
					System.out.print("Dame el numero de unidades:");
					cantidad=sc.nextInt();
					modificarUnidades(productos, nombre, cantidad);
					break;
				case 4:
					mostrarProductosMasDe10(productos);
					break;
				case 5:
					generarFacturas(productos);
					break;
				default:
					System.out.println("Opcion incorrecta.");
			}
		}while(opcion!=6);
		
	}
	
	static String[] annadirProducto(String[] productos, String producto) {
		String[] productosAumentado=null;
		productosAumentado=Arrays.copyOf(productos, productos.length+1);
		productosAumentado[productosAumentado.length-1]=producto;		
		return productosAumentado;
	}
	
	static void mostrarProductos(String[] productos) {
		System.out.println(Arrays.toString(productos));
	}
	
	static void modificarUnidades(String[] productos, String nombre, int cantidad) {
		for (int i=0; i< productos.length; i++) {
			if (productos[i].substring(0,productos[i].indexOf(":")).equals(nombre)) {
				productos[i]=nombre+":"+cantidad;
				break;
			}
			
		}
	}
	
	
	
	public static void mostrarProductosMasDe10(String[] array) {
        boolean hayProductos = false;
        System.out.println("Productos con más de 10 unidades");
        for (String producto : array) {
            String[] partes = producto.split(":");
            int cantidad = Integer.parseInt(partes[1]);
            if (cantidad > 10) {
                System.out.println(producto);
                hayProductos = true;
            }
        }
        if (!hayProductos) {
            System.out.println("No hay productos con más de 10 unidades.");
        }
    }

	
	static void generarFacturas(String[] array) {
        System.out.println("Números de factura");
        int contador = 0;
        for (String producto : array) {
            String[] partes = producto.split(";");
            String nombre = partes[0];
            String consonantes = obtenerConsonantes(nombre);
            String numeroFactura = consonantes.toUpperCase() + "-" + String.format("%04d", contador++);
            System.out.println(producto + " -> " + numeroFactura);
        }
    }

    /* Obtener las primeras dos consonantes del nombre */
    private static String obtenerConsonantes(String nombre) {
        String consonantes = "";
        for (char c : nombre.toCharArray()) {
            if ("bcdfghjklmnpqrstvwxyz".indexOf(Character.toLowerCase(c)) != -1) {
                consonantes += c;
            }
            if (consonantes.length() == 2) {
                break;
            }
        }
        return consonantes.length() == 2 ? consonantes : "XX"; // Si no tiene suficientes consonantes
    }


}
