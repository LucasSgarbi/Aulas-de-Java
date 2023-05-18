package vendas;

import crm.Cliente;
import rh.Funcionario;

public class Pedido {
	private long numero;
	private String data;
	private double total;
	private Funcionario funcionario;
	private Cliente cliente;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	
}
