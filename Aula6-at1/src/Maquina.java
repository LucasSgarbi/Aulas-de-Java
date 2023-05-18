public class Maquina {
	private long id;
	private String descricao;
	private Equipamento equipamento;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	
	
}
