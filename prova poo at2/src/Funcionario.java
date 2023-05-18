public class Funcionario {
	private String nome;
	private Tercerizado tercerizado;
	private Contratado contratado;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTercerizado(Tercerizado tercerizado) {
		this.tercerizado = tercerizado;
	}
	public void setContratado(Contratado contratado) {
		this.contratado = contratado;
	}
	
	public String getNome() {
		return nome;
	}
	public Tercerizado getTercerizado() {
		return tercerizado;
	}
	public Contratado getContratado() {
		return contratado;
	}
	
	

}
