package hu.me.krz.haladojava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner eyes = new Scanner(System.in);
		System.out.println("Diákok száma:\n");
		int db = 0;

		try {
			db = eyes.nextInt();

		} catch (Exception ex) {
			System.err.println("Oopsie woopsie " + ex.getMessage());
			System.exit(-20);
		}

		eyes.close();

		Diak[] diakok = new Diak[db];

		for (int i = 0; i < diakok.length; i++) {
			String name = "diák" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(25 - 18 + 1) + 18;
			int puska = r.nextInt(6 - 0) % 6;
			diakok[i] = new Diak(name, age, puska);
		}

		Arrays.sort(diakok);

		for (Diak lol : diakok) {
			System.out.println(lol);
		}

	}
}
