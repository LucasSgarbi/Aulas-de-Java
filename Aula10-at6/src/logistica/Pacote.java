package logistica;

import vendas.Pedido;

public class Pacote {
	private long numero;
	private double peso;
	private Entregador entregador;
	private Pedido pedido[];
	private Endereco endereco;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public long getNumero() {
		return numero;
	}
	public double getPeso() {
		return peso;
	}
	public Entregador getEntregador() {
		return entregador;
	}
	public Pedido[] getPedido() {
		return pedido;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
}
