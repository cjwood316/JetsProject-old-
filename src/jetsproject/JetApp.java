package jetsproject;

import java.util.Scanner;

public class JetApp {
	Scanner kb = new Scanner(System.in);
	Jet[] aircraft = new Jet[100];
	Jet j = new Jet();

	public static void main(String[] args) {
		JetApp st = new JetApp();
		st.start();
	}

	private void start() {
		MenuList rosterMenu = new MenuList();

		rosterMenu.menu();
		menuInput();
		initialStart();

	}

	private void menuInput() {
		boolean quit = false;

		while (!quit) {
			System.out.println("Enter your choice: ");
			int userInput = kb.nextInt();
			quit = userChoice(userInput);
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
			addJetToFleet();
			;
			break;
		case 5:
			System.out.println("Quitting!");
			return true;
		case 6:
			System.out.println("Oh $#@! we overbooked! One of you lucky united passengers GET OFF!");

		}
		return false;
	}

	public void initialStart() {

		aircraft[0] = new Jet("Lockheed Martin", "F-35 Lightning", 1100.00F, 1300, 94_000_000.00F);
		aircraft[1] = new Jet("Lockheed Martin", "F-35 Lightning", 1156.00F, 1389, 94_000_000.00F);
		aircraft[2] = new Jet("Lockheed Martin", "F-35 Lightning", 1143.00F, 1200, 94_000_000.00F);
		aircraft[3] = new Jet("Lockheed Martin", "F-35 Lightning", 1201.00F, 1400, 94_000_000.00F);
		aircraft[4] = new Jet("Lockheed Martin", "F-35 Lightning", 1197.00F, 1354, 94_000_000.00F);
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
		initialStart();
		Jet longest = new Jet();
		for (int i = 0; i < aircraft.length - 1; i++) {
			if (aircraft[i] != null && aircraft[i + 1] != null) {

				if (aircraft[i].getRange() > aircraft[i + 1].getRange()) {
					longest = aircraft[i];
				}
			}
		}
		System.out.println(longest.toString());
	}

	public void addJetToFleet() {
		System.out.println("Enter the make: ");
		String make = kb.next();
		System.out.println("Enter the model: ");
		String model = kb.next();
		System.out.println("Enter the speed(mph): ");
		float speed = kb.nextFloat();
		System.out.println("Enter the flight range(Miles): ");
		int range = kb.nextInt();
		System.out.println("Enter the price of jet: ");
		double price = kb.nextDouble();
		Jet[] temp = new Jet[aircraft.length + 1];
		for (int i = 0; i < aircraft.length; i++) {
			temp[i] = aircraft[i];
		}
		temp[aircraft.length] = new Jet(make, model, speed, range, price);
		aircraft = temp;
	}
}
