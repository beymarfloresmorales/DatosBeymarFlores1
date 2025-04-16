package socios;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Socio implements Comparable<Socio>{

	private static int contador=0;
	private int numSocio;
	private String nombreTitular;
	private String telefono;
	private String correo;
	private String fechaNacimiento;
	private String fechaAlta;
	protected double cuota;
	
	public Socio(String nombreTitular,
			String telefono,
			String correo,
			String fechaNacimiento) {
		contador++;
		numSocio=contador;
		this.nombreTitular=nombreTitular;
		this.telefono=telefono;
		this.correo=correo;
		this.fechaNacimiento=fechaNacimiento;
		long fecha=System.currentTimeMillis();
		this.fechaAlta=new SimpleDateFormat("yyyy-MM-dd").format(fecha);
		cuota=0;
		
	}
	
	public Socio(int numSocio, String nombreTitular,
			String telefono,
			String correo,
			String fechaNacimiento) {
		this.numSocio=numSocio;
		this.nombreTitular=nombreTitular;
		this.telefono=telefono;
		this.correo=correo;
		this.fechaNacimiento=fechaNacimiento;
		long fecha=System.currentTimeMillis();
		this.fechaAlta=new SimpleDateFormat("yyyy-MM-dd").format(fecha);
		cuota=0;
		
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}
	
	

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public double getCuota() {
		return cuota;
	}
	
	// TAREA 1
	public void calcularCuotaAnual(int presupuesto, int totalSocios) {
		cuota=presupuesto/totalSocios;
	}

	@Override
	public String toString() {
		return "Socio [numSocio=" + numSocio + ", nombreTitular=" + nombreTitular + ", telefono=" + telefono
				+ ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", fechaAlta=" + fechaAlta
				+ ", cuota=" + cuota + "]";
	}

	@Override
	public int compareTo(Socio o) {
		// TODO Auto-generated method stub
		return nombreTitular.compareTo(o.nombreTitular);
	}
	
	
	
	
	
	
	
}
