public class Boletim {
	private String disciplina; 
	private double notaProva; 
	private double notaTrabalho; 
		
	public void setDisciplina(String disciplina) { 
		this.disciplina = disciplina; 
		} 
	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva; 
		}
	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho; 
		}
	
	public String getDisciplina() {
		return disciplina; 
		} 
	public double getNotaProva() {
		return notaProva; 
		}
	public double getNotaTrabalho() {
		return notaTrabalho; 
		}
		public double Media() {
			return (0.7*notaProva) + (0.3*notaTrabalho); 
		} 
		
	}