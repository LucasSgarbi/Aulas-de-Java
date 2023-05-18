public class Principal {
	Graduacao g1;
	PosGraduacao pg1;
	Mba m1;
	
	public void entraDados() {
		g1 = new Graduacao();
		g1.setCurso("ADS");
		g1.setNome("Lucas");
		g1.setNota1(10);
		g1.setNota2(8);
		g1.setRa(123456789);
		
		pg1 = new PosGraduacao();
		pg1.setNome("Isabela");
		pg1.setNota1(8);
		pg1.setNota2(7);
		pg1.setRa(1234);
		pg1.setMonografia("OK");
		
		m1 = new Mba();
		m1.setNome("Sabrina");
		m1.setNota1(6);
		m1.setNota2(8);
		m1.setRa(56789);
		m1.setTcc("OK");
			
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Graduação");
		System.out.println("Curso    : "+ g1.getCurso());
		System.out.println("Nome     : "+ g1.getNome());
		System.out.println("Nota 1   : "+ g1.getNota1());
		System.out.println("Nota 2   : "+ g1.getNota2());
		System.out.println("Ra       : "+ g1.getRa());
		System.out.println("Media    : "+ g1.Media());		
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Pos Graduação");
		System.out.println("Monografia: "+ pg1.getMonografia());
		System.out.println("Nome      : "+ pg1.getNome());
		System.out.println("Nota 1    : "+ pg1.getNota1());
		System.out.println("Nota 2    : "+ pg1.getNota2());
		System.out.println("Ra        : "+ pg1.getRa());
		System.out.println("Media     : "+ pg1.Media());		
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("MBA");
		System.out.println("Monografia: "+ m1.getTcc());
		System.out.println("Nome      : "+ m1.getNome());
		System.out.println("Nota 1    : "+ m1.getNota1());
		System.out.println("Nota 2    : "+ m1.getNota2());
		System.out.println("Ra        : "+ m1.getRa());
		System.out.println("Media     : "+ m1.Media());		
		System.out.println("----------------------------------");
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
