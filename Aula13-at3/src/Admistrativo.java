public class Admistrativo extends Pagamento {
	private double adicional;
	private int horasExtras;
	private double valorHoraExtra;
	
	public double calcularIr() {
		return this.getSalarioBase()*0.18;
	}
	public double calcularValor() {
		return this.getSalarioBase() + this.getAdicional() + this.getHorasExtras() * this.getValorHoraExtra() - this.calcularIr() ;
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getValorHoraExtra() {
		return valorHoraExtra;
	}
	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
	
}
