package figuras;

public class Triangulo extends Figura{

	private double lado1;
	private double lado2;
	private double lado3;
	
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado1+lado2+lado3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double semiper=(lado1+lado2+lado3)/2;	
		return Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3)); 
	}
	
	public String toSTring() {
		return "El triagulo de lados "+ lado1+","+lado2+ ","+lado3+
				"tiene un area de "+area() +
				"y de perimetro "+perimetro();
	}

}
