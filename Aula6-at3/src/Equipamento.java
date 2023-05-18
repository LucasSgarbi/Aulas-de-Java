public class Equipamento {
	private long numero;
	private String nome;
	private Periferico periferico;
	private Equipamento equipamento;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPeriferico(Periferico periferico) {
		this.periferico = periferico;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public long getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public Periferico getPeriferico() {
		return periferico;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	
}
