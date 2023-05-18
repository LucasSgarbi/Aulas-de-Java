package veiculo.passageiro;

import departamento.rh.Funcionario;
import veiculo.trasporte.Veiculo;

public class Onibus extends Veiculo{
	private int assentos;
	private Funcionario funcionario;
	
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public int getAssentos() {
		return assentos;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	
}
