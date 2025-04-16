package mensajeria;

public class Mensajeria {
	private final int MAXIMO_ENVIOS = 1000;
	private Envio[] envios = new Envio[MAXIMO_ENVIOS];
	private int indicador = 0;
	
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
}