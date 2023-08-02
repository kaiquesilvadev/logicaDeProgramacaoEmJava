package EstruturaCondicional;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		/*uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minitos de telefone.
		 * cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. fazer um programa para ler a quantidade de minutos que 
		 * uma pessoa consumiu, daí mostrar o valor a ser pago */
		Scanner sc = new Scanner(System.in);
		
		double valor ;
		int	franquiaExcedida;
		
		System.out.println("digite quantos minutos foram usados");
		int minutos = sc.nextInt();
		
		if(minutos <= 100 ){
			valor = 50.00;
		}else {
			franquiaExcedida = minutos - 100 ;
			valor = 50.00 + (franquiaExcedida* 2.00);
		}
		
		System.out.println("valor a ser pago R$"+valor);
		
		
		sc.close();
	}

}
