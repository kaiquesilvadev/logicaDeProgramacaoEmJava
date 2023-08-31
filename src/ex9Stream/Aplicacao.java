package ex9Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * pegar os nome das pessoas com menos de 25 anos ordenados pelo nome
		 */

		List<Person> person = Person.personList();

		System.out.println(person);

		List<String> pessoas = person.stream().filter(x -> x.getIge() < 25)
				.sorted(Comparator.comparing(Person::getName)).limit(3).map(x -> x.getName())
				.collect(Collectors.toList());

		System.out.println(pessoas);

		/*
		 * Dado um array de números inteiros, crie um novo array contendo o quadrado dos
		 * números pares presentes no array original.
		 */

		System.out.println("ex2");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream().filter(x -> x % 2 == 0).map(x -> x + x).forEach(System.out::println);

		/*
		 * Dado um array de nomes, crie um novo array contendo os nomes em letras
		 * maiúsculas.
		 */

		System.out.println("ex3");

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

		List<String> uppercaseNames = names.stream().map(x -> x.toString().toUpperCase()).collect(Collectors.toList());

		System.out.println(uppercaseNames);

		/*
		 * Dado um array de números inteiros, crie um novo array contendo o quadrado dos
		 * números pares presentes no array original.
		 */

		System.out.println("ex4");

		List<List<Integer>> numberLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5),
				Arrays.asList(5, 6, 7));

		List<Integer> uniqueNumbers = numberLists.stream().flatMap(List::stream).distinct()
				.collect(Collectors.toList());

		System.out.println(uniqueNumbers);
	}

}
