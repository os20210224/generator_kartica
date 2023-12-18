package generator_kartica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class GeneratorKartica {

	public static void main(String[] args) {
		int broj_kartica = 20;
		String naziv_fajla = "kreditne_kartice.txt";
		if (args.length > 1) {
			broj_kartica = Integer.parseInt(args[0]);
			naziv_fajla = args[1];
		}
		if (generisi_kartice(broj_kartica, naziv_fajla)) {
			System.out.println("> Uspesno generisano " + broj_kartica + " kartica u fajl " + naziv_fajla + ";");
		}
	}

	// METODE

	static boolean generisi_kartice(int broj_kartica, String naziv_fajla) {
		Kartica[] generisane_kartice = new Kartica[broj_kartica];
		Kartica nova_kartica;
		for (int i = 0; i < broj_kartica; i++) {
			do {
				nova_kartica = new Kartica(random_broj(4), random_broj(4), random_broj(4), random_broj(4),
						random_broj(3));
			} while (duplikat(nova_kartica, generisane_kartice));
			generisane_kartice[i] = nova_kartica;
		}
		return upisi_kartice(generisane_kartice, naziv_fajla);
	}

	static boolean upisi_kartice(Kartica[] generisane_kartice, String naziv_fajla) {
		try {
			RandomAccessFile fajl = new RandomAccessFile(naziv_fajla, "rw");
			for (Kartica kartica : generisane_kartice) {
				fajl.writeBytes(kartica.broj_kartice + " " + kartica.CVV + "\n");
			}
			fajl.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	static boolean duplikat(Kartica k, Kartica[] kartice) {
		for (Kartica kartica : kartice) {
			if (kartica != null && kartica.broj_kartice.equals(k.broj_kartice))
				return true;
		}
		return false;
	}

	static int random_broj(int mod) {
		Random random = new Random();
		switch (mod) {
		case 3:
			return random.nextInt(999 - 100) + 100;
		case 4:
			return random.nextInt(9999 - 1000) + 1000;
		default:
			return 0;
		}
	}

}
