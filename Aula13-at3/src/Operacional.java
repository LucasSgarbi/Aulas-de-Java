public class Operacional extends Pagamento {
	private double valorHora;
	private int horasTrabalhadas;

	public double calcularIr() {
		return this.getSalarioBase()*0.12;
	}
	public double calcularValor() {
		return this.getSalarioBase() + this.getHorasTrabalhadas() * this.getValorHora() - this.calcularIr() ;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	
	
}
