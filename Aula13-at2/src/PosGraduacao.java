
public class PosGraduacao extends Aluno{
	private double artigo;
	private double banca;
	
	
	public double getArtigo() {
		return artigo;
	}
	public double getBanca() {
		return banca;
	}


	public void setArtigo(double artigo) {
		this.artigo = artigo;
	}
	public void setBanca(double banca) {
		this.banca = banca;
	}

	public double media() {
		return this.getArtigo()*0.3 + this.getBanca()*0.7;
	}
	
	
}
