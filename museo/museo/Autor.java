package museo;

public class Autor {

	private String nombre;
	private String nacionalidad;
	private double cotizacion;

	public Autor(String nombre, String nacionalidad, double cotizacion) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.cotizacion = cotizacion;
	}
	
	public String getNombre() {
        return nombre;
    }
	
	public String getNacionalidad() {
        return nacionalidad;
    }
	
	public double getCotizacion() {
        return cotizacion;
    }
	
	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
    }
	
	public String toString() {
		return nombre + " " + nacionalidad + " " + cotizacion;
	}
} 