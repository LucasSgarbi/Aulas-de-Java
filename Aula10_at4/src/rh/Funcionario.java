package rh;

import departamento.Atividade;

public class Funcionario {
	private String sigla;
	private String nome;
	private Atividade atividade[];
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAtividade(Atividade[] atividade) {
		this.atividade = atividade;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public Atividade[] getAtividade() {
		return atividade;
	}
	
	
	
}
