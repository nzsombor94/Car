package car;

public class App {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		System.out.println(car);
		System.out.println(car);
		car.speedUp(140);
		car2.changeGear(2);
		car.slowDown(45);
		car2.slowDown(30);
		car.changeGear(4);
		car2.speedUp(10);
		System.out.println(car);
		System.out.println(car2);
		
		Car car3 = new Car();
		Car.colorOfNextCar = "kék";
		Car car4 = new Car();
		Car.colorOfNextCar = "piros";
		System.out.println(car3);
		System.out.println(car4);
	}

}
