package exercicio.excecao.contas;

import java.util.Scanner;
public class TestaConta {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	ContaBancaria conta = new ContaBancaria(300,200);
	
	int op;
	do {
		System.out.println("Saldo disponível R$" + conta.getSaldo());
		System.out.println("Limite R$" + conta.getLimite());
		System.out.println("1- Sacar");
		System.out.println("2- Depositar");
		System.out.println("3- Ver saldo com limite");
		System.out.println("0- Sair");
		System.out.println("Escolha uma opção: ");
		op = sc.nextInt();
	

	try {
		if(op == 1) {
			System.out.println("Valor do saque: ");
			double valor = sc.nextDouble();
			conta.sacar(valor);
			
		} else if (op == 2) {
			System.out.println("Valor do depósito: ");
			double valor = sc.nextDouble();
			conta.depositar(valor);
		} else if (op == 3) {
			System.out.println("Saldo + Limite R$: " + conta.getSaldoComLimite());
		} else if (op == 0) {
			System.out.println("Programa encerrado");
		} else {
			System.out.println("Opção inválida digite somente: 1,2,3 ou 0");
		}
	} catch(ContaException e) {
		System.out.println("Erro: " + e.getMessage());
	}
	} while(op!=0);
	
	sc.close();
			
		
	}
}

	
	
	
	
