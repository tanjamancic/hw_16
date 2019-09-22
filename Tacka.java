package domaci;

public class Tacka {

	private double x;
	private double y;

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String ispisTacka() {
		return "(" + x + "," + y + ")";
	}

	public double setX(double x) {
		return this.x = x;
	}

	public double setY(double y) {
		return this.y = y;
	}

	public boolean poredjenje(Tacka b) {
		return this.equals(b);
	}
}
