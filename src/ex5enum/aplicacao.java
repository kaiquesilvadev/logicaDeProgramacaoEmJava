package ex5enum;

import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
		do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
		(próxima página).*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com o nome do departamento");
		String departamento = sc.nextLine();
		
		System.out.println("dados do trabalhador");
		System.out.println("nome");
		String nome = sc.nextLine();
		
		System.out.println("nivel");
		String nivel = sc.nextLine();
		
		System.out.println("base do salario");
		Double salario = sc.nextDouble();
		
		Worker worker = new  Worker(nome , salario , WorKerLevel.valueOf(nivel) , new Department(departamento));
		sc.close();

	}

}
