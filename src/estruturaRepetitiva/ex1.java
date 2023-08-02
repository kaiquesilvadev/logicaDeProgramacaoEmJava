package estruturaRepetitiva;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	
		/*fazaer um programa que lê números inteiros até que um zero seja lido . ao final mostra a soma dos números lidos*/
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = sc.nextInt();
		
		
		while(x != 0) {
			soma += x ;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
