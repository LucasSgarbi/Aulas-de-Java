public class Principal {
	Produto p1, p2;
	
	public void entraDados() {
		p1 = new Produto();
		p1.setId(1234);
		p1.setNome("Coca Cola lata 350 ML");
		p1.setPreco(4.80);
		p1.setEstoque(100);
		
		p2 = new Produto();
		p2.setId(2345);
		p2.setNome("Pepsi lata 350 ML");
		p2.setPreco(4.50);
		p2.setEstoque(120);
		
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("ID      : "+ p1.getId());
		System.out.println("Nome    : "+ p1.getNome());
		System.out.println("Preco   : "+ p1.getPreco());
		System.out.println("Estoque : "+ p1.getEstoque());
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println("ID      : "+ p2.getId());
		System.out.println("Nome    : "+ p2.getNome());
		System.out.println("Preco   : "+ p2.getPreco());
		System.out.println("Estoque : "+ p2.getEstoque());
		System.out.println("-----------------------------------");
		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
