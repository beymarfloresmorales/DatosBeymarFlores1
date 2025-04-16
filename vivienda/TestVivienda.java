package vivienda;

public class TestVivienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vivienda v = new Vivienda(3,60,"calle Olvido",5);
		Chalet ch1 = new Chalet(4,80,"calle toby",6,20,true);
		Chalet ch2 = new Chalet(7,120, "calle Felipe II",7,10,false);
		Palacio p = new Palacio(200, "calle serrano ", 20, true);
		
		Vivienda[] viviendas=new Vivienda[4];
		
		viviendas[0]=v;
		viviendas[1]=ch1;
		viviendas[2]=ch2;
		viviendas[3]=p;
		
		int cont=0;
		for (int i=0; i<4; i++) {
			System.out.println();
			System.out.println(viviendas[i].toString());
			System.out.println(viviendas[i].getClass());
/*			if (viviendas[i].getClass() == Chalet.class) {
				cont++;
			}*/
			
			if (viviendas[i] instanceof Chalet) {
				cont++;
			}
		}
		System.out.println("El numero de chales es "+cont);
		
		String alumno1="Luis";
		String alumno2="Pedro";
		String alumno3=new String("Luis");
		
		System.out.println(alumno1==alumno2);
		System.out.println(alumno1==alumno3);
		System.out.println(alumno1.equals(alumno3));
		
		System.out.println(ch1.equals(ch2));
			
			
	}
 
}
