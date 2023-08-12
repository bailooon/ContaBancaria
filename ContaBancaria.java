package javaBasicoAlura;
import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome, tipoConta;
		double saldo = 0, valorReceber = 0, valorTransferir = 0;
		int opcao = 0;
		
		
		//CADASTRO DO CLIENTE
		System.out.println("**************************************");
		System.out.println("Dados iniciais do cliente");
		System.out.print("Nome:                ");
		nome = entrada.next();
		System.out.print("Tipo de conta:       ");
		tipoConta = entrada.next();
		System.out.print("Saldo Inicial:       R$ ");
		saldo = entrada.nextDouble();
		System.out.println("**************************************");
		
		
		//LOOP DAS OPERACÕES
		System.out.println("Operações");
		while(opcao != 4) {
			System.out.println("\n1- Consultar saldo");
			System.out.println("2- Receber valor");
			System.out.println("3- Transferir valor");
			System.out.println("4- Sair");
			System.out.print("\nDigite a opção desejada: ");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				System.out.println("\nSeu saldo atual é: R$ " + saldo);
			} else if(opcao == 2) {
				System.out.print("\nInforme o valor a receber: ");
				valorReceber = entrada.nextDouble();
				saldo += valorReceber;
				System.out.println("Saldo atualizado para:  R$ " + saldo);
			} else if(opcao == 3) {
				System.out.print("\nInforme o valor para transferencia: ");
				valorTransferir = entrada.nextDouble();
				if(valorTransferir > saldo) {
					System.out.println("Saldo infuficiente para realizar a transferencia");
				}else {
					saldo -= valorTransferir;
					System.out.println("Saldo atualizado para:  R$ " + saldo);
				}
			}else if(opcao == 4){
				System.out.println("\nOperacão finalizada!");
			}else {
				System.out.println("\nOperacão invalida");
			}
			
		}
	
		
		
		
		
		

	}

}
