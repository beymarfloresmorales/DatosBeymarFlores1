package agenciaalquilervehiculos;

public class Motocicleta extends Vehiculo{
	private boolean ciudad;

	public Motocicleta(String matricula, double precioDiario, boolean ciudad) {
		super(matricula, 2, precioDiario);
		this.ciudad=ciudad;
	}

	public boolean isCiudad() {
		return ciudad;
	}

	public void setCiudad(boolean ciudad) {
		this.ciudad = ciudad;
	}
	
	public String toString () {
		return "Ciudad: " + ciudad + super.toString();
	}

} 