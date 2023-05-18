public class Principal {
	Atividade a1;
	Funcionario f1;
	Relatorio r1;
	
	public void entraDados() {
		
		f1 = new Funcionario();
		f1.setNome("João");
		f1.setCtps("123456789");
		f1.setSalario(2200.00);
		
		r1 = new Relatorio();
		r1.setData("12/11/2000");
		r1.setOrdem(523);
		r1.setTexto("OK");
		
		a1 = new Atividade();
		a1.setNumero(1234);
		a1.setDescricao("ok");
		a1.setData("12/11/2000");
		a1.setFuncionario(f1);
		a1.setRelatorio(r1);
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Funcionario");
		System.out.println("Nome     : "+ f1.getNome());
		System.out.println("Ctps     : "+ f1.getCtps());
		System.out.println("Salario  : "+ f1.getSalario());
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("Relatorio");
		System.out.println("Ordem        : "+ r1.getOrdem());
		System.out.println("Data         : "+ r1.getData());
		System.out.println("Texto        : "+ r1.getTexto());
		System.out.println("-----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("Atividade");
		System.out.println("Numero       : "+ a1.getNumero());
		System.out.println("Descricao    : "+ a1.getDescricao());
		System.out.println("Data         : "+ a1.getData());
		System.out.println("Funcionario  : "+ a1.getFuncionario().getNome());
		System.out.println("Relatorio    : "+ a1.getRelatorio().getOrdem());
		System.out.println("-----------------------------------");
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
