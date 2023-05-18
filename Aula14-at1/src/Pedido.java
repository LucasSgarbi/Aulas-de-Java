public class Pedido implements Documento {
	private long numero;
	private String data;
	private double total;
	
	
	public boolean imprime() {
		return true;
	}

	public void limpaCache() {
	}

	public void cancela() {
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
}
