package pessoas;

import daos.Dao;
import redes.Rede;
import redes.Seguranca;

public class Sistema extends Dao implements Rede, Seguranca  {
	private String id;
	private String nome;
	private String funcao;
	private ProductOnwer productOnwer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public ProductOnwer getProductOnwer() {
		return productOnwer;
	}
	public void setProductOnwer(ProductOnwer productOnwer) {
		this.productOnwer = productOnwer;
	}

	public void criptogtafia() {
		
	}

	public String discriptografia() {
		return null;
	}

	public boolean enviar() {
		return false;
	}

	public String receber() {
		return null;
	}
	
	public boolean status() {
		return false;
	}
	
	
	
	
}
