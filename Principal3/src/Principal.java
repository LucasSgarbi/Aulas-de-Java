public class Principal {
	Professor p1,p2;
	Diciplina d1,d2,d3;
	
	
	public void entraDados() {
		p1 = new Professor();
		p1.setCtps(1234);
		p1.setNome("João");
		p1.setSalario(5000);
		p1.setTitulo("Mestre");
		
		p2 = new Professor();
		p2.setCtps(5678);
		p2.setNome("Maria");
		p2.setSalario(6000);
		p2.setTitulo("Doutor");
		
		
		d1 = new Diciplina();
		d1.setNome("Adimistração");
		d1.setSigla("ADM");
		d1.setCarga(4);
		d1.setProfessor(p1);
		
		d2 = new Diciplina();
		d2.setNome("Programação Orientada a Objeto");
		d2.setSigla("POO");
		d2.setCarga(4);
		d2.setProfessor(p1);
		
		d3 = new Diciplina();
		d3.setNome("Sistema de Informação");
		d3.setSigla("SI");
		d3.setCarga(4);
		d3.setProfessor(p2);
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Ctps      : "+ p1.getCtps());
		System.out.println("Nome      : "+ p1.getNome());
		System.out.println("Salario   : "+ p1.getSalario());
		System.out.println("Titulo    : "+ p1.getTitulo());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Ctps      : "+ p2.getCtps());
		System.out.println("Nome      : "+ p2.getNome());
		System.out.println("Salario   : "+ p2.getSalario());
		System.out.println("Titulo    : "+ p2.getTitulo());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Nome             : "+ d1.getNome());
		System.out.println("Sigla            : "+ d1.getSigla());
		System.out.println("Carga            : "+ d1.getCarga());
		System.out.println("Professor Ctps   : "+ d1.getProfessor().getCtps());
		System.out.println("Professor Nome   : "+ d1.getProfessor().getNome());
		System.out.println("Professor Salario: "+ d1.getProfessor().getSalario());
		System.out.println("Professor Titulo : "+ d1.getProfessor().getTitulo());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Nome    : "+ d2.getNome());
		System.out.println("Sigla   : "+ d2.getSigla());
		System.out.println("Carga   : "+ d2.getCarga());
		System.out.println("Professor Ctps   : "+ d2.getProfessor().getCtps());
		System.out.println("Professor Nome   : "+ d2.getProfessor().getNome());
		System.out.println("Professor Salario: "+ d2.getProfessor().getSalario());
		System.out.println("Professor Titulo : "+ d2.getProfessor().getTitulo());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Nome    : "+ d3.getNome());
		System.out.println("Sigla   : "+ d3.getSigla());
		System.out.println("Carga   : "+ d3.getCarga());
		System.out.println("Professor Ctps   : "+ d3.getProfessor().getCtps());
		System.out.println("Professor Nome   : "+ d3.getProfessor().getNome());
		System.out.println("Professor Salario: "+ d3.getProfessor().getSalario());
		System.out.println("Professor Titulo : "+ d3.getProfessor().getTitulo());
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
