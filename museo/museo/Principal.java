package museo;

public class Principal {

	public static void main(String[] args) {
		
		Autor autor01 = new Autor("Picasso", "Española", 200);
		Obra obra01 = new Obra("El Guernika", 3, autor01);
		Sala sala01 = new Sala("Sala Principal", "Norte");
		
		obra01.setSala(sala01);
		
		System.out.println(obra01);
		
	}
}