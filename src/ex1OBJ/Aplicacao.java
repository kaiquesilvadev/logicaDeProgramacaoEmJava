package ex1OBJ;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		/*
		 * fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque) em seguida:
		 */

		// * mostrar os dados do produto (nome, preço e quantidade no estoque , valor
		// todal no estoque )

		// * realizar uma esntrada no estoque e mostrar novamente os dados do produto

		// * realizar uma saída no estoque e mostrar novamente os dados do produto

		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("enter product data");
		System.out.println("nome");
		product.name = sc.nextLine();

		System.out.println("preço");
		product.Price = sc.nextDouble();

		System.out.println("quantidade");
		product.quantity = sc.nextInt();

		// * mostrar os dados do produto (nome, preço e quantidade no estoque , valor
		// todal no estoque )
		System.out.println(product);

		// * realizar uma esntrada no estoque e mostrar novamente os dados do produto
		System.out.println();
		System.out.println("realizar uma esntrada no estoque");
		int i = sc.nextInt();
		product.addProducts(i);
		;

		System.out.println(product);

		// * realizar uma saída no estoque e mostrar novamente os dados do produto
		System.out.println();
		System.out.println("realizar uma saida no estoque");
		int x = sc.nextInt();
		product.removerProducts(x);

		System.out.println(product);

		sc.close();
	}

}
