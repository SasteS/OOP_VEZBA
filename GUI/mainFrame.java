package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Managers.PredmetManager;
import Managers.ProfesorManager;
import Managers.StudentManager;

public class mainFrame {
	private JFrame frame;
	private JPanel panel;
	private JButton dodavanje;
	private JButton brisanje;
	private JButton izmena;
	private JButton prikaz;
	
	public mainFrame() throws FileNotFoundException, ParseException {
		frame = new JFrame("Studenti");
		frame.setSize(500, 400);
		
		panel = new JPanel();
		frame.add(panel);
		
		dodavanje = new JButton("dodavanje");
		brisanje = new JButton("brisanje");
		izmena = new JButton("izmena");
		prikaz = new JButton("prikaz");
		
		panel.add(dodavanje);
		panel.add(brisanje);
		panel.add(izmena);
		panel.add(prikaz);
		
		
		PredmetManager prm = new PredmetManager();
		prm.UcitajPredmete();
		StudentManager sm = new StudentManager();
		sm.UcitajStudente();		
		ProfesorManager pm = new ProfesorManager();
		pm.UcitajProfesore(prm);		
		
		dodavanje.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		brisanje.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		izmena.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		prikaz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		frame.setVisible(true);
	}
}