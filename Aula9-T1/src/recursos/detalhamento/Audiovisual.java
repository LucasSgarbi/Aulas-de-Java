package recursos.detalhamento;
import recursos.geral.Equipamento;
public class Audiovisual extends Equipamento {
	private String tipo;
	private long potencia;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPotencia(long potencia) {
		this.potencia = potencia;
	}
	
	public String getTipo() {
		return tipo;
	}
	public long getPotencia() {
		return potencia;
	}
}
