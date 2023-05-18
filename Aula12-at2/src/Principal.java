public class Principal {
	Aluno a1;
	Professor p1;
	
	public void entraDados() {
		a1 = new Aluno();
		a1.setNome("Lucas");
		a1.setCpf("123456789");
		a1.setEndereco("Rua X , 123");
		a1.setEnem(800.25);
		a1.setRa(123456789);
		a1.setSemestre(4);
		
		p1 = new Professor();
		p1.setNome("Marcus");
		p1.setCpf("123456789");
		p1.setCtps("123456789");
		p1.setEndereco("Rua X , 123");
		p1.setSalario("12000");
		p1.setTitulacao("DR");
	
		
		
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Aluno");
		System.out.println("Nome     : "+ a1.getNome());
		System.out.println("CPF      : "+ a1.getCpf());
		System.out.println("Endereço : "+ a1.getEndereco());
		System.out.println("Enem     : "+ a1.getEnem());
		System.out.println("Ra       : "+ a1.getRa());
		System.out.println("Semestre : "+ a1.getSemestre());		
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("Professor");
		System.out.println("Nome     : "+ p1.getNome());
		System.out.println("CPF      : "+ p1.getCpf());
		System.out.println("Endereço : "+ p1.getEndereco());
		System.out.println("Ctps     : "+ p1.getCtps());
		System.out.println("Endereco : "+ p1.getSalario());
		System.out.println("Titulação: "+ p1.getTitulacao());
		System.out.println("-----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
