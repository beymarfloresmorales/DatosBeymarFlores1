package tiendajuegos;

import java.util.Scanner;

public class Principal {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		TiendaJuegos tienda=new TiendaJuegos();
		String menu="1-Alta juego\n"+
				"2-Venta juego\n"+
				"3-Reserva juego\n"+
				"4-Juegos disponibles en un dia\\n"+
				"5-Mostrar juegos\n"+
				"6-Mostrar clientes\n"+
				"-1-Salir\n";
		int opcion;
		do {
			System.out.println(menu);
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				altaJuego(tienda);
				break;
			case 2:
				ventaJuego(tienda);
				break;
			case 3:
				reservaJuego(tienda);
				break;
			case 4:
				mostrarJuegosDisponibleDia(tienda);
				break;
			case 5:
				mostrarJuegos(tienda);
				break;
			case 6:
				mostrarCliente(tienda);
				break;
			case -1:
				break;
			default:
				System.out.println("Opci�n incorrecta");				
			}
			
		} while (opcion!=-1);
	}
	
	private static void mostrarJuegosDisponibleDia(TiendaJuegos tienda) {
		System.out.println("Mostrar juegos disponible por dia:");
		System.out.println("Introduce un dia:");
		int dia=sc.nextInt();
		tienda.mostrarJuegosDisponiblesDia(dia);
	}
	
	//TAREA 8
	private static void altaJuego(TiendaJuegos tienda) {
		String titulo="";
		int precio;
		int numExistencias;
		System.out.println("Dame el titulo:");
		titulo=sc.next();
		JuegoMesa juegoMesa=tienda.buscarJuegoPorTitulo(titulo);
		String tipoJuego="0-Venta,1-Reserva";
//		System.out.println(tipoJuego);
		int opcion=sc.nextInt();
		if (opcion==0) {
			if (juegoMesa==null) {
				System.out.println("Dame el precio:");
				precio=sc.nextInt();
				System.out.println("Numero de existencias:");
				numExistencias=sc.nextInt();
				JuegoMesaVenta juegoMesaVenta=new JuegoMesaVenta(titulo,precio,numExistencias);
				tienda.annadirJuegos(juegoMesaVenta);
			}
			else {
				System.out.println("Numero de existencias:");
				numExistencias=sc.nextInt();
				if (juegoMesa instanceof  JuegoMesaVenta) {
					((JuegoMesaVenta)juegoMesa).modifica(numExistencias);
				} 
				else {
					System.out.println("Opcion incorrecta.");
				}
			}
		}
		else {
			System.out.println("Dame el precio:");
			precio=sc.nextInt();
			JuegoMesaReserva juegoMesaReserva=new JuegoMesaReserva(titulo,precio);
			tienda.annadirJuegos(juegoMesaReserva);
			
		}
	}

	//TAREA 8
	private static void ventaJuego(TiendaJuegos tienda) {
		int unidades;
		System.out.println("Dame el código del juego");
		int codigo= sc.nextInt();
		JuegoMesa juegoMesa = tienda.buscarJuegoPorCodigo(codigo);
		if(juegoMesa != null && juegoMesa instanceof JuegoMesaVenta)  {
			System.out.println("Dime el numero de unidades que vendes");
			unidades = sc.nextInt();
			if(((JuegoMesaVenta)juegoMesa).getUnidadesExistentes() > unidades) {
				((JuegoMesaVenta)juegoMesa).modifica(-unidades);
			}else {
				System.out.println("No hay unidades existentes");
			}
		}else {
			System.out.println("No se encuentra el juego");
		}
	} 
	
	//TAREA 10
	private static void reservaJuego(TiendaJuegos tienda) {
		System.out.println("Dame el código del juego y el día");
		int codigo = sc.nextInt();
		int dia = sc.nextInt();
		JuegoMesa juegoMesa = tienda.buscarJuegoPorCodigo(codigo);
		if (juegoMesa != null && juegoMesa instanceof JuegoMesaReserva) {
			if (((JuegoMesaReserva)juegoMesa).estaDisponible(dia)){
				System.out.println("Dame el nombre del cliente");
				String nombre = 
sc.next
();
				Cliente cliente = null;
				cliente = tienda.buscarClientePorNombre(nombre);
				if(cliente == null) {
					System.out.println("Dame el telefono");
					String telefono = 
sc.next
();
					cliente = new Cliente(nombre, telefono);
				}
				((JuegoMesaReserva)juegoMesa).reservarDia(dia, cliente);
				cliente.modifica(juegoMesa.getPrecio());
			}else {
				System.out.println("Juego no disponible");
			}
			
		}
	} 

	
	private static void mostrarCliente(TiendaJuegos tienda) {
		tienda.mostrarClienteOrdPorImporteClave();
	}
	
	private static void mostrarJuegos(TiendaJuegos tienda) {
		tienda.mostrarJuegos();
	}
}
