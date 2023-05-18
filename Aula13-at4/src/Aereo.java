public class Aereo extends Veiculo {
	private String prefixo;
	private int horas;
	private double litros;
	
	public double Gasto() {
		return this.getLitros()*this.getHoras();
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	
}
