package espacos.social;

import recursos.geral.Equipamento;

public class Anfiteatro {
	private String nome;
	private int cadeiras;
	private Equipamento equipamento;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCadeiras(int cadeiras) {
		this.cadeiras = cadeiras;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public String getNome() {
		return nome;
	}
	public int getCadeiras() {
		return cadeiras;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	
	
}
