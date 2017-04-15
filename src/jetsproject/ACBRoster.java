package jetsproject;

import java.util.Scanner;

public class ACBRoster {
	public void main(String[] args) {
		ACBRoster st = new ACBRoster();
		st.start();
	}

	void start() {
			Jet[] aircraft = new Jet[100];
			{
			aircraft[0] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			aircraft[1] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			aircraft[2] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			aircraft[3] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			aircraft[4] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			aircraft[5] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
			}
}
}
