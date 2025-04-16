package socios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ClubSocio {

	private int presupuesto;
	private int totalSocios;
	
	HashMap<Integer,Socio> socios;
//	ArrayList<Socio> socios;
//	private int numSocios=0;
//	private Socio[] socios;
	
	
	
	public ClubSocio(int presupuesto, int totalSocios) {
		this.presupuesto=presupuesto;
		this.totalSocios=totalSocios;
		socios=new HashMap<>();
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public int getTotalSocios() {
		return totalSocios;
	}
	
	// TAREA 4
	public void altaSocio(Socio socio) {
//		socios[numSocios]=socio;
//		numSocios++;
		socios.put(socio.getNumSocio(),socio);
		socio.calcularCuotaAnual(presupuesto, totalSocios);
	}
	
	public boolean bajaSocio(int numSocio) {
		
		if (socios.remove(numSocio)!=null) {
			return true;
		}
		
//		Iterator<Socio> it=socios.iterator();
//		while(it.hasNext()) {
//			if (it.next().getNumSocio()==numSocio) {
//				it.remove();
//				return true;
//			}
//		}
		
		
		// Version no utilizar
//		Socio aux=null;
//		for (int i=0; i<socios.size(); i++) {
//			if (socios.get(i).getNumSocio()==numSocio) {
//				aux=socios.get(i);
//				break;
//			}
//		}
//		for (Socio s: socios) {
//			if (s.getNumSocio()==numSocio) {
//				aux=s;
//				break;
//			}
//		}
//		if (aux==null) {
//			socios.remove(aux);
//			return true;
//		}
		
		
		// Esto no
//		for (int i=0; i<socios.size(); i++) {
//			if (socios.get(i).getNumSocio()==numSocio) {
//				socios.remove(i);
//			}
//		}
//		for (Socio s: socios) {
//			if (s.getNumSocio()==numSocio) {
//				socios.remove(s);
//			}
//		}
		

//		for (int i=0; i<totalSocios; i++) {
//			if (socios[i].getNumSocio()==numSocio) {
//				socios[i]=socios[numSocios-1];
//				socios[numSocios-1]=null;
//				numSocios--;
//				return true;
//			}
//		}
		return false;
	}
	
	// TAREA 5
	public boolean modificarSocio(Socio socio) {
		
		// Version ArrayList
		return socios.put(socio.getNumSocio(), socio)==null?false:true;
		
//		for (Socio s: socios) {
//			if (s.getNumSocio()==socio.getNumSocio()) {
//				s.setCorreo(socio.getCorreo());
//				s.setNombreTitular(socio.getNombreTitular());
//				s.setFechaNacimiento(socio.getFechaNacimiento());
//				s.setTelefono(socio.getTelefono());
//				return true;
//			}
//		}
		
		// Version LinkedList
//		for (int i=0; i<socios.size(); i++) {
//			if (socios.get(i).getNumSocio()==socio.getNumSocio()) {
//				socios.set(i,socio);
//				return true;
//			}
//		}
	
		
		
//		for (int i=0; i<numSocios; i++) {
//			if (socios[i].getNumSocio()==socio.getNumSocio()) {
//				socios[i]=socio;
//				return true;
//			}
//		}
//		return false;		
	}
	
	// TAREA 6
	public void mostrarSocios() {
//		Socio[] sociosAux=Arrays.copyOf(socios,numSocios);
//		Arrays.sort(sociosAux);
//		Collections.sort(socios);
		Set<Map.Entry<Integer,Socio>> sociosEntrySet=socios.entrySet();
		TreeSet<Map.Entry<Integer,Socio>> sociosOrdenados=new TreeSet<>(
			new Comparator<Map.Entry<Integer,Socio>>() {

				@Override
				public int compare(Entry<Integer, Socio> o1, Entry<Integer, Socio> o2) {
					// TODO Auto-generated method stub
					return o1.getValue().getNombreTitular().compareTo(o2.getValue().getNombreTitular());
				}
			}
		);
		sociosOrdenados.addAll(sociosEntrySet);
		
		
		System.out.println(socios.toString());
	}

	
	//TAREA 8
	public void mostrarSociosVIP() {
//		Socio[] sociosAux=Arrays.copyOf(socios,numSocios);
//		Arrays.sort(sociosAux, new OrdenPorFechaAltaFechaNacimiento());
//		for (int i=0; i<numSocios; i++) {
//			if (sociosAux[i] instanceof SocioVip) {
//				System.out.println(sociosAux[i]);
//			}
//		}
		// Version sin lambda
//		Collections.sort(socios,  new OrdenPorFechaAltaFechaNacimiento());
//		for (Socio s: socios) {
//		if (s instanceof SocioVip) {
//			System.out.println(s);
//		}
		
		// Version sort con lambda
//		Collections.sort(socios, (o1,o2)-> {
//			if (o1.getFechaAlta().equals(o2.getFechaAlta()) ) {
//				return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
//			}
//			
//			return o1.getFechaAlta().compareTo(o2.getFechaAlta());
//		});
//		for (Socio s: socios) {
//		if (s instanceof SocioVip) {
//			System.out.println(s);
//		}
		
		// Version caluclo lambda
		socios.values().stream().filter(l->l instanceof SocioVip).sorted((o1,o2)-> {
			if (o1.getFechaAlta().equals(o2.getFechaAlta()) ) {
				return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
			}
			
			return o1.getFechaAlta().compareTo(o2.getFechaAlta());
		}).forEach(p->{System.out.println(p);});
		
		
	}

		
	

	
}
