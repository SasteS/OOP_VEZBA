package Entiteti;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.Titula;

public class Profesor extends Osoba {
	private String brLicne;
	private Date datumZaposljenja;
	private Titula titula;
	private List<Predmet> predmeti;
	
	public Profesor() {
		this.brLicne = "";
		this.datumZaposljenja = null;
		this.titula = Titula.NOV;
		this.predmeti = new ArrayList<Predmet>();
	}
	
	public Profesor(String ime, String prezime, String jmbg, String brLicne, Date datum, Titula titula) {
		this.SetBool(false);
		this.SetIme(ime);
		this.SetPrezime(prezime);
		this.SetJmbg(jmbg);
		this.brLicne = brLicne;
		this.datumZaposljenja = datum;
		this.titula = titula;
		this.predmeti = new ArrayList<Predmet>();
	}
	
	public List<Predmet> GetPredmeti() {
		return this.predmeti;
	}
	
	public void AddPredmet(Predmet p) {
		predmeti.add(p);
	}
}
