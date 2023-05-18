
public abstract class Aluno {
	private long ra;
	private String nome;
	private int semestre;
	
	public abstract double media();
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public long getRa() {
		return ra;
	}
	public String getNome() {
		return nome;
	}
	public int getSemestre() {
		return semestre;
	}
	
	
	
}
