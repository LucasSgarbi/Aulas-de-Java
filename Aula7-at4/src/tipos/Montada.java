package tipos;
import estoque.Peca;

public class Montada extends Peca{
	private String item;
	private String especificacao;
	
	public void setItem(String item) {
		this.item = item;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	public String getItem() {
		return item;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	
	
}
