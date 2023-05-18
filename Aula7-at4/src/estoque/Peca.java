package estoque;
import controle.Qualidade;

public class Peca {
	private String id;
	private String nome;
	private double preco;
	private Peca peca;
	private Qualidade qualidade;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Peca getPeca() {
		return peca;
	}
	public Qualidade getQualidade() {
		return qualidade;
	}
	
	
}
