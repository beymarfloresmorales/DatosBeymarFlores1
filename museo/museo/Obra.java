package museo;

public class Obra {
	private String titulo;
	private int gradoConservacion;
	private double precio;
	private Autor autor;
	private Sala sala;

	public Obra(String titulo, int gradoConservacion, Autor autor) {
		this.titulo = titulo;
		this.gradoConservacion = gradoConservacion;
		this.autor = autor;
		precio = 1000 * gradoConservacion * autor.getCotizacion();
	}


	public String getTitulo() {
		return titulo;
	}

	public int getGradoConservacion() {
		return gradoConservacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setGradoConservacion() {
		this.gradoConservacion = gradoConservacion;
	}

	public void setPrecio() {
		this.precio = precio;
	}
	
	public void setSala(Sala sala) {
		this.sala=sala;
	}
	
	public String toString() {
		return "Obra [titulo=" + titulo + ", gradoConservacion=" + gradoConservacion + ", precio=" + precio + "\n, autor="
				+ autor + ", sala=" + sala + "]";
	}
}