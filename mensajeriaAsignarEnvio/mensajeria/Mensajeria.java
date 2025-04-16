package mensajeria;

public class Mensajeria {
	private final int MAXIMO_ENVIOS = 1000;
	private final int MAXIMO_MENSAJEROS = 100;
	
	private Envio[] envios = new Envio[MAXIMO_ENVIOS];
	private Mensajero[] mensajeros=new Mensajero[MAXIMO_MENSAJEROS];
	
	private int indicador = 0;
	private int indicadorM=0;
	
	public void altaCarta(String fecha, String direccionOrigen, String direccionDestino, float precio){
		Carta carta = new Carta(fecha, direccionOrigen, direccionDestino, precio);
		envios[indicador] = carta;
		indicador ++;	
	}
	
	public void altaPaquete(String fecha, String direccionOrigen, String direccionDestino,
			float peso, float precioKilo)  {
		Paquete paquete = new Paquete(fecha,direccionOrigen,direccionDestino,
				peso,precioKilo);
		
		envios[indicador] = paquete;
		indicador ++;	
	}
	
	public void bajaEnvio(int codigo) {
		for(int i = 0; i < indicador; i++) {
			if(envios[i].getCodigo() == codigo) {
				envios[i] = envios[indicador - 1];
				indicador --;
			}
			
		}		
	} 
	
	public void mostrarEnviosEspera() {
		for(int i =0; i<indicador; i++) {
			if(envios[i].getEstado()==TipoEstado.EN_ESPERA) {
				System.out.println(envios[i]);
		 }
		}
	}
	
	public void altaMensajero(String nombre, double sueldo, int numMax) {
		Mensajero mensajero=new Mensajero(nombre,sueldo,numMax);
		mensajeros[indicadorM]=mensajero;
		indicadorM++;
	}
	
	public void bajaMensajero(int codigo) {
		for (int i=0; i<indicadorM; i++) {
			if (mensajeros[i].getCodigo()==codigo) {
				mensajeros[i]=mensajeros[indicadorM-1];
				mensajeros[indicadorM-1]=null;
				indicadorM--;
				break;
			}
		}
	}
	
	public void mostrarMensajero() {
		for (int i=0; i<indicadorM; i++) {
			System.out.println(mensajeros[i]);
		}
	}
	
	private Envio buscarEnvio(int codigo) {
		for (int i=0; i<indicador; i++) {
			if (envios[i].getCodigo()==codigo && 
					envios[i].getEstado()==TipoEstado.EN_ESPERA) {
				return envios[i]; 
			}
		}
		return null;
	}
	
	private Mensajero buscarMensajeroLibre() {
		for (int i=0; i<indicadorM; i++) {
			if (mensajeros[i].isLibre()) {
				return mensajeros[i];
			}
		}
		return null;
	}
	
	
	
	public boolean asignarMensajero(int codigo) {
		Envio envio=buscarEnvio(codigo);
		if (envio==null) {
			System.out.println("Envio no encontrado");
			return false;
		}
		Mensajero mensajero=buscarMensajeroLibre();
		if (mensajero==null) {
			System.out.println("No hay mensajeros libres");
			return false;
		}
		mensajero.asignarEnvio(envio);
		mensajero.marcarOcupado();
		envio.asignarMensajero(mensajero);
		envio.cambiarEstado(TipoEstado.ASIGNADO);
		
		return true;
	}
	
}