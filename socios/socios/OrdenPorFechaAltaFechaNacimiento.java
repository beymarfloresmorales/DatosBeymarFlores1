package socios;

import java.util.Comparator;

public class OrdenPorFechaAltaFechaNacimiento implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		if (o1.getFechaAlta().equals(o2.getFechaAlta()) ) {
			return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
		}
		
		return o1.getFechaAlta().compareTo(o2.getFechaAlta());
	}

}
