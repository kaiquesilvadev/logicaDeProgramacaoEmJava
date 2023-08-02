package EstruturaCondicional;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.*/

		//codogo			especificação		preço
		//1					cachorro quente		r$ 4.00
		//2					x-salada     		r$ 4.50
		//3					x-bacon     		r$ 5.00
		//4					torrada simples		r$ 2.00
		//5					refrigerante		r$ 1.50
		
		Scanner sc = new Scanner(System.in);
		double  totalPedido ;
		
		System.out.println("digite um código");
		int codigo = sc.nextInt();
		
		System.out.println("digite  total");
		int total = sc.nextInt();
		
		switch(codigo){
		case 1 :
			totalPedido = total * 4.00;
			System.out.println("total r$"+ totalPedido);
			break;
		case 2 :
			totalPedido = total * 4.50;
			System.out.println("total r$"+ totalPedido);
			break;
		case 3 :
			totalPedido = total * 5.00;
			System.out.println("total r$"+ totalPedido);
			break;
		case 4 :
			totalPedido = total * 2.00;
			System.out.println("total r$"+ totalPedido);
			break;
		case 5 :
			totalPedido = total * 1.50;
			System.out.println("total r$"+ totalPedido);
			break;
		default:
			System.out.println("código errado");
		}
		sc.close();
	}

}
