public class Imovel {
	private long numero;
	private double iptu;
	private Endereco endereco;
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setIptu(double iptu) {
		this.iptu = iptu;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public long getNumero() {
		return numero;
	}
	public double getIptu() {
		return iptu;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
}
