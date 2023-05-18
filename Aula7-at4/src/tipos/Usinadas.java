package tipos;
import estoque.Peca;
public class Usinadas extends Peca {
	private String composicao;
	private int peso;
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getComposicao() {
		return composicao;
	}
	public int getPeso() {
		return peso;
	}
	
	
	
}
