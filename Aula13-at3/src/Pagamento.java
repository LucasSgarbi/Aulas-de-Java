public abstract class Pagamento {
	private double salarioBase;
	private double tatalImposto;
	private double salarioLiquido;
	
	public abstract double calcularValor();
	
	public abstract double calcularIr();

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setTatalImposto(double tatalImposto) {
		this.tatalImposto = tatalImposto;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getTatalImposto() {
		return tatalImposto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	
	
}
