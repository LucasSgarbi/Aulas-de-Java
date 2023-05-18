public class Endereco {
	private String rua;
	private Cidade cidade;
	private Bairro bairro;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	public String getRua() {
		return rua;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public Bairro getBairro() {
		return bairro;
	}
	
}
