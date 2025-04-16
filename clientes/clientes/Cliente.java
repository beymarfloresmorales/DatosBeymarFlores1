package clientes;

public class Cliente {

	private int id;
	private String nombre;
	private int edad;
	private String ciudad;
	private double totalCompras;
	private int numCompras;
	
	public Cliente(int id, String nombre, int edad, String ciudad, double totalCompras, int numCompras) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.totalCompras = totalCompras;
		this.numCompras = numCompras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getTotalCompras() {
		return totalCompras;
	}

	public void setTotalCompras(double totalCompras) {
		this.totalCompras = totalCompras;
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", totalCompras="
				+ totalCompras + ", numCompras=" + numCompras + "]";
	}
	
	
	
	
	
}
