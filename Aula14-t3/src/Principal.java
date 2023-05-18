public class Principal {
	Engenheiro e1;
	Fusileiro f1;
	Medico m1;
	
	
	public void entraDados() {
		e1 = new Engenheiro();
		e1.setFerramentas(1234);
		e1.setId(1);
		e1.setName("Lucas");
		e1.setPontos(10);
		e1.setVidas(100);
		
		f1 = new Fusileiro();
		f1.setArmas(1234);
		f1.setMortes(1);
		f1.setTiros(100);
		f1.setId(2);
		f1.setName("João");
		f1.setPontos(10);
		f1.setVidas(100);
		
		m1 = new Medico();
		m1.setSalvamento(1);
		m1.setId(2);
		m1.setName("Maria");
		m1.setPontos(10);
		m1.setVidas(100);
			
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Engenheiro");
		System.out.println("Feramentas: "+ e1.getFerramentas());
		System.out.println("Id        : "+ e1.getId());
		System.out.println("Nome      : "+ e1.getName());
		System.out.println("Pontos    : "+ e1.getPontos());
		System.out.println("Vidas     : "+ e1.getVidas());	
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Fusileiro");
		System.out.println("Id        : "+ f1.getId());
		System.out.println("Nome      : "+ f1.getName());
		System.out.println("Pontos    : "+ f1.getPontos());
		System.out.println("Vidas     : "+ f1.getVidas());	
		System.out.println("Armas     : "+ f1.getArmas());
		System.out.println("Mortes    : "+ f1.getMortes());
		System.out.println("Tiros     : "+ f1.getTiros());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Medico");
		System.out.println("Id        : "+ m1.getId());
		System.out.println("Nome      : "+ m1.getName());
		System.out.println("Pontos    : "+ m1.getPontos());
		System.out.println("Vidas     : "+ m1.getVidas());	
		System.out.println("Salvamento: "+ m1.getSalvamento());
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
