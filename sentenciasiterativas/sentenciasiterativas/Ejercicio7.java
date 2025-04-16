package sentenciasiterativas;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero:");
		numero=sc.nextInt();
		for (int i=0; i<=9; i++) {
			int multiplicacion=numero*i;
			System.out.println(numero+"x"+i+"="+multiplicacion);
		}
		
	}

}
