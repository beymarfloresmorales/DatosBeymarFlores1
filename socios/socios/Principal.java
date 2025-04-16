package socios;

import java.util.Scanner;

public class Principal {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un presupuesto:");
		int presupuesto=sc.nextInt();
		System.out.println("Introduce un numero total de socios:");
		int totalSocios=sc.nextInt();
		ClubSocio club=new ClubSocio(presupuesto, totalSocios);
		String opciones="1. Dar de alta un socio.\n"
				+ "2. Dar de alta un socio VIP.\n"
				+ "3. Dar de baja un socio\n"
				+ "4. Modificar los datos de un socio.\n"
				+ "5. Mostrar la información de todos los socios.\n"
				+ "6. Mostrar todos los socios vitalicios.\n"
				+ "7. Salir";
		int opcion=0;
		do {
			System.out.println(opciones);
			System.out.println("Dame una opción:");			
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				altaSocio(club); 
				break;
			case 2:
				altaSocioVIP(club);
				break;
			case 3:
				bajaSocio(club);
				break;
			case 4:
				modificarSocio(club);
				break;
			case 5:
				mostrarSocios(club);
				break;
			case 6:
				mostrarSociosVIP(club);
				break;
			case 7:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
					
			}
			
		} while(opcion!=7);
		
	}
	
	public static void altaSocio(ClubSocio club) {
		System.out.println("Alta socio");
		System.out.println("Introduce en titular:");
		String titular=sc.next();
		System.out.println("Introduce en correo:");
		String correo=sc.next();
		System.out.println("Introduce en telefono:");
		String telefono=sc.next();
		System.out.println("Introduce en fecha de nacimiento:");
		String fechaNacimiento=sc.next();
		Socio socio=new Socio(titular,telefono, correo,  fechaNacimiento);
		club.altaSocio(socio);
	}
	
	//TAREA 9
	public static void altaSocioVIP(ClubSocio club) {
		System.out.println("Alta socio");
		System.out.println("Introduce en titular:");
		String titular=sc.next();
		System.out.println("Introduce en correo:");
		String correo=sc.next();
		System.out.println("Introduce en telefono:");
		String telefono=sc.next();
		System.out.println("Introduce en fecha de nacimiento:");
		String fechaNacimiento=sc.next();
		System.out.println("Introduce la categoria:");
		int categoria=sc.nextInt();
		SocioVip socio=new SocioVip(titular,telefono, correo,  fechaNacimiento,categoria);
		club.altaSocio(socio);
	}
	
	public static void bajaSocio(ClubSocio club) {
		System.out.println("Baja socio");
		System.out.println("Introduce en número de socio:");
		int numSocio=sc.nextInt();
		club.bajaSocio(numSocio);
	}
	
	//TAREA 10
	public static void modificarSocio(ClubSocio club) {
		System.out.println("Alta socio");
		System.out.println("Introduce en numero:");
		int numeroSocio=sc.nextInt();
		System.out.println("Introduce en titular:");
		String titular=sc.next();
		System.out.println("Introduce en correo:");
		String correo=sc.next();
		System.out.println("Introduce en telefono:");
		String telefono=sc.next();
		System.out.println("Introduce en fecha de nacimiento:");
		String fechaNacimiento=sc.next();
		Socio socio=new Socio(numeroSocio, titular,telefono, correo,  fechaNacimiento);
		if (club.modificarSocio(socio) ) {
			System.out.println("Usuario modificado");
		}
		else {
			System.out.println("Usuario no encontrado");
		}
	}
	

	public static void mostrarSocios(ClubSocio club) {
		club.mostrarSocios();
	}
	
	public static void mostrarSociosVIP(ClubSocio club) {
		club.mostrarSociosVIP();
	}

}
