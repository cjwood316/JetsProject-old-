package jetsproject;

public class Pilot {
	protected String pilotName;

	public Pilot() {
	}

	public Pilot(String pilotName) {
		super();
		this.pilotName = pilotName;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

}
