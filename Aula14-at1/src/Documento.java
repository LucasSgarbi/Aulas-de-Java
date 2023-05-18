public interface Documento {
	public String ip="192.168.1.24";
	public String auth = "xk3pe";
	
	public abstract boolean imprime();
	public abstract void limpaCache();
	public abstract void cancela();
	
	
	
}
