package secretaria.departamento;

import academico.cadastro.Aluno;
import secretaria.Pessoa;

public class Professor extends Pessoa {
	private long ctps;
	private double salario;
	private Aluno aluno;
	
	public void setCtps(long ctps) {
		this.ctps = ctps;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public long getCtps() {
		return ctps;
	}
	public double getSalario() {
		return salario;
	}
	public Aluno getAluno() {
		return aluno;
	}
	
	

}
