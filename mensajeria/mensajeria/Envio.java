package mensajeria;
public class Envio {
	private static int cont=0;
	private int codigo;
	private String fecha;
	private String direccionOrigen;
	private String direccionDestino;
	private TipoEstado estado;
	
	public Envio(String fecha,String direccionOrigen,String direccionDestino) {
		this.fecha=fecha;
		this.direccionOrigen=direccionOrigen;
		this.direccionDestino=direccionDestino;
		this.estado=TipoEstado.EN_ESPERA;
		this.codigo=cont++;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccionOrigen() {
		return direccionOrigen;
	}

	public void setDireccionOrigen(String direccionOrigen) {
		this.direccionOrigen = direccionOrigen;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public void setDireccionDestino(String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	public TipoEstado getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Envio [codigo=" + codigo + ", fecha=" + fecha + ", direccionOrigen=" + direccionOrigen
				+ ", direccionDestino=" + direccionDestino + ", estado=" + estado + "]";
	}
}
