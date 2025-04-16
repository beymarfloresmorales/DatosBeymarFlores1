package agenciaalquilervehiculos;

public class Automovil extends Vehiculo{
	private boolean airbag;

	public Automovil(String matricula, double precioDiario, boolean airbag) {
		super(matricula, 4, precioDiario);
		this.airbag=airbag;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}
	
	public String toString () {
		return "Airbag: " + airbag  + super.toString();
	}
	
	

}