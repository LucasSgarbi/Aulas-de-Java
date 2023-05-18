
public class Servico {
	private String id;
	private String Usuario;
	private String Senha;
	
	public boolean conecta() {
		return true;
	} 
	public boolean desconecta() {
		return false;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	

}
