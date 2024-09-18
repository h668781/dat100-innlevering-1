package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {

		String n  = showInputDialog("Skriv eit hel tall som er støre en 0:");
	
		int tall = parseInt(n);
		
		int m = 1;
		
		for (int i = 1; i <= tall; i++) {
			m = (i) *m;
			
		}
		System.out.println(m);
	}
	
}
