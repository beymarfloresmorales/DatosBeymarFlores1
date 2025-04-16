package sentenciasiterativas;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1;
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce a:");
		a=sc.nextInt();
		System.out.println("Introduce b:");
		b=sc.nextInt();
		if (a>=b) {
			System.out.println("a debe ser menor que b");
			return;
		}
		
		/* Primero forma*/		
		for (num1=a; num1<=b;num1++) {
			if (num1%2==0) {
				System.out.println(num1);
			}
		}
		System.out.println("-----------------------");
		/* Segunda forma */
		for (num1=a%2==0?a:a+1; num1<=b;num1+=2) {
			System.out.println(num1);
		
		}

		
	}
}
