package exVaiNaweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MegaSenaEmJava {

	public static void main(String[] args) {
		/*
		 * 1 - MEGA-SENA EM JAVA
		 * 
		 * → O usuário precisa escolher 7 números de 0 a 100.
		 * 
		 * → Precisa ser obrigatoriamente um numero inteiro. Caso o usuário digite outro
		 * tipo de dado, o programa não pode parar
		 * 
		 * → Os números escolhidos terão de ser guardados em um vetor
		 * 
		 * → Os 7 números vencedores terão de ser sorteado pela classe Random do java.
		 * 
		 * → Após o final, percorrer o vetor com as respostas e comparar com os 7
		 * números sorteados
		 * 
		 * → Se o usuário acertar 5 números → Premio de 10 mil reais
		 * 
		 * → Se o usuário acertar 6 números → Premio de 50 mil reais
		 * 
		 * → Se o usuário acertar 7 números → Premio de 200 mil reais
		 */

		List<Integer> numeroEscolhido = new ArrayList<>(); // armazena os dados em um array do tipo integer 
		List<Integer> numeroSorteado = new ArrayList<>();
		Boolean test = false;
		geradorDeNumeros(numeroSorteado);
		
		// enquanto o usuário não escolher 6 números coretos ele vai ficar no lup 
		do {
			test = false;
			try {
				cadastraNumero(numeroEscolhido);
			} catch (Exception e) {
				System.out.println("vc digitou algo errado tente de novo");
				test = true;
			}
		} while (test);

		// stream , percorre o array e pega apenas os números que o usuário acertou 
		List<Integer> numerosFiltrados = numeroEscolhido.stream().filter(x -> numeroSorteado.contains(x))
				.collect(Collectors.toList());

		System.out.println("Você acertou " + numerosFiltrados);

	}

	// método pra gerar os números de sorteio 
	public static List<Integer> geradorDeNumeros(List<Integer> list) {

		Random random = new Random();

		while (list.size() < 6) {
			int numAleatorio = random.nextInt(10) + 1; 

			// Verifica se o número já foi sorteado
			if (!list.contains(numAleatorio)) {
				System.out.println(numAleatorio);
				list.add(numAleatorio);
			}
		}
		return list;
	}

	// método pra salvar os numeros escolhidos pelo usúario e testar são validos 
	public static List<Integer> cadastraNumero(List<Integer> list) throws Exception { // qual quer exception gerada no método e tratada por quem chama ela 

		Scanner sc = new Scanner(System.in);
		Boolean correto;

		for (int x = 0; x <= 6; x++) {

			do {
				correto = false;
				System.out.println("escolha um número de 0 a 100");
				int escolha = sc.nextInt();
				
				//não permite que o numero seja maio que 100 e nem menor que 0 
				if (escolha >= 0 && escolha <= 100) {
					
				  // não permite numeros duplicados 
					if (!list.contains(escolha)) {
						list.add(escolha);
					} else {
						correto = true;
						System.out.println("Você digitou duas dezes o mesmo número , tente novamente");
					}
				} else {
					correto = true;
					System.out.println("Você digitou um número maior ou menor do que o esperado , tente novamente");
				}
			} while (correto);
		}

		sc.close();

		return list;
	}
}
