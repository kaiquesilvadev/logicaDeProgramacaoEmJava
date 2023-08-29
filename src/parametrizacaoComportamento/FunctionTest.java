package parametrizacaoComportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
    List<String> list	= List.of("natsu", "allucard");
    List<Integer> integers = map(list,String::length);
    System.out.println(integers);
	}
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for (T e : list) {
			R r = function.apply(e);
			result.add(r);
		}
		return result ;
	}
}
