package museo;

public class Sala {
	private String nombre;
	private String ubicacion;
	
	public Sala(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public String toString() {
		return nombre + " " + ubicacion;
	}
} 