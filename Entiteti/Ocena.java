package Entiteti;

public class Ocena {
	private boolean aktivnost;
	private int ocena;
	private Predmet predmet;
	
	public Ocena() {
		this.aktivnost = false;
		this.ocena = 0;
		this.predmet = new Predmet();
	}
	
	public Ocena(int arg1, Predmet arg2) {
		this.aktivnost = false;
		this.ocena = arg1;
		this.predmet = arg2;
	}
}
