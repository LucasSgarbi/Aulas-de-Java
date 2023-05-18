
public interface Rede {
	public String pass = "OEKND";
	
	public abstract boolean send();
	public abstract String receive();
	public abstract int sniff();
	

}
