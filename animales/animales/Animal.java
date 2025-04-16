package animales;

public class Animal {
	private String nombreComun;
	private String nombreEspecifico;
	private double peso;
	private double tamanno;
	

	public Animal(String nombreComun,
			String nombreEspecifico,
			double peso,
			double tamanno) {
		this.nombreComun=nombreComun;
		this.nombreEspecifico=nombreEspecifico;
		this.peso=peso;
		this.tamanno=tamanno;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreEspecifico() {
		return nombreEspecifico;
	}

	public void setNombreEspecifico(String nombreEspecifico) {
		this.nombreEspecifico = nombreEspecifico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTamanno() {
		return tamanno;
	}

	public void setTamanno(double tamanno) {
		this.tamanno = tamanno;
	}

	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", nombreEspecifico=" + nombreEspecifico + ", peso=" + peso
				+ ", tamanno=" + tamanno + "]";
	}


	
	
	
	
}
