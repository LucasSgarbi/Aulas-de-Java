package vendas;

import estoque.Fornecedor;
import estoque.armazenamento.Produto;

public class Pedido {
	private long numero;
	private String data;
	private double total;
	private Fornecedor fornecedor;
	private Produto produto;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public long getNumero() {
		return numero;
	}
	public String getData() {
		return data;
	}
	public double getTotal() {
		return total;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public Produto getProduto() {
		return produto;
	}
	
	
	
}
