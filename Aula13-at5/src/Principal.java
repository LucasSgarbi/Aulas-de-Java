public class Principal {
	Aereo a1;
	Terrestre t1;
	Aquatico aq1;
	
	public void entraDados() {
		a1 =new Aereo();
		a1.setAno(2023);
		a1.setHoras(8);
		a1.setLicenca("abc");
		a1.setLitros(200);
		a1.setPrefixo("AQ1");
		a1.setValor(30000000);
		
		t1 = new Terrestre();
		t1.setAno(2023);
		t1.setConsumo(150);
		t1.setKm(10);
		t1.setLicenca("abc");
		t1.setPlaca("ABC1234");
		t1.setValor(2000000);
		
		aq1 = new Aquatico();
		aq1.setAno(2023);
		aq1.setAutonomia(21.30);
		aq1.setLicenca("abc");
		aq1.setNome("Subimarino");
		aq1.setTanque(200);
		aq1.setValor(500000);
		
		
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Aereo");
		System.out.println("Ano      : "+ a1.getAno());
		System.out.println("Horas    : "+ a1.getHoras());
		System.out.println("Licença  : "+ a1.getLicenca());
		System.out.println("Litros   : "+ a1.getLitros());
		System.out.println("Prefixo  : "+ a1.getPrefixo());
		System.out.println("Valor    : "+ a1.getValor());
		System.out.println("Gastos   : "+ a1.Gasto());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Terrestre");
		System.out.println("Ano      : "+ t1.getAno());
		System.out.println("Consumo  : "+ t1.getConsumo());
		System.out.println("Licença  : "+ t1.getLicenca());
		System.out.println("km       : "+ t1.getConsumo());
		System.out.println("Placa    : "+ t1.getPlaca());
		System.out.println("Valor    : "+ t1.getValor());
		System.out.println("Gastos   : "+ t1.Gasto());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Aquatico");
		System.out.println("Ano      : "+ aq1.getAno());
		System.out.println("Autonomia: "+ aq1.getAutonomia());
		System.out.println("Licença  : "+ aq1.getLicenca());
		System.out.println("Nome     : "+ aq1.getNome());
		System.out.println("Tanque   : "+ aq1.getTanque());
		System.out.println("Valor    : "+ aq1.getValor());
		System.out.println("Gastos   : "+ aq1.Gasto());
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
