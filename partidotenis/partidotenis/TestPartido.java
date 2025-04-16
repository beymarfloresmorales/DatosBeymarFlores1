package partidotenis;

public class TestPartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Jugador jugador1 = new Jugador("Nadal",1200);
       Jugador jugador2 = new Jugador ("Federer", 1100);  
       Partido partido = new Partido (jugador1, jugador2);
       System.out.println(jugador1);
       System.out.println(jugador2);
       
       partido.jugar();
       
       System.out.println("El ganador es :"+ partido.getGanador());
       
       System.out.println(jugador1);
       System.out.println(jugador2);
       
       
       
       
      
       
       
       
	}

} 