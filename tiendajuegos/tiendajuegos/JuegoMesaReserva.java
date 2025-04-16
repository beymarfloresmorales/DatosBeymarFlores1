package tiendajuegos;

public class JuegoMesaReserva extends JuegoMesa {

	private Cliente[] reservas;
	private final int DIA_ANNOS=365;
	
	public JuegoMesaReserva(String titulo, int precio) {
		super(titulo, precio);
		// TODO Auto-generated constructor stub
		reservas=new Cliente[DIA_ANNOS];
	}

	public void reservarDia(int dia, Cliente cliente) {
		reservas[dia]=cliente;
	}
	
	//TAREA 2
	public boolean estaDisponible(int dia) {
		return reservas[dia]==null;
		
	}
	
}
