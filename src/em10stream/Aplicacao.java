package em10stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		// aula youTuber , devdojo
		
       LinghtNovel.ListLinghtNovel()
       .stream()
       .sorted(Comparator.comparing(LinghtNovel::getTitle))
       .filter(x -> x.getPrice() < 4.00)
       .map(LinghtNovel::getTitle)
       .limit(2)
       .forEach(System.out::println);
		
	}

}
