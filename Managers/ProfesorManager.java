package Managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entiteti.Predmet;
import Entiteti.Profesor;
import Entiteti.Student;
import Enums.Titula;

public class ProfesorManager {
private List<Profesor> profesori;
	
	public ProfesorManager() throws FileNotFoundException {
		this.profesori = new ArrayList<Profesor>();
		//UcitajProfesore();
	}
	
	public ProfesorManager(List<Profesor> profesori) throws FileNotFoundException {
		this.profesori = profesori;
		//UcitajProfesore();
	}
	
	public void AddProfesor(Profesor profesor) {
		this.profesori.add(profesor);
	}
	
	public void DelProfesor(Profesor profesor) {
		this.profesori.remove(profesor);
	}
	
	public List<Profesor> GetProfesore() {
		return this.profesori;
	}
	
	public Profesor GetProfesor(String profesor_ime) {
		for (Profesor p : profesori) {
			if (p.GetIme().equals(profesor_ime))
				return p;
		}
		return null;
	}
	
	public void UcitajProfesore(PredmetManager pm) throws FileNotFoundException, ParseException {
		File file = new File("src//Profesori.txt");
		Scanner sc = new Scanner(new FileReader(file));
		List<String[]> arr = new ArrayList<String[]>();
		while (sc.hasNext()) {
			String[] s = sc.next().split(",");
			arr.add(s);
		}
		sc.close();
		
		System.out.println("PROFESORI:");
		for (String[] s : arr) {			
			SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.");
			String dateInString = s[4];
			Date date = formatter.parse(dateInString);
			
			Profesor profesor = new Profesor(s[0], s[1], s[2], s[3], date, Titula.valueOf((s[5])));
			//pm.UcitajPredmete();
			for (Predmet p : pm.GetPredmete()) {
				if (p.GetNaziv().equals(s[6])) {
					profesor.AddPredmet(p);
					pm.SetProfesora(p.GetNaziv(), profesor);
				}
			}
			this.profesori.add(profesor);
			System.out.println(s[0] + " " + s[1] + ", " + s[2] + ", " + s[3] + ", " + s[4] + ", " + s[5] + ", " + s[6]);
			
			for (Predmet p : profesor.GetPredmeti()) {
				System.out.println(p.GetNaziv());
			}
		}
		System.out.println();
	}
}
