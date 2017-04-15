package jetsproject;

import java.util.Scanner;

public class ACBRoster {
	public static void main(String[] args) {
		ACBRoster st = new ACBRoster();
		st.start();
	}

	private void start() {
		MenuList rosterMenu = new MenuList();

		rosterMenu.menu();
		menuInput();
		initialStart();

	}

	private void menuInput() {
		Scanner kb = new Scanner(System.in);
		boolean quit = false;

		while (!quit) {

			int userInput = kb.nextInt();
			quit = userChoice(userInput);
		}

	}

	private boolean userChoice(int choice) {

		switch (choice) {

		case 1:
			// listFleet();
			break;

		case 2:
			// viewFastestJet();
			break;

		case 3:
			// viewLongestRange();
			break;

		case 4:
			// addJetToFleet();
			;
			break;
		case 5:
			System.out.println("Quitting!");
			return true;

		}
		return false;
	}

	public void initialStart() {
		Jet[] aircraft = new Jet[100];
		aircraft[0] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
		aircraft[1] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
		aircraft[2] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
		aircraft[3] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
		aircraft[4] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
		aircraft[5] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
	}
}
