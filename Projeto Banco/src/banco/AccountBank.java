package banco;
import java.util.Scanner;


public class AccountBank {
	
	private int AccountNumberBank;
	private double Saldo;
	private String NomeTitular;
		
	public AccountBank(int numeroConta) {
		this.AccountNumberBank = numeroConta;
	}
	
	public int GetAccountNumber() {		
		return this.AccountNumberBank;
	}
	
	public String GetNomeTitular() {		
		return this.NomeTitular;
	}
	
	public double GetSaldo() {		
		return this.Saldo;
	}
	
	public void depositar(double valor) {
		Saldo += valor;
	}
	
}
	
