package jetsproject;

public class Jet {
	String aircraftModel;
	float Speed;
	int range;
	double price;
	

	public Jet() {
		super();
	}

	public Jet(String aircraftModel, float speed, int range, double price) {
		super();
		this.aircraftModel = aircraftModel;
		Speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public float getSpeed() {
		return Speed;
	}

	public void setSpeed(float speed) {
		Speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
