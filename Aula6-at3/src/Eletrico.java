public class Eletrico extends Equipamento{
	private double voltz;
	private double amperes;
	private int potencia;
	
	public void setVoltz(double voltz) {
		this.voltz = voltz;
	}
	public void setAmperes(double amperes) {
		this.amperes = amperes;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public double getVoltz() {
		return voltz;
	}
	public double getAmperes() {
		return amperes;
	}
	public int getPotencia() {
		return potencia;
	}
	
}
