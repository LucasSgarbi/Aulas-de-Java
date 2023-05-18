
public class Admistrativo extends Funcionario{
	
	private double adcional;
	private String setor;
	
	public double getAdcional() {
		return adcional;
	}
	public void setAdcional(double adcional) {
		this.adcional = adcional;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double calculaSalario() {
		double valor = this.getAdcional() + this.getSalario();
		return valor;
		
	}
	
}
