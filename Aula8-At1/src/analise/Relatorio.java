package analise;

public class Relatorio {
	private long sequencia;
	private String descricao;
	private int nota;
	
	public void setSequencia(long sequencia) {
		this.sequencia = sequencia;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public long getSequencia() {
		return sequencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getNota() {
		return nota;
	}
	
	
}
