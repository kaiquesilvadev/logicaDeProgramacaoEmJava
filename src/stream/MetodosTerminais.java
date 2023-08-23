package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetodosTerminais {
	public static void main(String[] args) {

		/*
		 * Métodos Terminais ou Operações Terminais são Métodos que unem os resultados
		 * de um Stream Fe retornam um valor ou um objeto. Depois de chamar uma operação
		 * terminal, o mesmo Stream não poderá ser alterado por outras operações
		 * intermediárias ou executar novas operações terminais.
		 */

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		/*
		 * A operação collect() cria uma Collection com o resultado final das operações
		 * realizadas na Stream.
		 */

		List<String> estadosR = estados.stream().filter(x -> x.toString().startsWith("R")).sorted()
				.collect(Collectors.toList());

		System.out.println("\nEstados cujo nome começam com a letra R: " + estadosR);

		/*
		 * A operação terminal count() exibe o numero de itens encontrados no resultado
		 * final das operações realizadas na Stream.
		 */

		System.out.println("\nExemplo - Método Count");

		long numeroEstadosTerminaComO = estados.stream().filter(x -> x.toString().endsWith("o")).count();

		System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);

		/*
		 * A operação allMatch() nos ajuda a obter a resposta: todos os elementos da
		 * Stream correspondem à uma determinada condição?
		 */

		System.out.println("\nExemplo - Método AllMatch");

		boolean todosEstadosContemRio = estados.stream().allMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nTodos os Estados contém a palavra Rio? " + todosEstadosContemRio);

		/*
		 * Em comparação com a operação allMatch(), a operação anyMatch() ajuda a
		 * verificar se pelo menos um dos elementos da Stream correspondem à uma
		 * determinada condição.
		 */

		System.out.println("\nExemplo - Método AnyMatch");

		boolean algumEstadoContemRio = estados.stream().anyMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nPelo menos um Estado contém a palavra Rio? " + algumEstadoContemRio);

		/*
		 * O método forEach() é usado para iterar sobre a Collection resultante, igual
		 * ao laço de repetição for tradicional.
		 */

		System.out.println("\nExemplo - Método ForEach");

		System.out.println("\nEstados cujo nome iniciam com a letra S:");

		estados.stream().filter(x -> x.toString().startsWith("S")).forEach(System.out::println);

		/*
		 * é usada para encontrar o elemento mínimo (o menor valor) em uma stream de
		 * elementos comparáveis. O resultado é encapsulado em um Optional, já que a
		 * stream pode estar vazia.
		 */

		System.out.println("\nExemplo - Método min");

		List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);

		Optional<Integer> menorNumero = numeros.stream().min(Integer::compareTo);

		menorNumero.ifPresent(min -> System.out.println("Menor número: " + min));

		/*
		 * é usada para encontrar o elemento máximo (o maior valor) em uma stream de
		 * elementos comparáveis. O resultado é encapsulado em um Optional, já que a
		 * stream pode estar vazia.
		 */

		Optional<Integer> maiorNumero = numeros.stream().max(Integer::compareTo);

		maiorNumero.ifPresent(max -> System.out.println("Maior número: " + max));

		/*
		 * é usada para reduzir os elementos de uma stream a um único valor, aplicando
		 * uma operação associativa cumulativa. Isso é útil quando você deseja combinar
		 * os elementos da stream de alguma forma.
		 */

		Stream<Integer> numerosStream = Stream.of(1, 2, 3, 4, 5);

		Optional<Integer> soma = numerosStream.reduce((a, b) -> a + b);

		soma.ifPresent(resultado -> System.out.println("Soma: " + resultado));

		/*
		 * verifica se nenhum elemento na stream atende a um determinado critério. Ele
		 * retorna um valor booleano indicando se nenhum elemento corresponde ao
		 * critério especificado.
		 */

		Stream<Integer> numerosStream2 = Stream.of(1, 2, 3, 4, 5);

		boolean todosSaoPares = numerosStream2.noneMatch(num -> num % 2 != 0);

		System.out.println("Todos são pares? " + todosSaoPares);

		/*
		 * retorna o primeiro elemento de uma stream, se a stream não estiver vazia. O
		 * resultado é encapsulado em um Optional, já que a stream pode estar vazia.
		 */

		Stream<Integer> numerosStream3 = Stream.of(5, 2, 8, 1, 3);

		Optional<Integer> primeiroNumero = numerosStream3.findFirst();

		primeiroNumero.ifPresent(primeiro -> System.out.println("Primeiro número: " + primeiro));

	}
}
