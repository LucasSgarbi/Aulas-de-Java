package rh;

import cadastro.Pessoa;

public class Funcionario extends Pessoa{
	private String ctps;
	private double salario;
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCtps() {
		return ctps;
	}
	public double getSalario() {
		return salario;
	}
	
	
	
}
