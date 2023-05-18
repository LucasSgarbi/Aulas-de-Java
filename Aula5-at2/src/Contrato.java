public class Contrato extends Documento{
	public String proprietario;
	public double valor;
	public String validade;
	
	public String getProprietario() {
		return proprietario;
	}
	public double getValor() {
		return valor;
	}
	public String getValidade() {
		return validade;
	}
	
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	

}
