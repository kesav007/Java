package chap01.module10;

public enum CoffeeSizeWithArgs {

	BIG(8, "50 cents"), HUGE(10, "$1"), OVERWHELMING(16, "$1.25");

	private int ounces;
	
	private String price;

	private CoffeeSizeWithArgs(int ounces, String price) {
		this.ounces = ounces;
		this.price = price;
	}

	public int getOunces() {
		return ounces;
	}

	public String getPrice() {
		return price;
	}
}