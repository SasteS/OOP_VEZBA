package Entiteti;

public abstract class Osoba {
	private boolean aktivnost;
	private String ime;
	private String prezime;
	private String jmbg;
	
	public Osoba() {
		this.aktivnost = false;
		this.ime = "";
		this.prezime = "";
		this.jmbg = "";
	}
	
	public Osoba(String arg0, String arg1, String arg2) {
		this.aktivnost = false;
		this.ime = arg0;
		this.prezime = arg1;
		this.jmbg = arg2;
	}
	
	public void SetIme(String arg) {
		this.ime = arg;
	}
	
	public void SetPrezime(String arg) {
		this.prezime = arg;
	}
	
	public void SetJmbg(String arg) {
		this.jmbg = arg;
	}
	
	public String GetIme() {
		return this.ime;
	}
	
	public String GetPrezime() {
		return this.prezime;
	}
	
	public String GetJMBG() {
		return this.jmbg;
	}
	
	public void SetBool(boolean arg) {
		this.aktivnost = arg;
	}
}
