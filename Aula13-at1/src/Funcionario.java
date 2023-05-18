
public abstract class Funcionario {

	private long ctps;
	private double salario;
	private String cargo;
	
	public abstract double calculaSalario();
		
		public long getCtps() {
		return ctps;
	}

	public void setCtps(long ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
}

