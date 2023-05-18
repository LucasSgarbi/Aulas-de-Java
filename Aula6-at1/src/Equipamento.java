public class Equipamento {
	private String nome;
	private String tipo;
	private Componente componente;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public Componente getComponente() {
		return componente;
	}
	
	
	
	
}
