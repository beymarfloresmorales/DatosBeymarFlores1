package agenciaalquilervehiculos;

import java.util.Scanner;

public class Principal {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		AgenciaAlquilerVehiculos agencia=new AgenciaAlquilerVehiculos();
		String menu="1-Alta Vehiculo\n"+
				"2-Alquiler vehiculo\n"+
				"3-Devolver vehiculo\n"+
				"4-Ordendar vehiculo\n"+
				"5-Mostrar estadisticas\n"+
				"-1-Salir\n";
		int opcion;
		do {
			System.out.println(menu);
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				altaVehiculo(agencia);
				break;
			case 2:
				alquilerVehiculo(agencia);
				break;
			case 3:
				devolverVehiculo(agencia);
				break;
			case 4:
				ordenarVehiculoPorDiasAlquiler(agencia);
				break;
			case 5:
				mostrarEstadisticas(agencia);
				break;
			case -1:
				break;
			default:
				System.out.println("Opci�n incorrecta");				
			}
			
		} while (opcion!=-1);
	}
	
	//TAREA 9
	public static void altaVehiculo(AgenciaAlquilerVehiculos agencia) {
		System.out.println("Ingrese matricula");
		String matricula=sc.next();
		
		if(agencia.buscarMatricula(matricula)==null) {
			
		System.out.println("Ingrese el precio diario");
		 double precioDiario=sc.nextDouble();
		 
		 System.out.println("Ingrese 1 si es automovil, 2 para motocicleta");
		 int opcion=sc.nextInt();
		 if(opcion==1) {
			 System.out.println("Tiene Airbag?");
			 boolean tienenAirbag=sc.nextBoolean();
			 Automovil nuevoauto=new Automovil(matricula,precioDiario,tienenAirbag);
			agencia.altaVehiculo(nuevoauto);
		 } else if(opcion==2) {
			 System.out.println("Es de ciudad?");
			 boolean deciudad=sc.nextBoolean();
			 Motocicleta nuevamoto=new Motocicleta(matricula,precioDiario,deciudad);
			agencia.altaVehiculo(nuevamoto);
		 } else {
			 System.out.println("Valor incorrecto");
		 }
		
		}
		else {
			System.out.println("Vehiculo existente");
		}
	} 
	
	//TAREA 10
	public static void alquilerVehiculo(AgenciaAlquilerVehiculos agencia) {
		System.out.println("Ingrese su DNI");
		String dni=sc.next();
		System.out.println("Ingrese su nombre");
		String nombre=sc.next();
		System.out.println("Es conductor Novato?");
		boolean esnovato=sc.nextBoolean();
		
		Conductor nuevoconductor=new Conductor(dni,nombre,esnovato);
		try {
			agencia.alquilerVehiculo(nombre, nuevoconductor);
		} catch (NoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VehiculoALquiladoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
//		System.out.println("Ingrese matricula");
//		String matricula=sc.next();
//		Vehiculo nuevovehiculo=agencia.buscarMatricula(matricula);	
//		nuevovehiculo.setConductor(nuevoconductor);
	
	}
	
	
	public static void devolverVehiculo(AgenciaAlquilerVehiculos agencia) {
		String matricula; 
		double porcentajeVehiculo;
		double porcentajeConductor;
		System.out.println("Introduce matricula");
		matricula=sc.next();
		System.out.println("Introduce penalizacion vehiculo");
		porcentajeVehiculo=sc.nextDouble();
		System.out.println("Introduce penalizacion conductor");
		porcentajeConductor=sc.nextDouble();
		try {
			agencia.devolverVehiculo(matricula, 
				porcentajeVehiculo, porcentajeConductor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		
	} 

	

	
	public static void ordenarVehiculoPorDiasAlquiler(AgenciaAlquilerVehiculos agencia) {
		agencia.ordenarVehiculoPorDiasAlquiler();
	}
	
	public static void mostrarEstadisticas(AgenciaAlquilerVehiculos agencia) {
		agencia.mostrarEstadisticas();		
	}
}
