package agenciaalquilervehiculos;

import java.util.Comparator;

public class OrdenarPorDiasAlquiler implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		if (o1.diasAlquiler==o2.diasAlquiler) {
			return o1.matricula.compareTo(o2.matricula);
		}
		return o1.diasAlquiler-o2.diasAlquiler;
		
		// Solucion manu
//		int diasAlquiler= o1.diasAlquiler-o2.diasAlquiler;
//		int matricula = o1.matricula.compareTo(o2.matricula);
//		return diasAlquiler==0? matricula:diasAlquiler;
	}

} 