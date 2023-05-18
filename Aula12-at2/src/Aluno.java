public class Aluno extends Pessoa {
	private long ra;
	private int semestre;
	private double enem;
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void setEnem(double enem) {
		this.enem = enem;
	}
	
	public long getRa() {
		return ra;
	}
	public int getSemestre() {
		return semestre;
	}
	public double getEnem() {
		return enem;
	}
	
	
}
