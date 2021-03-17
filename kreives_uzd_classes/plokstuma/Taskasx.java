package plokstuma;

public class Taskasx extends Taskas {
	public double atstumas;
	public int numeris;
	public Taskasx() {
		
	}
	public Taskasx(double atstumas_iki, int nr, double x_koord, double y_koord) {
		super(x_koord, y_koord);
		atstumas = atstumas_iki;
		numeris = nr;
	}

}
