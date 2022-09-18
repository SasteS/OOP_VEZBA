package Managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entiteti.Predmet;
import Entiteti.Profesor;
import Entiteti.Student;
import Enums.Semestar;

public class PredmetManager {
	private List<Predmet> predmeti;
	
	public PredmetManager() throws FileNotFoundException {
		this.predmeti = new ArrayList<Predmet>();
		//UcitajPredmete();
	}
	
	public PredmetManager(List<Predmet> predmeti) throws FileNotFoundException {
		this.predmeti = predmeti;
		//UcitajPredmete();
	}
	
	public void AddPredmete(Predmet predmet) {
		this.predmeti.add(predmet);
	}
	
	public void DelPredmete(Predmet predmet) {
		this.predmeti.remove(predmet);
	}
	
	public List<Predmet> GetPredmete() {
		return this.predmeti;
	}
	
	//public List<Predmet> GetPredmeteZaProfesora(String profesor_ime) {
	//	List<Predmet> ret_pred = new ArrayList<Predmet>();
	//	for (Predmet p : predmeti) {
	//		if (p.GetProfesor().GetIme().equals(profesor_ime))
	//			ret_pred.add(p);
	//	}
	//	return ret_pred;
	//}
	
	public void UcitajPredmete() throws FileNotFoundException {
		File file = new File("src//Predmeti.txt");
		Scanner sc = new Scanner(new FileReader(file));
		List<String[]> arr = new ArrayList<String[]>();
		while (sc.hasNext()) {
			String[] s = sc.next().split(",");
			arr.add(s);
		}
		sc.close();
		
		System.out.println("PREDMETI:");
		for (String[] s : arr) {
			ProfesorManager pm = new ProfesorManager();
			Predmet predmet = new Predmet(s[0], s[1], Semestar.valueOf(s[2]), pm.GetProfesor(s[3]));
			this.predmeti.add(predmet);
			System.out.println(s[0] + " " + s[1] + ", " + s[2] + ", " + s[3]);
		}
		System.out.println();
	}
	
	public void SetProfesora(String predmet_naziv, Profesor profesor) {
		for (Predmet p : predmeti) {
			if (p.GetNaziv().equals(predmet_naziv)) {
				p.SetProfesor(profesor);
				System.out.println(profesor.GetIme());
			}
		}
	}
	
	public boolean IsEmpty() {
		if (this.predmeti.isEmpty())
			return true;
		else
			return false;
	}
}
