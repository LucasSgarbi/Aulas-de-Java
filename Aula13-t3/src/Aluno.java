
public class Aluno {
	private String nome;
	private String ra;
	private int idade;
	private int semestre;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public Aluno()
	{
		
	}
	
	public Aluno(String nome, String ra, int idade, int semestre) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.idade = idade;
		this.semestre = semestre;	

	}
	

}
