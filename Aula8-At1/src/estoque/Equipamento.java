package estoque;

import analise.Relatorio;

public class Equipamento {
	private String id;
	private String nome;
	private double preco;
	private Relatorio relatorio;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Relatorio getRelatorio() {
		return relatorio;
	}
	
	
	}
