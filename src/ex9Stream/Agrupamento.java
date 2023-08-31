package ex9Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Agrupamento {

	public static void main(String[] args) {

		List<Person> p1 = Person.personList2();

		List<String> listaP1 = p1.stream().filter(x -> x.getGenetos() == Genetos.MASCULINO).map(Person::getName)
				.collect(Collectors.toList());

		System.out.println(listaP1);
	}

}
