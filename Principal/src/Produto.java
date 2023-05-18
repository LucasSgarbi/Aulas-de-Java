public class Produto {
	private long id;
	private String nome;
	private double preco;
	private int estoque;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getEstoque() {
		return estoque;
	}
	
	
}
