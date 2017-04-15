package jetsproject;

public class Jet {
	protected String aircraftMake;
	protected String aircraftModel;
	protected float Speed;
	protected int range;
	protected double price;

	
	Pilot pilot = new Pilot();
	
	public Jet() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[aircraftMake= ");
		builder.append(aircraftMake);
		builder.append(", aircraftModel= ");
		builder.append(aircraftModel);
		builder.append(", Speed= ");
		builder.append(Speed);
		builder.append(", range= ");
		builder.append(range);
		builder.append(", price= ");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public Jet(String aircraftMake, String aircraftModel, float speed, int range, double price) {
		super();
		this.aircraftMake = aircraftMake;
		this.aircraftModel = aircraftModel;
		this.Speed = speed;
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
