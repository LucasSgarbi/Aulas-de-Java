package cadastro;

public class Pessoa {
	private String cpf;
	private String nome;
	private String nacimento;
	private Endereco endereco;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNacimento(String nacimento) {
		this.nacimento = nacimento;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getNacimento() {
		return nacimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	

}
