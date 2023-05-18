package comandos.seguranca;

import comandos.Operacao;

public class Criptografia {
	private String chave;
	private Operacao operacao;
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public String getChave() {
		return chave;
	}
	public Operacao getOperacao() {
		return operacao;
	}
	
}
