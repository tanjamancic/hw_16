package domaci;

public class Trougao {
	private Tacka t;
	private double a;
	private double b;
	private double c;

	public Trougao(Tacka t, double a, double b, double c) {
		this.t = t;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Tacka getTacka() {
		return t;
	}

	public boolean proveraStranica() {
		if (a < 0 || b < 0 || c < 0) {
			return false;
		}
		if (a + b <= c || c + b <= a || a + c <= b) {
			return false;
		} else {
			return true;
		}
	}

	public boolean jednakokraki() {
		if (a == b || a == c || b == c) {
			return true;
		} else {
			return false;
		}
	}

	public double povrsina() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double obim() {
		return a + b + c;
	}

	public boolean setA(int n) { // jedna metoda za sve stranice?
		if (n > 0 && b + c > n) {
			a = n;
			return true;
		} else {
			System.out.println("Neuspesna dodela vrednosti.");
			return false;
		}
	}

	public boolean setB(int n) {
		if (n > 0 && a + c > n) {
			b = n;
			return true;
		} else {
			System.out.println("Neuspesna dodela vrednosti.");
			return false;
		}
	}

	public boolean setC(int n) {
		if (n > 0 && b + a > n) {
			c = n;
			return true;
		} else {
			System.out.println("Neuspesna dodela vrednosti.");
			return false;
		}
	}

	public String ispisTrougla() {
		if (proveraStranica()) {
			return "- Trougao sa pocetkom u " + t.ispisTacka() + "\n- Stranice trougla: " + a + " , " + b + " , " + c
					+ "\n- Povrsina i obim: P=" + povrsina() + ", O= " + obim();
		} else {
			return "Trougao nije kreiran pravilno.";
		}
	}

}
