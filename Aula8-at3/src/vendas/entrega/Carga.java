package vendas.entrega;

import logistica.trasporte.Carreta;
import vendas.Pedido;

public class Carga {
	private long numero;
	private String data;
	private double total;
	private Pedido pedido[];
	private Carreta carreta;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	public void setCarreta(Carreta carreta) {
		this.carreta = carreta;
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
	public Pedido[] getPedido() {
		return pedido;
	}
	public Carreta getCarreta() {
		return carreta;
	}
	
	
}
