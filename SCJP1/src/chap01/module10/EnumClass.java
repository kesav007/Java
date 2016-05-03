package chap01.module10;

/**
 * ENUM Rules
 * 
 * 1. If enums are outside of class then they should be eighter public or default
 * 2. If declared inside the class then it can be public, private, protected or default
 * 3. enums cannot be inside methods
 * 4. semicolons are optional
 */

enum CoffeeSize {
	BIG, HUGE, OVERWHELMING
}

public class EnumClass {
	
	private enum CoffeeBrand {BRU, NESCAFE}

	private CoffeeSize coffee;
	
	private CoffeeBrand coffeeBrand;

	public CoffeeBrand getCoffeeBrand() {
		return coffeeBrand;
	}

	public void setCoffeeBrand(CoffeeBrand coffeeBrand) {
		this.coffeeBrand = coffeeBrand;
	}

	public CoffeeSize getCoffee() {
		return coffee;
	}

	public void setCoffee(CoffeeSize coffee) {
		this.coffee = coffee;
	}

}
