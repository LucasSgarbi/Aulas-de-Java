package redes;

public interface Rede {
	public abstract boolean enviar();
	public abstract String receber();
	public abstract boolean status();
}
