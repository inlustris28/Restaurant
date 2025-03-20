package people;

public class Visitor {
	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public void showTotalPrice() {
		System.out.println(name + " total Price: " + totalPrice);
	}
	
	public void addTotalPrice(int price) {
		totalPrice += price;
	}
	
	
}
