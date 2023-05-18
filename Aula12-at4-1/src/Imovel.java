public class Imovel {
	private long id;
	private String endereco;
	private double preco;
	private Proprietario proprietario;
	public void setId(long id) {
		this.id = id;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public long getId() {
		return id;
	}
	public String getEndereco() {
		return endereco;
	}
	public double getPreco() {
		return preco;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	
	
}
