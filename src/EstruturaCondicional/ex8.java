package EstruturaCondicional;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um intervalo de números");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		
		sc.close();
	}

}