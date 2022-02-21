package car;

public class Car {

	private int currentSpeed;
	private int currentGear;
	
	public void speedUp(int increment) {
		currentSpeed += increment;
	}
	
	public void slowDown(int decrement) {
		currentSpeed -= decrement;
	}
	
	public void changeGear(int gear) {
		currentGear = gear;
	}
	
	@Override
	public String toString() {
		return "Car [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public int getCurrentGear() {
		return currentGear;
	}
	
	
}
