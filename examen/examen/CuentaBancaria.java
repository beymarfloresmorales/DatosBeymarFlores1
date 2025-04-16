package examen;

public class CuentaBancaria {
	private String nombreTitular;
	private String numeroCuenta;
	private double saldo;
	
	
	public CuentaBancaria(String nombreTitular, String numeroCuenta) {
		this.nombreTitular=nombreTitular;
		this.numeroCuenta=numeroCuenta;
		this.saldo=0;		
	}


	public String getNombreTitular() {
		return nombreTitular;
	}


	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	@Override
	public String toString() {
		return "CuentaBancaria [nombreTitular=" + nombreTitular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
				+ "]";
	}
	
	public void depositar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void retirar(double cantidad) {
		if (cantidad <= saldo)   {
			saldo-=cantidad;
		}
		else {
			System.out.println("Saldo no disponible.");
		}
	}
	
	public static boolean validarCuenta(String numeroCuenta) {
		String digito="0123456789";
		
		if (numeroCuenta.length()==10) {
			for (int i=0; i<10; i++) {
				if (digito.indexOf(numeroCuenta.charAt(i))==-1 ) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public void aplicarInteres(double tasa) {
		saldo=saldo + saldo*tasa/100;
	}
	
	

}
