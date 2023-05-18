package vendas;

import compras.Produto;

public class Pedido {
	private long numero;
	private Cliente cliente;
	private Produto produto[];
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	
	public long getNumero() {
		return numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Produto[] getProduto() {
		return produto;
	}
	
	
}
