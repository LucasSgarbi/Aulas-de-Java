package organizacao;

import rh.Funcionario;
import rh.Gerente;

public class Departamento {
	private String sigla;
	private String nome;
	private String local;
	private Funcionario funcionario[];
	private Gerente gerente;
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getLocal() {
		return local;
	}
	public Funcionario[] getFuncionario() {
		return funcionario;
	}
	public Gerente getGerente() {
		return gerente;
	}
	
	
	
}
