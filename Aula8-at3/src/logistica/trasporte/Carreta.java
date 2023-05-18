package logistica.trasporte;

import logistica.Caminhao;

public class Carreta {
	private String placa;
	private int comprimento;
	private int eixos;
	private Caminhao caminhao;
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getComprimento() {
		return comprimento;
	}
	public int getEixos() {
		return eixos;
	}
	public Caminhao getCaminhao() {
		return caminhao;
	}
	
}	
	
