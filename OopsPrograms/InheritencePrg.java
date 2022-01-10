package oops;

class Bike {
	int gear;
	int speed;

	public Bike(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	void applybBreak(int decrement) {
		speed -= decrement;
	}

	void speedup(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bike [gear=" + gear + ", speed=" + speed + "]";
	}
}

class TrackBike extends Bike {
	int seatheight;

	public TrackBike(int gear, int speed, int seatheight) {

		super(gear, speed);
		this.seatheight = seatheight;

	}

	void adjustheight(int value) {
		seatheight = value;
	}

	@Override
	public String toString() {
		return "TrackBike [seatheight=" + seatheight +  ", gear=" + gear + ", speed=" + speed +"]";
	}
}

public class InheritencePrg {

	public static void main(String[] args) {
		TrackBike bike = new TrackBike(5, 160, 10);
		bike.speedup(10);
		bike.applybBreak(5);
		System.out.println(bike.toString());

	}

}
