public class Graduacao extends Aluno{
	private String curso;


	public double Media() {
		return this.getNota1()*0.7 + this.getNota2()*0.3;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}	
	
}
