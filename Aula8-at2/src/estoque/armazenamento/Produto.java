package estoque.armazenamento;

import estoque.Fornecedor;

public class Produto {
	private long numero;
	private String descricao;
	private double preco;
	private Fornecedor fornecedor;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public long getNumero() {
		return numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	
}
