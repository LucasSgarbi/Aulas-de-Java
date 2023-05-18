
public abstract class Veiculo {
	private String licenca;
	private int ano;
	private double valor;
	
	public abstract double Gasto();

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
