package mensajeria;

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String menu="1-Alta Carta\n"+
				"2-Alta Paquete\n"+
				"3-Baja Envio\n"+
				"4-Mostrar envios en espera\n"+
				"5-Salir\n";
		
		Mensajeria mensajeria= new Mensajeria();
		
		
		int opcion=0;
		
		String fecha;
		String direccionOrigen;
		String direccionDestino;
		float precio;
		float peso;
		float precioKilo;
		int codigo;
		
		do {
			System.out.println(menu);
			
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dame la fecha: ");				
				fecha=sc.next();
				System.out.println("Dame la direccion de origen: ");
				direccionOrigen=sc.next();
				System.out.println("Dame la direccion de destino: ");
				direccionDestino=sc.next();
				System.out.println("Dame el precio ");
				precio=sc.nextFloat();
				
				mensajeria.altaCarta(fecha, direccionOrigen, direccionDestino, precio);
				break;
			case 2:
				System.out.println("Dame la fecha: ");
				fecha=sc.next();
				System.out.println("Dame la direccion de origen: ");
				direccionOrigen=sc.next();
				System.out.println("Dame la direccion de destino: ");
				direccionDestino=sc.next();
				System.out.println("Dame el peso: ");
				peso=sc.nextFloat();
				System.out.println("Dame el precio del kilo: ");
				precioKilo=sc.nextFloat();
				
				mensajeria.altaPaquete(fecha, direccionOrigen, direccionDestino, peso, precioKilo);
				break;
			case 3:
				System.out.println("Dame el codigo:  ");
				codigo=sc.nextInt();
				
				mensajeria.bajaEnvio(codigo);
			case 4:
				mensajeria.mostrarEnviosEspera();
				break;
			case 5:
				break;
			default: 
				System.out.println("Opcion incorrecta");
			}
		}while (opcion!=5);
	}
	

} 