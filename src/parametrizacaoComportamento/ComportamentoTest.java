package parametrizacaoComportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoTest {

	private static List<Car> cars = List.of(new Car(2011, "green"), new Car(2018, "bleck"));

	public static void main(String[] args) {

		List<Car> colorCar = filter(cars, x -> x.getColor().equals("green"));
		System.out.println(colorCar);

	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filterCar = new ArrayList<>();

		for (T e : list) {
			if (predicate.test(e)) {
				filterCar.add(e);
			}
		}

		return filterCar;
	}
}
