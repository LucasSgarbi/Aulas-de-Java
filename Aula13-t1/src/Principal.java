public class Principal {
	Caminhao cm1;
	Carreta cr1;
	
	public void entraDados() {
		
		cr1 = new Carreta();
		cr1.setEixo(4);
		cr1.setPlaca("hfde1234");
		
		cm1 = new Caminhao();
		cm1.setModelo("DVR");
		cm1.setAno("2023");
		cm1.setKm(200000);
		cm1.setPlaca("Galu1234");
		cm1.setCarreta(cr1);
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Carreta");
		System.out.println("Eixo     : "+ cr1.getEixo());
		System.out.println("Placa    : "+ cr1.getPlaca());
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("Caminhão");
		System.out.println("Ano           : "+ cm1.getAno());
		System.out.println("Modelo        : "+ cm1.getModelo());
		System.out.println("Km            : "+ cm1.getKm());
		System.out.println("Placa         : "+ cm1.getPlaca());
		System.out.println("Placa Carreta : "+ cm1.getCarreta().getPlaca());
		System.out.println("Eixo Carreta  : "+ cm1.getCarreta().getEixo());		
		System.out.println("-----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
