package Optional;

import java.util.List;
import java.util.Optional;

public class ex1 {

	public static void main(String[] args) {
		/*Dado um array de strings, crie um método que retorne um Optional contendo a primeira
		 *string que tenha um tamanho maior que 10 caracteres. Se não houver nenhuma string 
		 *com esse tamanho, retorne um Optional vazio.*/
		
		List<String> p1 =  List.of("mari", "paulo" , "kaique");
		
		Optional<String> result = tamanhoDoNome(p1, 4);
		
		result.ifPresentOrElse(x -> System.out.println(x),() -> System.out.println("não a nenhum nome assima do valor que vcs passou"));
		
	}
	
	public static Optional<String> tamanhoDoNome(List<String> list , int tamanho){
		return list.stream().filter(x -> x.length() > tamanho).findFirst();
		
	}

}
