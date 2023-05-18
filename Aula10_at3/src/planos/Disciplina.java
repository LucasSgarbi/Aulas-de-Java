package planos;
import secretaria.Aluno;

public class Disciplina {
	private String sigla;
	private String nome;
	private Aluno aluno[];
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public Aluno[] getAluno() {
		return aluno;
	}
	
	
	
	
}
