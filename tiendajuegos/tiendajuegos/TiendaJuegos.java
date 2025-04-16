package tiendajuegos;

import java.util.Arrays;

public class TiendaJuegos {

	private JuegoMesa[] juegos;
	private int indJuegos=0;
	private Cliente[] clientes;
	private int indClientes=0;
	
	public TiendaJuegos() {
		juegos=new JuegoMesa[1000];
		clientes=new Cliente[100];
	}
	
	public void annadirCliente(Cliente cliente) {
		clientes[indClientes]=cliente;
		indClientes++;
	}
	
	//TAREA 5
	public Cliente buscarClientePorNombre(String nombre) {
		for (int i=0; i<indClientes; i++) {
			if (clientes[i].getNombre().equals(nombre))
				return clientes[i];
		}
		return null;
	}
	
	public JuegoMesa buscarJuegoPorTitulo(String titulo) {
		for (int i=0; i<indJuegos; i++) { 
			if (juegos[i].getTitulo().equals(titulo)) {
				return juegos[i];
			}
		}
		return null;
	}

	public JuegoMesa buscarJuegoPorCodigo(int codigo) {
		for (int i=0; i<indJuegos; i++) {
			if (juegos[i].getCodigo()==codigo) {
				return juegos[i];
			}
		}
		return null;
	}

	
	public void annadirJuegos(JuegoMesa juego) {
		
		juegos[indJuegos]=juego;
		indJuegos++;
		
	}
	
	//TAREA 6
	public void mostrarClienteOrdPorImporteClave() {
		
		Arrays.sort(clientes, new OrdenImporteReservaClave());
	}
	
	public void mostrarJuegos() {
		for (JuegoMesa j: juegos) {
			System.out.println(j);
		}
	}
	
	//TAREA 7
	public void mostrarJuegosDisponiblesDia(int dia) {
		for (int i=0; i<indJuegos; i++) {
			if (juegos[i] instanceof JuegoMesaReserva &&
					((JuegoMesaReserva)juegos[i]).estaDisponible(dia)) {
				System.out.println(juegos[i]);
			}
		}
	}
	
}
