package recursos.detalhamento;

import recursos.geral.Equipamento;

public class Computador extends Equipamento {
	private int memoria;
	private int armazenamento;
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	public int getMemoria() {
		return memoria;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	
	
}
