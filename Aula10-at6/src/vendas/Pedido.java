package vendas;

import estoque.Produto;

public class Pedido {
	private long numero;
	private String data;
	private double valor;
	private Vendedor vendedor;
	private Produto produto[];
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	
	public long getNumero() {
		return numero;
	}
	public String getData() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public Produto[] getProduto() {
		return produto;
	}
	
	
	
	
	
	
}
