public class Contrato {
	private long numero;
	private String data;
	private Imovel imovel;
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	public long getNumero() {
		return numero;
	}
	public String getData() {
		return data;
	}
	public Imovel getImovel() {
		return imovel;
	}
	
	
	
}
