public class Venda extends Contrato {
	private double total;
	private int parcela;
	
	public void setTotal(double total) {
		this.total = total;
	}
	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	
	public double getTotal() {
		return total;
	}
	public int getParcela() {
		return parcela;
	}
	
	
}
