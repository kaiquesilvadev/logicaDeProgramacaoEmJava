package parametrizacaoComportamento;

public class Car {

	private String name = "polo";
	private Integer year;
	private String color;

	public Car() {
	}

	public Car(Integer year, String color) {
		this.year = year;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", color=" + color + "]";
	}

}
