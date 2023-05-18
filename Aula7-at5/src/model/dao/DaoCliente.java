package model.dao;
import model.entidades.Cliente;

public class DaoCliente {
	private String sql;
	private Cliente Cliente[];
	
	public void setSql(String sql) {
		this.sql = sql;
	}
	public void setCliente(Cliente[] cliente) {
		Cliente = cliente;
	}
	
	public String getSql() {
		return sql;
	}
	public Cliente[] getCliente() {
		return Cliente;
	}
	
	
	
}
