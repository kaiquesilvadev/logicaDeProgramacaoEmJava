package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEstudos {
	public static void main(String[] args) {

		// Métodos Intermediários

		/*
		 * étodos Intermediários ou Operações Intermediarias são Métodos que retornam um
		 * novo Stream, para que novas operações intermediárias sejam executadas. Vamos
		 * conhecer os Métodos Intermediários mais utilizados da API Stream:
		 */

		// Collection numeros
		List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Gerar a Stream a partir da Collection
		Stream<Integer> numerosStream = n.stream();

		// Gerar a Stream a partir de uma lista de numeros
		Stream<Integer> novoNumerosStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosDesordenados = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		System.out.println("\nExemplo - Método Map");

		/* O método map() é usado para executar uma operação na lista de coleções. */

		numeros.stream().map(x -> x * x * x).forEach(x -> System.out.println(x));
		;

		/*
		 * O método filter é utilizado para filtrar os resultados de acordo com as
		 * condições pré definidas.
		 */

		System.out.println("\nExemplo - Método Filter");

		numeros.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		/* O método **Sorted é utilizado para classificar a Collection fornecida. */

		System.out.println("\nExemplo - Método Sorted");

		numerosDesordenados.stream().sorted().forEach(System.out::println);// ordena os números

		numerosDesordenados.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);// ordena de modo
																									// reverso

		/*
		 * Se a Collection fornecida possuir itens duplicados, podemos usar o método
		 * distinct() para remover todos os itens duplicados e obter uma Collection
		 * filtrada.
		 */

		System.out.println("\nExemplo - Método Distinct");

		estados.stream().distinct().forEach(System.out::println);

		/*
		 * permite executar uma ação em cada elemento da stream enquanto mantém a
		 * estrutura da stream intacta. Ele é útil quando você deseja realizar uma
		 * operação em cada elemento, mas não quer que a stream seja modificada.
		 */
		System.out.println("\nExemplo - Método pkke");

		Stream<Integer> numerosStream2 = Stream.of(1, 2, 3, 4, 5);

		numerosStream2.peek(num -> System.out.println("Antes: " + num)) // Operação de efeito colateral
				.map(num -> num * 2) // Transformação
				.peek(num -> System.out.println("Depois: " + num)) // Outra operação de efeito colateral
				.forEach(System.out::println);

		/*
		 * skip permite pular um determinado número de elementos no início de uma
		 * stream. Ele retorna uma nova stream que contém os elementos restantes após o
		 * número especificado de elementos ter sido pulado.
		 */

		System.out.println("\nExemplo - Método skip");
		Stream<Integer> numerosStream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numerosStream.skip(5).forEach(System.out::println); // Pular os primeiros 5 elementos

		/*
		 * Java que permite limitar o número de elementos em uma stream. Ele retorna uma
		 * nova stream que contém, no máximo, o número especificado de elementos.
		 */

		System.out.println("\nExemplo - Método limit");

		Stream<Integer> numerosStream4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numerosStream4.limit(5).forEach(System.out::println); // Limitar a 5 elementos

	}
}
