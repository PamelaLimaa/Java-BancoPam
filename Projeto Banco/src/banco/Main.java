package banco;

import java.util.Scanner;

import banco.AccountBank;

import banco.Client;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual é o seu nome?");
		var nameClient = scanner.nextLine();

		System.out.print("Qual é a sua conta bancaria?");
		var accountNumber = scanner.nextInt();

		var account = new AccountBank(accountNumber);

		int responseClientConsole = 1;

		while (responseClientConsole != 0) {
			System.out.printf(
					"\nBem-Vindo ao Banco!\nConta: %s - Conta Bancaria %d\nDigite o que precisa realizar: \n1 - Depositar\n2- Saque\n0-Sair",
					nameClient, accountNumber);
			responseClientConsole = scanner.nextInt();

			switch (responseClientConsole) {

			case 1:

				System.out.printf("%s - %d \nQual é o valor do deposito?", nameClient, accountNumber);
				var valorDeposito = scanner.nextDouble();

				account.depositar(valorDeposito);

				System.out.print(
						"Deposito com sucesso no valor de:" + valorDeposito + "Saldo atual:" + account.GetSaldo());

				continue;

			case 2:

				System.out.print("Qual é o valor para o saque?");
				double valorSaque = scanner.nextDouble();
				double saldoAtual = account.GetSaldo();
				

				if (saldoAtual>= valorSaque) {
					saldoAtual-= valorSaque;

					System.out.println("Saque realizado com sucesso");			
				}

				else {

					System.out.println("Saldo insuficiente");
				}
				break;

			default:
				System.out.print("Até a proxima!");
			}
		}
	}
}