public class Pratica extends Diciplina {
	private String laboratorio;
	private Teorica teorica;
	
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public void setTeorica(Teorica teorica) {
		this.teorica = teorica;
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}
	public Teorica getTeorica() {
		return teorica;
	}
	
	
}
