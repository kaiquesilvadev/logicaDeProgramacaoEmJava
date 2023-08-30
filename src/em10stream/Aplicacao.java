package em10stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		// aula youTuber , devdojo
		
		List<String> list =LinghtNovel.ListLinghtNovel()
       .stream()
       .sorted(Comparator.comparing(LinghtNovel::getTitle))
       .filter(x -> x.getPrice() < 4.00)
       .map(LinghtNovel::getTitle)
       .limit(2)
       .collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
