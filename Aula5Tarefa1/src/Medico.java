public class Medico extends Pessoa{
	private long crm;
	private String especialidade;
	
	public void setCrm(long crm) {
		this.crm = crm;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public long getCrm() {
		return crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	
	

}
