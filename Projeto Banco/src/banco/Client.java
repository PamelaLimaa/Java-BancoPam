package banco;

import banco.Main;


public class Client {
	
	private String NameClient;
	private int AgeClient;
	
	
	public Client(String NameClient, int AgeClient) {
		this.NameClient = NameClient;
		this.AgeClient = AgeClient;
		
	}
	
	
	public String GetAssociateAccount () {
		return this.NameClient;
	}
	
	public int GetAgeClientAccount () {
		return this.AgeClient;
	}
	
}
