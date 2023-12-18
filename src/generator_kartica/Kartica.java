package generator_kartica;

public class Kartica {

	String broj_kartice;
	int CVV;

	public Kartica(int a, int b, int c, int d, int CVV) {
		this.broj_kartice = a + "-" + b + "-" + c + "-" + d;
		this.CVV = CVV;
	}

}