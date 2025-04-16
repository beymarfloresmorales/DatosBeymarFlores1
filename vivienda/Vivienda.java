package vivienda;

import java.util.Objects;

public class Vivienda {
	private int numHabitaciones;
	private double metroCuadrado;
	private String calle;
	private int numCalle;
	
	public Vivienda(int numHabitaciones,double metroCuadrado, String calle, int numCalle) {
		this.numHabitaciones= numHabitaciones;
		this.metroCuadrado=metroCuadrado;
		this.calle=calle;
		this.numCalle=numCalle;
		
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getMetroCuadrado() {
		return metroCuadrado;
	}

	public void setMetroCuadrado(double metroCuadrado) {
		this.metroCuadrado = metroCuadrado;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumCalle() {
		return numCalle;
	}

	public void setNumCalle(int numCalle) {
		this.numCalle = numCalle;
	}

	@Override
	public String toString() {
		return "Vivienda [numHabitaciones=" + numHabitaciones + ", metroCuadrado=" + metroCuadrado + ", calle=" + calle
				+ ", numCalle=" + numCalle + "]";
	}


	@Override
	public boolean equals(Object vivienda) {
		if (this.numHabitaciones==((Vivienda)vivienda).numHabitaciones &&
				this.metroCuadrado==((Vivienda)vivienda).metroCuadrado &&
				this.calle.equals(((Vivienda)vivienda).calle) &&
				this.numCalle==((Vivienda)vivienda).numCalle)
			return true;
		
		return false;
	} 
	
	
}