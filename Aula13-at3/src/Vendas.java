public class Vendas extends Pagamento{
	private double comissao;
	private double totalVendas;
	
	public double calcularIr() {
		return this.getSalarioBase()*0.15;
	}
	public double calcularValor() {
		return this.getSalarioBase() + this.getComissao() * this.getTotalVendas() - this.calcularIr() ;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
}
