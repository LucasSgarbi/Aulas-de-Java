package compras;

public class Produto {
	private String nome;
	private double preco;
	private Fornecedor fornecedor[];
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setFornecedor(Fornecedor[] fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Fornecedor[] getFornecedor() {
		return fornecedor;
	}
	
	
	
}
