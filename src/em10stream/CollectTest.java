package em10stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectTest {

	private static List<LinghtNovel> linghtNovels = new ArrayList<>(
			List.of(new LinghtNovel("tensei", 8.99, Promotion.NORMAL_PRICE),
					new LinghtNovel("overLond", 3.99, Promotion.UNDER_PROMOTION),
					new LinghtNovel("violet", 5.99, Promotion.NORMAL_PRICE),
					new LinghtNovel("no gane", 2.99, Promotion.UNDER_PROMOTION),
					new LinghtNovel("fullmental", 5.99, Promotion.NORMAL_PRICE),
					new LinghtNovel("kuno", 1.99, Promotion.UNDER_PROMOTION),
					new LinghtNovel("monogatari", 4.00, Promotion.NORMAL_PRICE)));

	public static void main(String[] args) {

	 Map<Promotion , List<LinghtNovel>> test = linghtNovels.stream().collect(Collectors.groupingBy(x -> x .getPrice() < 5 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
	
	System.out.println(test);
	}

}
