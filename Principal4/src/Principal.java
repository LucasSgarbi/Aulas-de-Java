public class Principal {
	Veiculo v1;
	Motorista m1;
	
	
	public void entraDados() {
		m1 = new Motorista();
		m1.setCnh("123456789");
		m1.setCidade("Tabatinga");
		m1.setNome("Lucas Sgarbi Aravéchia");
		
		v1 = new Veiculo();
		v1.setPlaca("1234567");
		v1.setAno(2001);
		v1.setMotorista(m1);
		v1.setModelo("Ford K");	
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("CNH       : "+ m1.getCnh());
		System.out.println("Nome      : "+ m1.getNome());
		System.out.println("Cidade    : "+ m1.getCidade());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Placa            : "+ v1.getPlaca());
		System.out.println("Modelo           : "+ v1.getModelo());
		System.out.println("Ano              : "+ v1.getAno());
		System.out.println("Motorista Nome   : "+ v1.getMotorista().getNome());
		System.out.println("Motorista CNH    : "+ v1.getMotorista().getCnh());
		System.out.println("Motorista Cidade : "+ v1.getMotorista().getCidade());
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
