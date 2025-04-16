package tiendajuegos;

import java.util.Comparator;

public class OrdenImporteReservaClave implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		
		if(o1.getImporteReservas()>o2.getImporteReservas()) {
			return 1;
		}
		if (o1.getImporteReservas()<o2.getImporteReservas()) {
			return -1;
		}
		else {
			return o1.getClave().compareTo(o1.getClave());
		}
	}

}
