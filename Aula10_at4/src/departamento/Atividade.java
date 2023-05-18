package departamento;

public class Atividade {
	private long ra;
	private String nome;
	private Relatorio relatorio[];
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRelatorio(Relatorio[] relatorio) {
		this.relatorio = relatorio;
	}
	
	public long getRa() {
		return ra;
	}
	public String getNome() {
		return nome;
	}
	public Relatorio[] getRelatorio() {
		return relatorio;
	}
	
	
	
	
}
