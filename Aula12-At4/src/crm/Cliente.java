package crm;

import cadastro.Pessoa;

public class Cliente extends Pessoa{
	private String email;
	private String saldo;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	public String getEmail() {
		return email;
	}
	public String getSaldo() {
		return saldo;
	}
	
	
}
