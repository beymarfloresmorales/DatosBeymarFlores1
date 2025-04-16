package animales;

public class Ave  extends Animal {

	private int numeroHuevos;
	private boolean volar;
	
	public Ave(String nombreComun, String nombreEspecifico, double peso, double tamanno,
			int numeroHuevos, boolean volar) {
		super(nombreComun, nombreEspecifico, peso, tamanno);
		// TODO Auto-generated constructor stub
		this.numeroHuevos=numeroHuevos;
		this.volar=volar;
		
	}

	public int getNumeroHuevos() {
		return numeroHuevos;
	}

	public void setNumeroHuevos(int numeroHuevos) {
		this.numeroHuevos = numeroHuevos;
	}

	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAve [numeroHuevos=" + numeroHuevos + ", volar=" + volar + "]";
	}
	
	
	
	

}
