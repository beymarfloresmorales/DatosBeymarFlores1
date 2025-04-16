package partidotenis;

public class Jugador {
	
	private String nombre;
	private double rankingAtp;
	
	public Jugador (String nombre, double rankingAtp) {
		this.nombre=nombre;
		this.rankingAtp=rankingAtp;
	}

	public String getNombre() {
		return nombre;
	}
	public double getRankingAtp() {
		return rankingAtp;
	}

	public void setRankingAtp(double rankingAtp) {
		this.rankingAtp = rankingAtp;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", rankingAtp=" + rankingAtp + "]";
	}
} 