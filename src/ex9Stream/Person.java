package ex9Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {
	
	private String name;

	private Integer ige;
	
	private Double salary;
	
	private Genetos genetos;

	public Person() {}

	public Person(String name, Integer ige, Double salary) {
		this.name = name;
		this.ige = ige;
		this.salary = salary;
	}
	
	public Person(String name, Integer ige, Double salary, Genetos genetos) {
		super();
		this.name = name;
		this.ige = ige;
		this.salary = salary;
		this.genetos = genetos;
	}

	public static List<Person> personList(){
		return	Arrays.asList(
				new Person("kaique", 30 , 1500.00),
				new Person("paulo", 15 , 1670.00),
				new Person("lucas", 18 , 1500.00),
				new Person("pedro", 50 , 1600.00),
				new Person("maria", 20 , 2500.00),
				new Person("betania", 35 , 2234.00),
				new Person("carlos", 12 , 1507.00),
				new Person("larissa", 25 , 1800.00),
				new Person("talita", 15 , 1900.00),
				new Person("maicon", 17 , 3500.00)
				);
	}


	public static List<Person> personList2(){
		return	Arrays.asList(
				new Person("kaique", 30 , 1500.00 , Genetos.MASCULINO),
				new Person("paulo", 15 , 1670.00, Genetos.MASCULINO),
				new Person("lucas", 18 , 1500.00, Genetos.MASCULINO),
				new Person("pedro", 50 , 1600.00, Genetos.MASCULINO),
				new Person("maria", 20 , 2500.00, Genetos.FEMININO),
				new Person("betania", 35 , 2234.00, Genetos.FEMININO),
				new Person("carlos", 12 , 1507.00, Genetos.MASCULINO),
				new Person("larissa", 25 , 1800.00, Genetos.FEMININO),
				new Person("talita", 15 , 1900.00, Genetos.FEMININO),
				new Person("maicon", 17 , 3500.00, Genetos.MASCULINO)
				);
	}
	
	public Integer getIge() {
		return ige;
	}

	public void setIge(Integer ige) {
		this.ige = ige;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Genetos getGenetos() {
		return genetos;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ige=" + ige + ", salary=" + salary + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(ige, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ige, other.ige) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
}
