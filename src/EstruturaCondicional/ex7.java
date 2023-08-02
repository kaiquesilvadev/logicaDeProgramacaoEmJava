package EstruturaCondicional;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		/* fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana 
		 * (sendo 1 = domingo, 2 = segunda, e assim por diante).escrever na tela o dia da semana correspondente.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero de 1 a 7");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1 -> System.out.println("domingo");	
		case 2 -> System.out.println("segunda");
		case 3 -> System.out.println("terça");
		case 4 -> System.out.println("quarta");
		case 5 -> System.out.println("quinta");
		case 6 -> System.out.println("sexta");	
		case 7 -> System.out.println("sábado");
		default ->System.out.println("número invalido");
		}
		
		
		sc.close();

	}

}
