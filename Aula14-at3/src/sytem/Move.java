package sytem;
public interface Move {
	public int distancia=1;
	
	public abstract void walk(int steps);
	public abstract int pos();
	
}
