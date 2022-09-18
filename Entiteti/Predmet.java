package Entiteti;

import Enums.Semestar;

public class Predmet {
	private boolean aktivnost;
	private String sifra;
	private String naziv;
	private Semestar semestar;
	private Profesor profesor;
	
	public Predmet() {
		this.aktivnost = false;
		this.sifra = "";
		this.naziv = "";
		this.semestar = Semestar.PRVI;
		this.profesor = new Profesor();
	}
	
	public Predmet(String arg1, String arg2, Semestar arg3, Profesor arg4) {
		this.aktivnost = false;
		this.sifra = arg1;
		this.naziv = arg2;
		this.semestar = arg3;
		this.profesor = arg4;
	}
	
	public String GetNaziv() {
		return this.naziv;
	}
	
	public Profesor GetProfesor() {
		return this.profesor;
	}
	
	public void SetProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}
