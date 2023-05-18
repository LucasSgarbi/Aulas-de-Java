public class Principal {
	Imovel i1;
	Proprietario p1;
	
	public void entraDados() {
		
		p1 = new Proprietario();
		p1.setNome("Maria");
		p1.setNacimento("09/11/2001");
		p1.setCpf("123456789");
		
		i1 = new Imovel();
		i1.setEndereco("Rua 9 de julho,377");
		i1.setId(1);
		i1.setPreco(2000000.00);
		i1.setProprietario(p1);
		
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Proprietario");
		System.out.println("Nome     : "+ p1.getNome());
		System.out.println("Nacimento: "+ p1.getNacimento());
		System.out.println("CPF      : "+ p1.getCpf());
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("Imovel");
		System.out.println("Id                     : "+ i1.getId());
		System.out.println("Preco                  : "+ i1.getPreco());
		System.out.println("Endereço               : "+ i1.getEndereco());
		System.out.println("Proprietario Nome      : "+ i1.getProprietario().getNome());
		System.out.println("Proprietario Nacimento : "+ i1.getProprietario().getNacimento());
		System.out.println("Proprietario Cpf       : "+ i1.getProprietario().getCpf());		
		System.out.println("-----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
