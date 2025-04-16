package vivienda;

public class Palacio extends Vivienda {
	
	private boolean chofer;
	
	public Palacio(double metroCuadrados, String calle, int numero, boolean chofer) {
		super(10, metroCuadrados, calle, numero);
		// TODO Auto-generated constructor stub
		this.chofer=chofer;
	}

	public boolean isChofer() {
		return chofer;
	}

	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nPalacio [chofer=" + chofer + "]";
	}
	
	
}


