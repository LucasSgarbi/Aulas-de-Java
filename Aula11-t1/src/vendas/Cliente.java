package vendas;

import relacionamento.Pessoa;

public class Cliente extends Pessoa{
	private double salario;

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	
}
