package ex3vect;

import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {

		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos números 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
		 * uma quantidade N representando o número de estudantes que vão alugar quartos
		 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
		 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
		 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
		 * vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
		 * pensionato, por ordem de quarto, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		char x;
		do {

			System.out.println("qual seu nome ?");
			String nome = sc.nextLine();
			sc.nextLine();

			System.out.println("qual seu Gmail ?");
			String email = sc.nextLine();

			System.out.println("qual o número do quarto escolhido ?");
			int quarto = sc.nextInt();

			if (vect[quarto] == null) {

				vect[quarto] = new Rent(nome, email);

			} else {
				System.out.println("quarto ocupado");
			}

			System.out.println("gostaria de tentar de novo ? sim ou não ");
			x = sc.next().charAt(0);
		} while (x != 'n');

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println("quarto " + i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}