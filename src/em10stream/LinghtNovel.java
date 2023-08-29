package em10stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinghtNovel {

	private String title;
	private Double price;
	
	public LinghtNovel() {
	}
	
	public LinghtNovel(String title, Double price) {
		this.title = title;
		this.price = price;
	}
	
	public static List<LinghtNovel> ListLinghtNovel(){
		return  Arrays.asList(
				new LinghtNovel("tensei", 8.99),
				new LinghtNovel("overLond", 3.99),
				new LinghtNovel("violet" , 5.99),
				new LinghtNovel("no gane", 2.99),
				new LinghtNovel("fullmental" , 5.99),
				new LinghtNovel("kuno", 1.99),
				new LinghtNovel("monogatari" ,4.00)
				); 
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LinghtNovel [title=" + title + ", price=" + price + "]";
	}
	
	
}
