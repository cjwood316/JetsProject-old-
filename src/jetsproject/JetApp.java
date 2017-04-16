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

		aircraft[0] = new Jet("F-35C Lightning II", 1197.00f, 1400, 122_000_000.00F);
		aircraft[1] = new Jet("A-10 Warthog", 439.00f, 800, 18_800_000.00F);
		aircraft[2] = new Jet("F-18 Hornet", 1190.00f, 2069, 98_000_000.00F);
		aircraft[3] = new Jet("F-4 Phantom II", 1473.00f, 1615, 2_400_000.00F);
		aircraft[4] = new Jet("F-22 Raptor", 1498.00f, 1839, 150_000_000.00F);
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
		
		for (int i = 0; i < aircraft.length; i++) {
			if (aircraft[i] != null) {

				if (aircraft[i].getSpeed() > fastest.getSpeed()) {
					fastest = aircraft[i];
				}
			}
		}
		System.out.println("Fastest jet: " + fastest.toString());
	}

	public void viewLongestRange() {
		initialStart();
		Jet longest = new Jet();
		for (int i = 0; i < aircraft.length; i++) {
			if (aircraft[i] != null) {

				if (aircraft[i].getRange() > longest.getRange()) {
					longest = aircraft[i];
				}
			}
		}
		System.out.println("Longest range jet: " + longest.toString());
	}

	public void addJetToFleet() {
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
		temp[aircraft.length] = new Jet(model, speed, range, price);
		aircraft = temp;
	}
}
