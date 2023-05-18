public class Sistema extends Servico implements Impressao,Rede{
	private String conexao;
	private String comando;
	private String ip;
	private String host;

	public boolean send() {
		return false;
	}

	public String receive() {
		return null;
	}
	
	public int sniff() {
		return 0;
	}

	public boolean Imprime() {
		return false;
	}

	public boolean clean() {
		return false;
	}
	
	public boolean status() {
		return false;
	}

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
	
	
}
