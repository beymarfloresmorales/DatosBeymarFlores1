package figuras;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*base+2*altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
	public String toSTring() {
		return "El retangulo de base "+ base+" y altura"+altura+ 
				" tiene un area de "+area() +
				" y de perimetro "+perimetro();
	}


}
