public class Curso {
	private String sigla;
	private String nome;
	private Conteudo conteudo;
	private Curso curso;
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public Conteudo getConteudo() {
		return conteudo;
	}
	public Curso getCurso() {
		return curso;
	}
	
	
}
