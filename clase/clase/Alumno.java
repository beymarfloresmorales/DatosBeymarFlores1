package clase;


public class Alumno {

	private String nombre;
	private double notaFinal;
	private boolean repetidor;
	
	public Alumno (String nombre) {
		this.nombre = nombre;
		notaFinal = 0.0;
		repetidor = false;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public double getNotafinal() {
		return notaFinal;
	}
	
	public boolean getRepetidor() {
		return repetidor;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void evaluar (double nota1, double nota2, double nota3) {
		notaFinal = Math.round(((nota1+nota2+nota3)/3)) + 1/100;
		if (notaFinal < 5) {
			repetidor = true;
			System.out.println("El alumno " + nombre + " tiene que repetir el curso");
		}
	}
	public String toString() {
		return "Nombre: " + nombre +
				"\nNota final: " + notaFinal +
				"\nRepetidor: " + repetidor;
	}
	
} 