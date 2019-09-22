package domaci;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();

		Tacka tacka[] = new Tacka[10];
		for (int i = 0; i < 10; i++) {
			tacka[i] = new Tacka(r.nextDouble(), r.nextDouble());
		}

		Trougao t1 = new Trougao(tacka[0], 3, 2, 4);
		Trougao t2 = new Trougao(tacka[1], 2, 5, 6);
		Trougao t3 = new Trougao(tacka[2], 6, 6, 10);
		Trougao t4 = new Trougao(tacka[3], 1, 2, 3);
		Trougao t5 = new Trougao(tacka[0], 2, 7, 8);

		if (t1.proveraStranica()) {
			System.out.println("Trougao t1 je moguce kreirati.");
		} else {
			System.out.println("Trougao t1 nije moguce kreirati.");
		}
		if (t4.proveraStranica()) {
			System.out.println("Trougao t4 je moguce kreirati.");
		} else {
			System.out.println("Trougao t4 nije moguce kreirati.");
		}
		System.out.println();

		if (t3.jednakokraki()) {
			System.out.println("Trougao t3 je jednakokraki.");
		} else {
			System.out.println("Trougao t3 nije jednakokraki.");
		}
		if (t2.jednakokraki()) {
			System.out.println("Trougao t2 je jednakokraki.");
		} else {
			System.out.println("Trougao t2 nije jednakokraki.");
		}
		System.out.println();

		System.out.println(t1.ispisTrougla());
		System.out.println();
		System.out.println(t2.ispisTrougla());
		System.out.println();

		if (t1.getTacka().poredjenje(t5.getTacka())) {
			System.out.println("Pocetne tacke t1 i t5 trougla jesu iste.");
		} else {
			System.out.println("Pocetne tacke t2 i t5 trougla nisu iste.");
		}
		if (t2.getTacka().poredjenje(t5.getTacka())) {
			System.out.println("Pocetne tacke t2 i t5 trougla jesu iste.");
		} else {
			System.out.println("Pocetne tacke t2 i t5 trougla nisu iste.");
		}
	}

}
