package espacos.tecnicos;

import recursos.geral.Equipamento;

public class Laboratorio {
	private int numero;
	private String tipo;
	private long capacidade;
	private Equipamento equipamento; 
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCapacidade(long capacidade) {
		this.capacidade = capacidade;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public long getCapacidade() {
		return capacidade;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	
	
}
