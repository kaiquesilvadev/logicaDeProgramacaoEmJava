package ex8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex1 {

	public static void main(String[] args) {

		/*
		 * 5 - inicialize um vetor com 10 numeros inteiros → peça para o usuário digitar
		 * um número → Através de uma estrutura condicional, verifique se o numero
		 * digitado pelo usuário existe no vetor →Se existir, imprimir uma mensagem de
		 * parabéns, senão, imprima uma mensagem informando que ele errou
		 */

		Scanner sc = new Scanner(System.in); // valiavel leia
		Integer num = sc.nextInt(); // leia numeros inteiros
		List<Integer> list = Arrays.asList(2, 3, 5, 6, 8);
		System.out.println(list.contains(num)); // verifica e retorna true se estiver presente

		boolean anyMatch = list.stream().anyMatch(x -> x.equals(num)); // ex feito com stream
		System.out.println(anyMatch);

	}
}
