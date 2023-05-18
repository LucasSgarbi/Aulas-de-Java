package departamento;

import rh.Funcionario;

public class Relatorio {
	private long sequencia;
	private String texto;
	private Funcionario funcionario;
	
	public void setSequencia(long sequencia) {
		this.sequencia = sequencia;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public long getSequencia() {
		return sequencia;
	}
	public String getTexto() {
		return texto;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	
}
