package ex6HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Uma empresa possui funcionários próprios e terceirizados.
		Para cada funcionário, deseja-se registrar nome, horas
		trabalhadas e valor por hora. Funcionários terceirizado
		possuem ainda uma despesa adicional.
		
		O pagamento dos funcionários corresponde ao valor da hora
		multiplicado pelas horas trabalhadas, sendo que os
		funcionários terceirizados ainda recebem um bônus
		correspondente a 110% de sua despesa adicional.
		
		Fazer um programa para ler os dados de N funcionários (N
		fornecido pelo usuário) e armazená-los em uma lista. Depois
		de ler todos os dados, mostrar nome e pagamento de cada
		funcionário na mesma ordem em que foram digitados.
		Construa o programa conforme projeto ao lado. Veja
		exemplo na próxima página.*/
		
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();
		System.out.println("entre com o número de funcionários");
		int funcionario = sc.nextInt();
		
		for(int x = 0 ; x < funcionario ; x++) {
			sc.nextLine();
			System.out.println("nome");
			String nome = sc.nextLine();
			
			System.out.println("horas trabalhada ");
			int horas = sc.nextInt();
			
			System.out.println("valor por horas");
			double valorHoras = sc.nextDouble();
			
			System.out.println("ele é terceirizados ? (N/S) ");
			char terceirizados = sc.next().charAt(0);
			
			if(terceirizados == 's') {
				System.out.println("valor das dispesas");
				double dispesas = sc.nextDouble();
				employee.add( new OutsourcedEmployee(nome, horas, valorHoras, dispesas));
			}else {
				employee.add( new Employee(nome, horas, valorHoras));
			}	
		}
		
		
		sc.close();
	}

}
