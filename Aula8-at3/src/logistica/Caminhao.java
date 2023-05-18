package logistica;

public class Caminhao {
	private String placa;
	private int ano;
	private long km;
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setKm(long km) {
		this.km = km;
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getAno() {
		return ano;
	}
	public long getKm() {
		return km;
	}
	 
}
