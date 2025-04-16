package socios;

import java.util.Arrays;

public class ClubSocio {

	private int presupuesto;
	private int totalSocios;
	private int numSocios=0;
	private Socio[] socios;
	
	public ClubSocio(int presupuesto, int totalSocios) {
		this.presupuesto=presupuesto;
		this.totalSocios=totalSocios;
		socios=new Socio[totalSocios];
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public int getTotalSocios() {
		return totalSocios;
	}
	
	// TAREA 4
	public void altaSocio(Socio socio) {
		socios[numSocios]=socio;
		numSocios++;
		socio.calcularCuotaAnual(presupuesto, totalSocios);
	}
	
	public boolean bajaSocio(int numSocio) {
		for (int i=0; i<totalSocios; i++) {
			if (socios[i].getNumSocio()==numSocio) {
				socios[i]=socios[numSocios-1];
				socios[numSocios-1]=null;
				numSocios--;
				return true;
			}
		}
		return false;
	}
	
	// TAREA 5
	public boolean modificarSocio(Socio socio) {
		for (int i=0; i<numSocios; i++) {
			if (socios[i].getNumSocio()==socio.getNumSocio()) {
				socios[i]=socio;
				return true;
			}
		}
		return false;		
	}
	
	// TAREA 6
	public void mostrarSocios() {
		Socio[] sociosAux=Arrays.copyOf(socios,numSocios);
		Arrays.sort(sociosAux);		
		System.out.println(Arrays.toString(sociosAux));
	}

	
	//TAREA 8
	public void mostrarSociosVIP() {
		Socio[] sociosAux=Arrays.copyOf(socios,numSocios);
		Arrays.sort(sociosAux, new OrdenPorFechaAltaFechaNacimiento());
		for (int i=0; i<numSocios; i++) {
			if (sociosAux[i] instanceof SocioVip) {
				System.out.println(sociosAux[i]);
			}
		}
	}

	
}
