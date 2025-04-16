package librofutbolista;

import java.util.Arrays;

public class Principal {
	
	
	public static void main(String[] args) {
		Futbolista futbolista1=new Futbolista("Messi","8A",25);
		Futbolista futbolista2=new Futbolista("Iniesta","2B",20);
		Futbolista futbolista3=new Futbolista("Lamin Jamal","3C",18);
		Futbolista futbolista4=new Futbolista("Odri","7D",30);
		Futbolista futbolista5=new Futbolista("Sergio Ramos","5F",27);
		
		Futbolista[] futbolistas=new Futbolista[5];
		futbolistas[0]=futbolista1;
		futbolistas[1]=futbolista2;
		futbolistas[2]=futbolista3;
		futbolistas[3]=futbolista4;
		futbolistas[4]=futbolista5;
		
		Arrays.sort(futbolistas);
		System.out.println(Arrays.toString(futbolistas));
		
		Arrays.sort(futbolistas, new OrdenNombre());
		System.out.println(Arrays.toString(futbolistas));

		Arrays.sort(futbolistas, new OrdenEdad());
		System.out.println(Arrays.toString(futbolistas));
	}

}
