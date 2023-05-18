public class Mba extends Aluno {
	private String tcc;
	public double Media() {
		return this.getNota1()*0.2 + this.getNota2()*0.8;
	}
	public String getTcc() {
		return tcc;
	}
	public void setTcc(String tcc) {
		this.tcc = tcc;
	}
	
	
}
