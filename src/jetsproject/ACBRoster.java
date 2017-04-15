package jetsproject;

import java.util.Scanner;

public class ACBRoster {
	Jet[] aircraft = new Jet[100];
	Jet j = new Jet();

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
			System.out.println("Enter your choice: ");
			int userInput = kb.nextInt();
			userChoice(userInput);
		}

	}

	private boolean userChoice(int choice) {

		switch (choice) {

		case 1:
			listFleet();
			break;

		case 2:
			viewFastestJet();
			break;

		case 3:
			 viewLongestRange();
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

		aircraft[0] = new Jet("Lockheed Martin", "F-35 Lightning", 1100.00F, 1379, 94_000_000.00F);
		aircraft[1] = new Jet("Lockheed Martin", "F-35 Lightning", 1156.00F, 1379, 94_000_000.00F);
		aircraft[2] = new Jet("Lockheed Martin", "F-35 Lightning", 1143.00F, 1379, 94_000_000.00F);
		aircraft[3] = new Jet("Lockheed Martin", "F-35 Lightning", 1201.00F, 1379, 94_000_000.00F);
		aircraft[4] = new Jet("Lockheed Martin", "F-35 Lightning", 1197.00F, 1379, 94_000_000.00F);
		aircraft[5] = new Jet("Lockheed Martin", "F-35 Lightning", 1199.00F, 1379, 94_000_000.00F);
	}

	public void listFleet() {
		initialStart();
		for (int i = 0; i < aircraft.length; i++) {
			if (aircraft[i] != null) {
				System.out.println(aircraft[i].toString());

			}

		}

	}

	public void viewFastestJet() {
		initialStart();
		Jet fastest = new Jet();
		for (int i = 0; i < aircraft.length - 1; i++) {
			if (aircraft[i] != null && aircraft[i + 1] != null) {

				if (aircraft[i].getSpeed() > aircraft[i + 1].getSpeed()) {
					fastest = aircraft[i];
				}
			}
		}
		System.out.println(fastest.toString());
	}
	public void viewLongestRange() {
		
	}
}
