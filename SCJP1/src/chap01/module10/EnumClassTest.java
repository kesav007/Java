package chap01.module10;

public class EnumClassTest {

	public static void main(String[] args) {
		EnumClass coffee = new EnumClass();
		// CoffeeBrand is inside coffee with private so its not visible
		// CoffeeBrand cb = coffee.getCoffeeBrand();
		// coffee.setCoffeeBrand(CoffeeBrand.BRU);
		System.out.println(coffee.getCoffeeBrand());
		coffee.setCoffee(CoffeeSize.BIG);
		System.out.println(coffee.getCoffee());

		CoffeeSizeWithArgs coffeeSizeWithArgs = CoffeeSizeWithArgs.BIG;
		System.out.println(coffeeSizeWithArgs.getOunces());
		
		for (CoffeeSizeWithArgs  coffeeSize : CoffeeSizeWithArgs.values()) {
			System.out.println(coffeeSize + " is " +coffeeSize.getOunces() + " oz and price is " + coffeeSize.getPrice());
		}

	}

}
