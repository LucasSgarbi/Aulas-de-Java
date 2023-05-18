
public class Principal {
Aluno a1, a2;


public void entraDados() {

a1 = new Aluno("Sabrina","123456",20,4);


a2 = new Aluno();
a2.setNome("Lucas");
a2.setRa("123456789");
a2.setIdade(21);
a2.setSemestre(4);

}

public void mostraDados() {
	System.out.println("-------------------------------"); 
	System.out.println("Nome :" + a1.getNome()); 
	System.out.println("RA   :" + a1.getRa()); 
	System.out.println("Idade:" + a1.getIdade()); 
	System.out.println("Curso:" + a1.getSemestre()); 
	System.out.println("-------------------------------");

	System.out.println("-------------------------------"); 
	System.out.println("Nome :" + a2.getNome()); 
	System.out.println("RA   :" + a2.getRa()); 
	System.out.println("Idade:" + a2.getIdade()); 
	System.out.println("Curso:" + a2.getSemestre()); 
	System.out.println("-------------------------------");
}

public static void main (String args []){
Principal programa = new Principal();
programa.entraDados();
programa.mostraDados();
}


}