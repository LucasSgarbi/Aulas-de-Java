
public class Graduacao extends Aluno{
	private double prova;
	private double trabalho;
	
	public void setProva(double prova) {
		this.prova = prova;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	public double getProva() {
		return prova;
	}
	public double getTrabalho() {
		return trabalho;
	}

	public double media() {
		return this.getProva()*0.6 + this.getTrabalho()*0.4;
	}
	
	
	
}
