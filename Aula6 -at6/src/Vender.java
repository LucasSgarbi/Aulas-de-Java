public class Vender extends Imovel{
	private double preco;
	private Financiamento financiamento;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
	}
	
	public double getPreco() {
		return preco;
	}
	public Financiamento getFinanciamento() {
		return financiamento;
	}
	
	
}
