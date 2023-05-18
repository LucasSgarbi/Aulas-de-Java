public class Aquatico extends Veiculo {
	private String nome;
	private double autonomia;
	private int tanque;
	
	public double Gasto() {
		return this.getTanque()/this.getAutonomia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public int getTanque() {
		return tanque;
	}

	public void setTanque(int tanque) {
		this.tanque = tanque;
	}

}
