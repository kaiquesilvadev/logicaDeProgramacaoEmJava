package ex9Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AulaCollectors {

	public static void main(String[] args) {
		/*reducão e sumarização de stream em u valor unico*/
		
		List<Person> person = Person.personList();
		
		System.out.println(person.stream().count());// conta o núero de pessoas com stream
		System.out.println(person.stream().collect(Collectors.counting())); // conta o núero de pessoas com stream com collectors
		
		
		System.out.println(person.stream().max((o1, o2) -> o1.getSalary().compareTo(o2.getSalary())));//pega o maior salario com stream
		Optional<Person> person2 = person.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getSalary)));//pega o maior salario com collectiors
		
		System.out.println(person2.get().getSalary());
	}
}
