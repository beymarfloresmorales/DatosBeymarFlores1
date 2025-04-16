package agenciaalquilervehiculos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AgenciaAlquilerVehiculos {

	private final int FLOTA=1000;
	private Vehiculo[] vehiculos=new Vehiculo[FLOTA]; 
	private int indicador=0;
	
	public void altaVehiculo(Vehiculo vehiculo) {
		vehiculos[indicador]=vehiculo;
		indicador++;

	}
	
	public Vehiculo buscarMatricula(String matricula) {		
		for(int i=0;i<FLOTA;i++) {
			if(vehiculos[i].getMatricula().equals(matricula)) {
				return vehiculos[i];
			}
		
		}
		System.out.println("Matricula no encontrada");
		return null;		
	} 
	
	//TAREA 5
	public double alquilerVehiculo(String matricula, Conductor conductor) throws NoEncontradoException, VehiculoALquiladoException {
		for(int i=0; i<indicador ;i++) {
			if (vehiculos[i].getMatricula().equals(matricula)) {
				if(vehiculos[i].getConductor()==null) {
					return (vehiculos[i].precioDiario+conductor.getRecargoConductorNovato())*vehiculos[i].diasAlquiler;
					
				}else {
					throw new VehiculoALquiladoException();
				}
			}
		}
		throw new NoEncontradoException();
	} 
	
	//TAREA 6
	public double devolverVehiculo(String matricula, 
			double porcentajeVehiculo, 
			double porcentajeConductor) throws NoEncontradoException{
		for(int i=0; i<indicador; i++) {
			if(vehiculos[i].getMatricula().equals(matricula))
			{	
				//Modifico el precio del conductor y el vehículo
				vehiculos[i].modificar(porcentajeVehiculo);
				vehiculos[i].getConductor().modificar(porcentajeConductor);
				//Guardo el valor en una variable auxiliar
				double precio = (vehiculos[i].precioDiario+vehiculos[i].getConductor().getRecargoConductorNovato())*vehiculos[i].diasAlquiler;
				//El conductor es null y se puede alquilar de nuevo
				vehiculos[i].setConductor(null);
				return precio;
			}
		}
		throw new NoEncontradoException();
	} 
	
	//TAREA 7
	public void ordenarVehiculoPorDiasAlquiler() {
		//Solucion Manu
//		OrdenarPorDiasAlquiler orden=new OrdenarPorDiasAlquiler();
//		Arrays.sort(vehiculos, orden);
		Arrays.sort(vehiculos, new OrdenarPorDiasAlquiler());
	}
	
	// TAREA 8
	public void mostrarEstadisticas() {
		int motoAlquilada = 0, motoNoAlquilada = 0, cocheAlquilado = 0, cocheNoAlquilado = 0;
		for(int i=0;i<indicador;i++) {
			if(vehiculos[i] instanceof Motocicleta) {
				if(vehiculos[i].getConductor() != null) motoAlquilada++;
				else motoNoAlquilada++;
			}
			else {
				if(vehiculos[i].getConductor() != null) cocheAlquilado++;
				else cocheNoAlquilado++;
			}
		}
		System.out.println("Motos alquiladas: "+ motoAlquilada);
		System.out.println("Motos no alquiladas: "+ motoNoAlquilada);
		System.out.println("Coches alquilados: "+ cocheAlquilado);
		System.out.println("Coches no alquilados: "+ cocheNoAlquilado);
	} 
}
