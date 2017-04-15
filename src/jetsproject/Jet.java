package jetsproject;

public class Jet {
	protected String aircraftMake;
	protected String aircraftModel;
	protected float speed;
	protected int range;
	protected double price;
	private Pilot p;
	
	public Jet() {
		super();
	}
	public Jet(String aircraftMake, String aircraftModel, float speed, int range, double price) {
		super();
		this.aircraftMake = aircraftMake;
		this.aircraftModel = aircraftModel;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public Jet(String aircraftMake, String aircraftModel, float speed, int range, double price, Pilot p) {
		super();
		this.aircraftMake = aircraftMake;
		this.aircraftModel = aircraftModel;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.p = p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[aircraftMake= ");
		builder.append(aircraftMake);
		builder.append(", aircraftModel= ");
		builder.append(aircraftModel);
		builder.append(", Speed= ");
		builder.append(speed);
		builder.append(", range= ");
		builder.append(range);
		builder.append(", price= ");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}


	public String getAircraftMake() {
		return aircraftMake;
	}
	public void setAircraftMake(String aircraftMake) {
		this.aircraftMake = aircraftMake;
	}
	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
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
