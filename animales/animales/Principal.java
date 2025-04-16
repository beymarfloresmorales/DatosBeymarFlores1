package animales;

public class Principal {

	public static void main(String[] args) {
		Animal rana=new Animal("Rana","Anura",0.05,0.01);
		Mamifero ballena=new Mamifero("Ballena","Mystecetic",1000,5,1,15);
		MamiferoTerrestre perro=new MamiferoTerrestre("Perro","Can",5,10,10,6,4);
		Ave avestruz=new Ave("Avestruz","Estrucio",50,3,2,false);
		Ave paloma=new Ave("Paloma","Columba",0.6,0.2,5,true);
		System.out.println(rana);
		System.out.println(ballena);
		System.out.println(perro);
		System.out.println(avestruz);
		System.out.println(paloma);
		
		rana.setPeso(0.7);
		System.out.println(rana);
		ballena.setPeso(2000);
		System.out.println(ballena);
		paloma.setNumeroHuevos(7);
		System.out.println(paloma);
		perro.setTamanno(perro.getTamanno()*1.1);
		System.out.println(perro);
		ballena.setMesesEmbarazo(15);
		System.out.println(ballena);
		
	}
}
