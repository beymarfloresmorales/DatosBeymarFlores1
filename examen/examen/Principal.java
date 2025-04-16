package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// 9
		Scanner sc=new Scanner(System.in);
		String nombreTitular;
		System.out.println("Dame el nombre del titular:");
		nombreTitular=sc.next();
		String numeroCuenta;
		System.out.println("Dame el nombre del cuenta:");
		numeroCuenta=sc.next();
		if (CuentaBancaria.validarCuenta(numeroCuenta)==false) {
			System.out.println("Cuenta no valida.");
			return;
		}
		
		CuentaBancaria cb=new CuentaBancaria(nombreTitular,numeroCuenta);

		// 10
		double cantidad;
		System.out.println("Dame una cantidad a depositar:");
		cantidad=sc.nextDouble();
		cb.depositar(cantidad);
		System.out.println(cb);
		
		System.out.println("Dame una cantidad a retirar:");
		cantidad=sc.nextDouble();
		cb.retirar(cantidad);
		System.out.println(cb);
		
		System.out.println("Dame un interes a aplicar:");
		double tasa=sc.nextDouble();
		cb.aplicarInteres(tasa);	
		System.out.println(cb);


		
		
	}
}
