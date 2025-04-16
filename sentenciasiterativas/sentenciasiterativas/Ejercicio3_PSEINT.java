package sentenciasiterativas;

import java.util.Scanner;

public class Ejercicio3_PSEINT {

	public static void main(String[] args) {
		int numero, contador, suma=0;
		float media=0.0f;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Escribir numero:");
		numero=sc.nextInt();
		contador=0;
		while(numero>0) {
			//suma=suma+numero;
			suma+=numero;
			//contador=contador +1;
			contador++;
			System.out.print("Escribir numero:");
			numero=sc.nextInt();
		}
		media=contador==0?0:(float)suma/(float)contador;
		System.out.println("La suma es: "+suma);
		System.out.println("La meida es: "+media);
		
	}
}
