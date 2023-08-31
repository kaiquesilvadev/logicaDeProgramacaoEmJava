package estruturaRepetitiva;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		/*
		 * fazer um programa que lê um valor inteiro n e depois n números inteiros. ao
		 * final, mostra a soma dos n números lidos
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			soma += x;
		}
		System.out.println(soma);

		sc.close();

	}

}
