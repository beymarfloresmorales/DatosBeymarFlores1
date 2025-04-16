package librofutbolista;

import java.util.Comparator;

public class OrdenEdad implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		// TODO Auto-generated method stub
		if (o1.getEdad()>o2.getEdad()) {
			return 1;
		}
		else if (o1.getEdad()<o2.getEdad()) {
			return -1;
		}
		return 0;
	}

}
