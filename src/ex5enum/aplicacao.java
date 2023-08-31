package ex5enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) throws ParseException {

		/*
		 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário).
		 * Depois, solicitar do usuário um mês e mostrar qual foi o salário do
		 * funcionário nesse mês, conforme exemplo (próxima página).
		 */

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat stc = new SimpleDateFormat("dd/MM/yyyyy");

		System.out.println("entre com o nome do departamento");
		String departamento = sc.nextLine();

		System.out.println("dados do trabalhador");
		System.out.println("nome");
		String nome = sc.nextLine();

		System.out.println("nivel");
		String nivel = sc.nextLine();

		System.out.println("base do salario");
		Double salario = sc.nextDouble();

		Worker worker = new Worker(nome, salario, WorKerLevel.valueOf(nivel), new Department(departamento));
		sc.close();

		System.out.println("quantos contratos?");
		int contratos = sc.nextInt();

		for (int i = 0; i < contratos; i++) {
			System.out.println("data do contrato " + i);
			Date data = stc.parse(sc.next());

			System.out.println("valor por horas do contrato " + 1);
			double valor = sc.nextDouble();

			System.out.println("vquantas horas contrato " + 1);
			int horas = sc.nextInt();

			HourContract contract = new HourContract(data, valor, horas);
			worker.addContract(contract);
		}
	}

}
