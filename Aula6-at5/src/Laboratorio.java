public class Laboratorio {
	private long numero;
	private String descricao;
	private long capacidade;
	private Equipamento equipamento;
	private Avaliacao avaliacao;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setCapacidade(long capacidade) {
		this.capacidade = capacidade;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public long getNumero() {
		return numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public long getCapacidade() {
		return capacidade;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	
	
}
