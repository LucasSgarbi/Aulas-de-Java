public class Principal {
	Aluno a1, a2, a3;
	
	public void entraDados() {
		a1 = new Aluno();
		a1.setRa(1234);
		a1.setNome("Lucas Sgarbi Aravéchia");
		a1.setCidade("Tabatinga");
		a1.setSemestre(4);
		
		a2 = new Aluno();
		a2.setRa(5678);
		a2.setNome("Isabela Furriel");
		a2.setCidade("Itapolis");
		a2.setSemestre(4);
		
		a3 = new Aluno();
		a3.setRa(9012);
		a3.setNome("Sabrina Bernardino");
		a3.setCidade("Matão");
		a3.setSemestre(4);

	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Ra      : "+ a1.getRa());
		System.out.println("Nome    : "+ a1.getNome());
		System.out.println("Cidade  : "+ a1.getCidade());
		System.out.println("Semestre: "+ a1.getSemestre());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Ra      : "+ a2.getRa());
		System.out.println("Nome    : "+ a2.getNome());
		System.out.println("Cidade  : "+ a2.getCidade());
		System.out.println("Semestre: "+ a2.getSemestre());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Ra      : "+ a3.getRa());
		System.out.println("Nome    : "+ a3.getNome());
		System.out.println("Cidade  : "+ a3.getCidade());
		System.out.println("Semestre: "+ a3.getSemestre());
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
