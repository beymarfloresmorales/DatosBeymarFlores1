package tiendajuegos;

public class JuegoMesaVenta extends JuegoMesa implements Modificar{

	private int unidadesExistentes;
	
	public JuegoMesaVenta(String titulo, int precio, 
			int unidadesExistentes) {
		super(titulo, precio);
		// TODO Auto-generated constructor stub
		this.unidadesExistentes=unidadesExistentes;
	}

	public int getUnidadesExistentes() {
		return unidadesExistentes;
	}

	public void setUnidadesExistentes(int unidadesExistentes) {
		this.unidadesExistentes = unidadesExistentes;
	}

	@Override
	public String toString() {
		return super.toString()+"\nJuegoMesaVenta [unidadesExistentes=" + unidadesExistentes + "]";
	}

	@Override
	public void modifica(int valor) {
		// TODO Auto-generated method stub
		unidadesExistentes+= valor;
	}

	

	
	
}
