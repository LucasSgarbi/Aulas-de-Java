package model.dao;
import model.entidades.Cliente;
import model.sgbd.Banco;

public class DaoCliente {
	private String sql;
	private Cliente Cliente[];
	private Banco banco;
	
	public void setSql(String sql) {
		this.sql = sql;
	}
	public void setCliente(Cliente[] cliente) {
		Cliente = cliente;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public String getSql() {
		return sql;
	}
	public Cliente[] getCliente() {
		return Cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	
	
	
}
