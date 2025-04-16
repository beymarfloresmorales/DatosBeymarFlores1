package socios;

public class SocioVip extends Socio{
	
	private int categoria;

	public SocioVip(String nombreTitular, String telefono, String correo, String fechaNacimiento, 
			int categoria) {
		super(nombreTitular, telefono, correo, fechaNacimiento);
		this.categoria=categoria;
		// TODO Auto-generated constructor stub
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public void calcularCuotaAnual(int presupuesto, int totalSocios) {
		super.calcularCuotaAnual(presupuesto, totalSocios);
	//	cuota=presupuesto/totalSocios;
		cuota+=cuota*categoria/100;
	}

	@Override
	public String toString() {
		return super.toString()+"SocioVip [categoria=" + categoria + "]";
	}
	
	

	
}
