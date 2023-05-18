public class PosGraduacao extends Aluno{
	private String monografia;
	
	public double Media() {
		return this.getNota1()*0.5 + this.getNota2()*0.5;
	}

	public String getMonografia() {
		return monografia;
	}

	public void setMonografia(String monografia) {
		this.monografia = monografia;
	}

}
