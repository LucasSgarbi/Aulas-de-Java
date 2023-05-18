public class Endereco {
	private String rua;
	private Bairro bairro;
	private Cidade cidade;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public Cidade getCidade() {
		return cidade;
	}
	
	
}
