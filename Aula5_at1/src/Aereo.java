
public class Aereo extends Veiculo {
	private String prefixo;
	private long autonomia;
	
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public void setAutonomia(long autonomia) {
		this.autonomia = autonomia;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public long getAutonomia () {
		return autonomia;
	}
}
