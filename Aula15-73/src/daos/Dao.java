package daos;

public class Dao {
	private String sql;
	private boolean resultado;
	private String comandos;
	
	public boolean execultar() {
		return true;
	}
	public String execultarQuery() {
		return null;
	}
	
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public String getComandos() {
		return comandos;
	}
	public void setComandos(String comandos) {
		this.comandos = comandos;
	}
	
}
