package estruturaRepetitiva;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		/*
		 * fazer um programa para ler uma temperatura em celsius e mostrar o equvalente
		 * em fahrenheit. perguntar se o usuário deseja repetir (s/n). caso o usuário
		 * digie "s", repetir o programa.
		 */

		Scanner sc = new Scanner(System.in);

		char n;

		do {
			System.out.println("Digite a temperatura em celsius ");
			double c = sc.nextDouble();

			double f = 9.0 * c / 5.0 + 32.0;

			System.out.printf(" Equivalente em fahrenheit : %.1f%n", f);

			System.out.println("deseja repetir (sim /não ) ?");
			n = sc.next().charAt(0);

		} while (n != 's');

		sc.close();
	}

}
