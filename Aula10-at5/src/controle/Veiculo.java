package controle;

public class Veiculo {
	private String placa;
	private String cor;
	private Condutor condutor;
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getCor() {
		return cor;
	}
	public Condutor getCondutor() {
		return condutor;
	}
	
	
	
}
