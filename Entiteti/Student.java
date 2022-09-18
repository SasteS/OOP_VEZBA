package Entiteti;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Osoba {
	private String index;
	private Date datumUpisa;
	private List<Predmet> predmeti;
	private List<Ocena> ocene;
	
	public Student() {
		this.index = "";
		this.datumUpisa = null;
		this.predmeti = new ArrayList<Predmet>();
		this.ocene = new ArrayList<Ocena>();
	}
	
	public Student(String ime, String prezime, String jmbg, String index, Date datum) {//, List<Predmet> predmeti, List<Ocena> ocene) {
		this.SetBool(false);
		this.SetIme(ime);
		this.SetPrezime(prezime);
		this.SetJmbg(jmbg);
		this.index = index;
		this.datumUpisa = datum;
		this.predmeti = new ArrayList<Predmet>();
		this.ocene = new ArrayList<Ocena>();
	}
	
	public void AddPredmet(Predmet p) {
		predmeti.add(p);
	}
}
