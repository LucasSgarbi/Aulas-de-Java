public class Terrestre extends Veiculo{
	private String placa;
	private double consumo;
	private int km;
	
	public double Gasto() {
		return this.getConsumo()/this.getKm();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	
}
