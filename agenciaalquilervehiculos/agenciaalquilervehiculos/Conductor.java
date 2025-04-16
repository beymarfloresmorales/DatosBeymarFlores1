package agenciaalquilervehiculos;

public class Conductor implements AumentoPorcentaje{
	private String dni;
	private String nombre;
	private boolean conductorNovato;
	private int recargoConductorNovato;
	
	
	// TAREA 1: Implementar constructor.
	public Conductor(String dni, String nombre, boolean conductorNovato) {
		this.dni=dni;
		this.nombre=nombre;
		this.conductorNovato=conductorNovato;
		this.recargoConductorNovato = this.conductorNovato ? 25 : 0;
//		if (this.conductorNovato) {
//			recargoConductorNovato=25;
//		}
//		else {
//			recargoConductorNovato=0;	
//		}
	} 
	

	public boolean isConductorNovato() {
		return conductorNovato;
	}

	public void setConductorNovato(boolean conductorNovato) {
		this.conductorNovato = conductorNovato;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public int getRecargoConductorNovato() {
		return recargoConductorNovato;
	}

	public void setRecargoConductorNovato(int recargoConductorNovato) {
		this.recargoConductorNovato = recargoConductorNovato;
	}

	@Override
	public String toString() {
		return "Conductor [dni=" + dni + ", nombre=" + nombre + ", conductorNovato=" + conductorNovato + "]";
	}


	@Override
	public void modificar(double porcentaje) {
		// TODO Auto-generated method stub
		recargoConductorNovato+=recargoConductorNovato*porcentaje;
	}
	
	
	
}
