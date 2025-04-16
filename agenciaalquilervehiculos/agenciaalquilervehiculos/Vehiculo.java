package agenciaalquilervehiculos;

public class Vehiculo implements AumentoPorcentaje{
    String matricula;
    int numRuedas;
    double precioDiario;
    int diasAlquiler;
    private Conductor conductor;
    
    public Vehiculo(String matricula,  	
    		int numRuedas,
    		double precioDiario) {
    	this.matricula=matricula;
    	this.numRuedas=numRuedas;
    	this.precioDiario=precioDiario;
    	diasAlquiler=0;
    	conductor=null;
    }

	public double getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(double precioDiario) {
		this.precioDiario = precioDiario;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getNumRuedas() {
		return numRuedas;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", numRuedas=" + numRuedas + ", precioDiario=" + precioDiario
				+ ", diasAlquiler=" + diasAlquiler + ", conductor=" + conductor + "]";
	}

	@Override
	public void modificar(double porcentaje) {
		// TODO Auto-generated method stub
		precioDiario+=precioDiario*porcentaje;
		// version Andres
//		double aumento=precioDiario*porcentaje;
//		precioDiario+=aumento;
	}
    
    
}
