package sentenciasiterativas;

import java.util.Scanner;

public class Ejercicio3_PSEINT2 {

	public static void main(String[] args) {
		int numero, contador, suma=0;
		float media=0.0f;
		Scanner sc=new Scanner(System.in);
		
		contador=0;
		do{
			System.out.print("Escribir numero:");
			numero=sc.nextInt();
			if (numero==0) {
				break;
			}
			contador++;
			//suma=suma+numero;
			suma+=numero;
			//contador=contador +1;					
		}while(true);
		media=contador==0?0:(float)suma/(float)contador;
		System.out.println("La suma es: "+suma);
		System.out.println("La meida es: "+media);
		
	}
}
