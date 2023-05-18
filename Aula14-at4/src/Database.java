
public class Database implements Servico,Conector,Componente{
	private String conexao;
	private String comando;
	private String ip;
	private String host;
	public String getConexao() {
		return conexao;
	}
	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	public String getComando() {
		return comando;
	}
	public void setComando(String comando) {
		this.comando = comando;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	public boolean habita() {
		return false;
	}

	public void desabilitar() {
	}

	public boolean instancia() {
		return false;
	}

	public boolean envia() {
		return false;
	}
	
	public String receber() {
		return null;
	}
	
	public boolean status() {
		return false;
	}
	
	public boolean cria() {
		return false;
	}

	public int testa() {
		return 0;
	}

	public boolean destroy() {
		return false;
	}
	
	
}
