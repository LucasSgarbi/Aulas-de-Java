package academico.cadastro;

import secretaria.Pessoa;

public class Aluno extends Pessoa {
	private long ra;
	private double enem;
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	public void setEnem(double enem) {
		this.enem = enem;
	}
	
	public long getRa() {
		return ra;
	}
	public double getEnem() {
		return enem;
	}
	
}
