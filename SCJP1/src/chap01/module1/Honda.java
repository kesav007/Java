package chap01.module1;

public class Honda extends Car {

	private String speed;

	public Honda() {
		speed = "65";
	}

	@Override
	public void goUpHill() {
		System.out.println("Hondas Up Hill ");
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Honda [speed=" + speed + "]";
	}

}
