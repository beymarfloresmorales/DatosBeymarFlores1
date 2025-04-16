package biblioteca;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private int añoNacimiento;
	private int añoDefuncion;
	
	public Autor(String nombre, String nacionalidad, int añoNacimiento) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.añoNacimiento = añoNacimiento;
		añoDefuncion=-1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	
	public int getAñoDefuncion() {
		return añoDefuncion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	
	public void fallecer(int añoDefuncion) {
		this.añoDefuncion = añoDefuncion;
	}
	
	public String toString() {
		return nombre +" "+ nacionalidad + " "+añoNacimiento +" "+ 
				(añoDefuncion==-1?" esta vivo ":añoDefuncion);
	}
	
	
	
	
	
} 
