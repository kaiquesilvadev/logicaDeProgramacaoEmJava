package parametrizacaoComportamento;

import java.util.List;
import java.util.function.Consumer;

public class ConsumeTest {

	public static void main(String[] args) {
		List<String> list = List.of("kaique", "bruno", "joão");

		forEach(list, System.out::println);
	}

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T e : list) {
			consumer.accept(e);
		}
	}
}
