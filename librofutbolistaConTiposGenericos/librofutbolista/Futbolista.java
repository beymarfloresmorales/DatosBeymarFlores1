package librofutbolista;

public class Futbolista implements Comparable<Futbolista>{

	private String nombre;
	private String dni;
	private int edad;
	private int NGoles;
	
	public Futbolista(String nombre, String dni, int edad) {
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.NGoles=0;
	}

	public int getNGoles() {
		return NGoles;
	}

	public void setNGoles(int nGoles) {
		NGoles = nGoles;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}
	
	

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", NGoles=" + NGoles + "]\n";
	}
	
	@Override
	public boolean equals(Object o) {
		return dni.equals(((Futbolista)o).getDni());
	}

	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return dni.compareTo(o.getDni());
		//return dni.compareTo(this.dni);
	}
	
	
	
}
