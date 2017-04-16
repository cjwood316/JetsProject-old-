package jetsproject;

public class Jet {
	private String aircraftModel;
	private float speed;
	private int range;
	private double price;
	private Pilot p;
	
	public Jet() {
		super();
	}
	public Jet(String aircraftModel, float speed, int range, double price) {
		super();
		this.aircraftModel = aircraftModel;
		this.speed = (speed * 0.00131f);
		this.range = range;
		this.price = price;
	}
	public Jet(String aircraftModel, float speed, int range, double price, Pilot p) {
		super();
		this.aircraftModel = aircraftModel;
		this.speed = (speed * 0.00131f);
		this.range = range;
		this.price = price;
		this.p = p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" AircraftModel= ");
		builder.append(aircraftModel);
		builder.append(", Speed= ");
		builder.append(speed);
		builder.append(", range= ");
		builder.append(range);
		builder.append(", price= $");
		builder.append(price);
		builder.append("");
		return builder.toString();
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed * 0.00131f;
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
	public Pilot getP() {
		return p;
	}
	public void setP(Pilot p) {
		this.p = p;
	}

}
