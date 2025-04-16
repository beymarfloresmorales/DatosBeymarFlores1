package tiendajuegos;

public class Cliente implements Modificar{
	private String nombre;
	private String telefono;
	private String clave;
	private int importeReservas;
	
	//TAREA 3
	public Cliente(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		clave=nombre.trim().toUpperCase()+"-"+sumaCifrasTelefono(telefono);
		importeReservas=0;
	}
	
	private int sumaCifrasTelefono(String telefono) {
		int numero=Integer.parseInt(telefono);
		int digito;
		int suma=0;
		while(numero==0) {
			digito=numero%10;
			suma+=digito;
			numero=(numero -digito)/10;
		}
		
		return suma;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getClave() {
		return clave;
	}
	public int getImporteReservas() {
		return importeReservas;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", clave=" + clave + ", importeReservas="
				+ importeReservas + "]";
	}

	@Override
	public void modifica(int valor) {
		// TODO Auto-generated method stub
		importeReservas+=valor;
	}
	
	
}
