package estoque;

public class Fornecedor {
	private long id;
	private String nome;
	private String endereco;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	
	
	
}
