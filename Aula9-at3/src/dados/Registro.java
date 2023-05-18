package dados;

import comandos.Operacao;

public class Registro {
	private String conteudo;
	private Operacao operacao;
	private Registro registro[];
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	public void setRegistro(Registro[] registro) {
		this.registro = registro;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public Operacao getOperacao() {
		return operacao;
	}
	public Registro[] getRegistro() {
		return registro;
	}
	
	
	
	
}
