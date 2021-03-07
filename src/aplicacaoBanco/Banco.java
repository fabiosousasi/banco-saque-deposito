package aplicacaoBanco;

import java.util.Scanner;
import entidadeBanco.Conta;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("ENTRE COM OS DADOS...");
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe seu cpf: ");
		String cpf = sc.nextLine();
		// CONDIÇÃO PARA O CPF
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
			|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
			|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
			|| cpf.equals("99999999999") || cpf.length() != 11) {

			System.out.println("ERRO!");
			System.out.print("Tente novamente: ");
			cpf = sc.nextLine();

			while (cpf.length() != 11) {
				System.out.println("ERRO!");
				System.out.print("Tente novamente: ");
				cpf = sc.nextLine();
			}
		} //FIM IF
		
		System.out.print("Informe a agência: ");
		String agencia = sc.nextLine();
		while(agencia.length() != 4) {
			System.out.println("\nERRO!");
			System.out.print("São 4 dígitos. Tente novamente:");
			agencia = sc.nextLine();
		}
		
		Conta conta = new Conta(nome, cpf, agencia, 2000.00);

		System.out.println("*****************************************************************************************");

		// INFORMAÇÃO SOBRE OS DADOS
		System.out.println("\nSEUS DADOS ATUAIS...");
		
		System.out.println(conta);

		System.out.println("*****************************************************************************************");

		// OPERAÇÃO A SER EFETUADA
		System.out.println("Escolha a operação que deseja fazer...");
		System.out.println("\n1 - Sacar \n2 - Depositar");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1: // SACAR
			System.out.println("---------------------------------------------------------");
			System.out.println("Digite quanto deseja sacar? ");
			double montante = sc.nextDouble();

			conta.sacar(montante);
			break;

		case 2: // DEPOSITAR
			System.out.println("---------------------------------------------------------");
			System.out.println("Digite quanto deseja depositar? ");
			montante = sc.nextDouble();

			conta.depositar(montante);
			break;

		default:
			System.out.println("A opção escolhida não existe. Operação cancelado.");
		}

		// DADOS ATUALIZADOS (RESULTADO)
		System.out.println("********************************************************************");
		System.out.println("\nSEU SALDO DEPOIS DA OPERAÇÃO EFETUADA...");
		
		System.out.println(conta);
	}

}
