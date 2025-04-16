package tiendajuegos;

public class JuegoMesa {
	private int codigo;
	private String titulo;
	private int precio;
	private static int contador=0;
	
	public JuegoMesa(String titulo, int precio) {
		this.titulo=titulo;
		this.precio=precio;
		codigo=++contador;
	}

	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "JuegoMesa [codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + "]";
	}	
}
