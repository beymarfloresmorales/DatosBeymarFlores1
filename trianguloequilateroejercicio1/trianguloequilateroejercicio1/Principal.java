package trianguloequilateroejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un lado del triangulo 1");
		double lado1=sc.nextDouble();
		TrianguloEquilatero triangulo1=new TrianguloEquilatero();
		triangulo1.setLado(lado1);
		double perimetro1=triangulo1.getPerimetro();
		System.out.println("El perimetro es: "+perimetro1);
		double area1=triangulo1.getArea();
		System.out.println("El area es: "+area1);
		double altura1=triangulo1.getAltura();
		System.out.println("La altura es: "+altura1);
		
		System.out.println("Dame un lado del triangulo 2");
		double lado2=sc.nextDouble();
		TrianguloEquilatero triangulo2=new TrianguloEquilatero();
		triangulo2.setLado(lado2);
//		String informacion=triangulo2.toString();
//		System.out.println(informacion);
//		System.out.println(triangulo2.toString());
		System.out.println(triangulo2);

		System.out.println("Dame un lado del triangulo 2");
		double lado3=sc.nextDouble();
		TrianguloEquilatero triangulo3=new TrianguloEquilatero(lado3);
		System.out.println(triangulo3);	
	}
}
