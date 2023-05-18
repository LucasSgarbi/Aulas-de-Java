package compras;

import relacionamento.Pessoa;

public class Fornecedor extends Pessoa{
	private String gerente;

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getGerente() {
		return gerente;
	}
	
}
