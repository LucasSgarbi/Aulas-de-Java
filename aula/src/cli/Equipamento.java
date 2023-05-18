package cli;

public class Equipamento {

	private long id;
	private String nome;
	private String marca;
	private double preco;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getMarca() {
		return marca;
	}
	public double getPreco() {
		return preco;
	}
	
	
	
}
