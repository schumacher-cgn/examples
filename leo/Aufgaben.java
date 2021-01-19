package de.schumacher.data.test;

import java.util.Scanner;

public class Aufgaben {

	public static void main(String[] args) {

		System.out.println("Aufgabe Fakultät:");
		aufgabeFakultaet();

		System.out.println("Aufgabe 1:");
		aufgabe1();

		System.out.println("Aufgabe 2:");
		aufgabe2();

		System.out.println("Aufgabe 3:");
		aufgabe3();

		System.out.println("Ende!");
	}

	private static void aufgabeFakultaet() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie n für die Fakultätsberechnung ein (z.B. 5):");
		int n = scan.nextInt();

		int ergebnis = 1;
		while (n > 1) {
			ergebnis = ergebnis * n;
			n = n - 1;
		}
		System.out.println("Ergebnis ist " + ergebnis);

	}

	private static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie n ein (z.B. 5):");
		int n = scan.nextInt();

		int quadrat = n * n;
		int kubik = n * n * n;

		// Lösung ohne Schleife
		System.out.println("Ergebnis ohne While-Schleife vom quadrat = " + quadrat);
		System.out.println("Ergebnis ohne While-Schleife vom kubik = " + kubik);
	}

	private static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie n ein (z.B. 5):");
		int n = scan.nextInt();

		System.out.println("Geben Sie x alz Kommazahl ein (z.B. 1,3):");
		double x = scan.nextDouble();
		double ergebnis = 1;

		if (n <= 0) {
			System.out.println("n muss positiv sein.");
		} else {
			while (n != 0) {
				ergebnis = ergebnis * x;
				n = n - 1;
			}
			System.out.println("Ergebnis = " + ergebnis);
		}
	}

	private static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie n ein (z.B. 7):");
		int n = scan.nextInt();

		while (n != 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println("");
			n = n - 1;
		}
	}

}
