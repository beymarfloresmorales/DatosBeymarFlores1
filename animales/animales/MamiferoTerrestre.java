package animales;

public class MamiferoTerrestre extends Mamifero{

	private int numeroPatas;
	
	public MamiferoTerrestre(String nombreComun, String nombreEspecifico, double peso, double tamanno, int numeroCrias,
			int mesesEmbarazo, int numeroPatas) {
		super(nombreComun, nombreEspecifico, peso, tamanno, numeroCrias, mesesEmbarazo);
		// TODO Auto-generated constructor stub
		this.numeroPatas=numeroPatas;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nMamiferoTerrestre [numeroPatas=" + numeroPatas + "]";
	}
	
	


	
	
	
	

	

}
