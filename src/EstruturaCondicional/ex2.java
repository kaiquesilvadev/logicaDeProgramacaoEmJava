package EstruturaCondicional;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número");
		int n =sc.nextInt();
		
		if(n == 0) {
			System.out.println("zero é neutro");
	    }else if(n % 2 == 0) {
			System.out.println("número é par");
		}else {
			System.out.println("número é impar");
		}
		
		
		sc.close();

	}

}
