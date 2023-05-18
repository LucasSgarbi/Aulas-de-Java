public class Operacional extends Funcionario{

	private String departamento;
	private double meta;
	private double pericolosidade;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	public double getPericolosidade() {
		return pericolosidade;
	}
	public void setPericolosidade(double pericolosidade) {
		this.pericolosidade = pericolosidade;
	}
	
	public double calculaSalario() {
		return this.getSalario() + this.getPericolosidade();
	}
	
	
	
	
}
