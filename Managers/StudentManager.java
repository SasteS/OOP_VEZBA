package Managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public void UcitajStudente() throws FileNotFoundException {
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
			Student student = new Student(s[0], s[1], s[2], s[3], null, null, null);
			
			this.studenti.add(student);
			System.out.println(s[0] + " " + s[1] + ", " + s[2] + ", " + s[3] + ", " + s[4]);
		}
		System.out.println();
	}
}
