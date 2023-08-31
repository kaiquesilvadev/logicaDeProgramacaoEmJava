package ParallelTest;

import java.util.ArrayList;
import java.util.List;

public class ParallelTest {

	public static void main(String[] args) {
		/*
		 * O método parallel() é um recurso do Java Stream que permite que as operações
		 * subsequentes sejam executadas em paralelo, aproveitando múltiplos núcleos de
		 * CPU para aumentar a eficiência do processamento. Em outras palavras, ele
		 * habilita o processamento paralelo de elementos em um stream, tornando
		 * possível executar operações de maneira simultânea em várias threads.
		 * 
		 */

		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		double average = numbers.stream().parallel() // Habilita o processamento paralelo
				.mapToDouble(Integer::doubleValue).average().orElse(0.0);

		System.out.println("Average: " + average);
	}
}
