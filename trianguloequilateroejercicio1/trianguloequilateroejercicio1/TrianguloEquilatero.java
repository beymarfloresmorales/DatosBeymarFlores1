package trianguloequilateroejercicio1;

public class TrianguloEquilatero {

	private double lado;
	
	public TrianguloEquilatero() {
		
	}
	
	public TrianguloEquilatero(double lado) {
		this.lado=lado;
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return lado*3;
	}
	
	public double getAltura() {
		return Math.sqrt(3)/2*lado;
	}
	
	public double getArea() {
		return lado*getAltura()/2;
	}
	
	public String toString() {
		
		return "Triangulo de lado:"+lado+
				", perimentro="+getPerimetro()+
				"y area "+getArea();
		
	}
	
}
