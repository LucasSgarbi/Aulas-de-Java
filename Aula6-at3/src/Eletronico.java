public class Eletronico extends Equipamento{
	private String processador;
	private String barramento;
	private int memoria;
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public void setBarramento(String barramento) {
		this.barramento = barramento;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public String getProcessador() {
		return processador;
	}
	public String getBarramento() {
		return barramento;
	}
	public int getMemoria() {
		return memoria;
	}
	
	
}
