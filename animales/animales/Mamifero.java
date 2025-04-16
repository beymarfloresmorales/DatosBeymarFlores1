package animales;

public class Mamifero extends Animal{

	private int numeroCrias;
	private int mesesEmbarazo;
	

	
	public Mamifero(
			String nombreComun, String nombreEspecifico, 
			double peso, double tamanno,
			int numeroCrias, int mesesEmbarazo) {
		super(nombreComun, nombreEspecifico, peso, tamanno);
		this.numeroCrias=numeroCrias;
		this.mesesEmbarazo=mesesEmbarazo;
	}
	
	
	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}
	public int getMesesEmbarazo() {
		return mesesEmbarazo;
	}
	public void setMesesEmbarazo(int mesesEmbarazo) {
		this.mesesEmbarazo = mesesEmbarazo;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\nMamifero [numeroCrias=" + numeroCrias + ", mesesEmbarazo=" + mesesEmbarazo + "]";
	}
	
	
	
}
