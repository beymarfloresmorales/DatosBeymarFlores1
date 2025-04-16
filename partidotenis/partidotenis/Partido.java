package partidotenis;

public class Partido {

	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador ganador;
	
	public Partido (Jugador jugador1, Jugador jugador2) {
		this.jugador1=jugador1;
		this.jugador2=jugador2;
		this.ganador=null;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}
	
	public void ganador(Jugador jugador1, Jugador jugador2) {
		double resultado1=0;
		double resultado2=0;
		
		do {
			resultado1= Math.random() * jugador1.getRankingAtp();
			resultado2= Math.random() * jugador2.getRankingAtp();
		
			if (resultado1<resultado2) {
				ganador=jugador2;
			} else if (resultado1>resultado2) {
				ganador=jugador1;
			}
		}while(resultado1==resultado2);
	}
	
	public void jugar() {		
		ganador(jugador1, jugador2);		
		ganador.setRankingAtp(ganador.getRankingAtp()+1);	
	}

	public Jugador getGanador() {
		// TODO Auto-generated method stub
		return ganador;
	}
} 