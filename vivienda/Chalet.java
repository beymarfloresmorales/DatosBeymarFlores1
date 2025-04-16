package vivienda;

public class Chalet extends Vivienda{
	private double metrosJardin;
	private boolean piscina;
	
	
	public Chalet(int numHabitaciones, double metroCuadrado, String calle, int numCalle, 
			double metrosJardin,boolean piscina) {
		super(numHabitaciones, metroCuadrado, calle, numCalle);
		this.metrosJardin=metrosJardin;
		this.piscina=piscina;
		
	
	}
	public double getMetrosJardin() {
		return metrosJardin;
	}
	public void setMetrosJardin(double metrosJardin) {
		this.metrosJardin = metrosJardin;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	@Override
	public String toString() {
		return super.toString()+ "\nChalet [metrosJardin=" + metrosJardin + ", piscina=" + piscina + "]";
	} 
}