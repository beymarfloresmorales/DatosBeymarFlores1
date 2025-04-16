package figuras;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	
	public String toSTring() {
		return "El cuadrado de lado "+ lado+ "tiene un area de "+area() +
				"y de perimetro "+perimetro();
	}

	
}
