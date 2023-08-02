package EstruturaCondicional;

import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número inteiro ");
		int n = sc.nextInt();
		
		if(n > 0 ) {
			System.out.println("número é positivo");
		}else if(n < 0){
			System.out.println("número é negativo");
		}else {
			System.out.println("número é zero");
		}
		
		sc.close();

	}

}
