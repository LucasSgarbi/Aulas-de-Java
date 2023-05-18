public class Principal {
	Sistema s1,s2;
	public void entraDados() {
	s1 = new Sistema();
	s1.setComando("Select");
	s1.setConexao("root");
	s1.setHost("localhost");
	s1.setId("1");
	s1.setIp("192.168.0.24");
	s1.setSenha("123456789");
	s1.setUsuario("Joker");
	
	s2 = new Sistema();
	s2.setComando("Insert");
	s2.setConexao("Lucas");
	s2.setHost("hostinger");
	s2.setId("2");
	s2.setIp("192.168.4.24");
	s2.setSenha("senha");
	s2.setUsuario("Lsaravechia");
		
		
	}
	
	public void mostraDados() {
		System.out.println("---------------------------------");
		System.out.println("Sistema 1");
		System.out.println("Comando     : "+ s1.getComando());
		System.out.println("Conexão     : "+ s1.getConexao());
		System.out.println("Host        : "+ s1.getHost());
		System.out.println("ID          : "+ s1.getId());
		System.out.println("IP          : "+ s1.getIp());
		System.out.println("Senha       : "+ s1.getSenha());
		System.out.println("Usuario     : "+ s1.getUsuario());
		System.out.println("Imprime     : "+ s1.Imprime());
		System.out.println("Send        : "+ s1.send());
		System.out.println("Receive     : "+ s1.receive());
		System.out.println("Sniff       : "+ s1.sniff());
		System.out.println("Sniff       : "+ s1.clean());
		System.out.println("Sniff       : "+ s1.status());
		System.out.println("----------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Sistema 2");
		System.out.println("Comando     : "+ s2.getComando());
		System.out.println("Conexão     : "+ s2.getConexao());
		System.out.println("Host        : "+ s2.getHost());
		System.out.println("ID          : "+ s2.getId());
		System.out.println("IP          : "+ s2.getIp());
		System.out.println("Senha       : "+ s2.getSenha());
		System.out.println("Usuario     : "+ s2.getUsuario());
		System.out.println("Imprime     : "+ s2.Imprime());
		System.out.println("Send        : "+ s2.send());
		System.out.println("Receive     : "+ s2.receive());
		System.out.println("Sniff       : "+ s2.sniff());
		System.out.println("Sniff       : "+ s2.clean());
		System.out.println("Sniff       : "+ s2.status());
		System.out.println("----------------------------------");

		
	}
	
	public static void main(String args[]) {
		Principal programa = new Principal();
		programa.entraDados();
		programa.mostraDados();
	}
}
