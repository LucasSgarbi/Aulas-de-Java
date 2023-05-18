package controller;
import model.dao.DaoCliente;
import model.entidades.Cliente;


public class ControllerCliente {
	private String admin;
	private Cliente cliente;
	private DaoCliente daocliente;
	
	
	
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setDaocliente(DaoCliente daocliente) {
		this.daocliente = daocliente;
	}

	
	public String getAdmin() {
		return admin;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public DaoCliente getDaocliente() {
		return daocliente;
	}

	
	
	
	
}
