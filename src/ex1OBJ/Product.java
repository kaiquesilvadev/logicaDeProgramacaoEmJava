package ex1OBJ;

public class Product {

	public String name;

	public double Price;

	public int quantity;

	public double totalValueInStock() {
		return Price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removerProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product name : " + name + ", Price R$: " + Price + ", quantity :" + quantity + " total R$ : "
				+ totalValueInStock();
	}

}
