package figuras;

public class Principal {

	public static void main(String[] args) {
		Figura figura;
		figura=new Cuadrado(2);
		System.out.println(figura.perimetro());
		
		figura=new Triangulo(3,4,5);
		System.out.println(figura.perimetro());
		
		figura=new Rectangulo(2,6);
		System.out.println(figura.perimetro());
		
		Figura[] figuras=new Figura[10];
		figuras[0]=new Cuadrado(1);
		figuras[1]=new Triangulo(2,3,3);
		figuras[2]=new Rectangulo(2,7);
		
	
	}
}
