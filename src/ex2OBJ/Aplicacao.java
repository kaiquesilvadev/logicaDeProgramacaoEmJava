package ex2OBJ;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
		titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
		inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
		conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
		
		
		Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
		o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
		exemplo).
		
		 
		Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
		isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
		realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
		suficiente para realizar o saque e/ou pagar a taxa.
		Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
		informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
		mostrando os dados da conta após cada operação. */
		
		Scanner sc = new Scanner(System.in);
		Account p1;
		
		
		System.out.println("número da conta");
		int numeroDaConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("número da conta");
		String nome = sc.nextLine();
		
		System.out.println("tem depósito inicial sim ou não ");
		char pergunta = sc.next().charAt(0);
		
		if(pergunta == 's') {
			System.out.println("qual o valor ?");
			double valor = sc.nextDouble();
			 p1 = new Account(numeroDaConta ,nome , valor);
		}else {
			 p1 = new Account(numeroDaConta ,nome);
		}
		
		System.out.println(p1);
		
		//realizar um depósito
		System.out.println("novo depósito");
		double novoDeposito = sc.nextDouble();
		p1.deposito(novoDeposito);
		
		System.out.println(p1);
		
		//realizar um saque
		System.out.println("novo depósito");
		double saque = sc.nextDouble();
		p1.saque(saque);
		
		System.out.println(p1);
		
		
		
		sc.close();
	}

}
