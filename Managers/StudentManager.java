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
import Entiteti.Student;

public class StudentManager {
	private List<Student> studenti;
	
	public StudentManager() throws FileNotFoundException {
		this.studenti = new ArrayList<Student>();
		//UcitajStudente();
	}
	
	public StudentManager(List<Student> studenti) throws FileNotFoundException {
		this.studenti = studenti;
		//UcitajStudente();
	}
	
	public void AddStudent(Student student) {
		this.studenti.add(student);
	}
	
	public void DelStudent(Student student) {
		this.studenti.remove(student);
	}
	
	public List<Student> GetStudente() {
		return this.studenti;
	}
	
	public void UcitajStudente(PredmetManager pm) throws FileNotFoundException, ParseException {
		File file = new File("src//Studenti.txt");
		Scanner sc = new Scanner(new FileReader(file));
		List<String[]> arr = new ArrayList<String[]>();
		while (sc.hasNext()) {
			String[] s = sc.next().split(",");
			arr.add(s);
		}
		sc.close();		
		
		System.out.println("STUDENTI:");
		for (String[] s : arr) {
			SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
			String dateString = s[4];
			Date date = df.parse(dateString);
			
			Student student = new Student(s[0], s[1], s[2], s[3], date); //dodati predmete i ocene
			
			///////////////////////////////////////////////
			List<String> ret_list = OdrediPredmete(s[6]);
			for (Predmet p : pm.GetPredmete()) {
				for (String str : ret_list) {
					if (p.GetNaziv().equals(str)) {
						student.AddPredmet(p);
						break;
					}
				}
			}
			
			this.studenti.add(student);
			System.out.println(s[0] + " " + s[1] + ", " + s[2] + ", " + s[3] + ", " + s[4]);
		}
		System.out.println();
	}
	
	public List<String> OdrediPredmete(String s) { //doraditi
		List<String> ret_list = new ArrayList<String>();
		return ret_list;
	}
}
