package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		

		for (int i = 0; i <= 10; i++) {
		    
			String karakter = "Må skrive et tall";
			
			String tallTxt = showInputDialog("Poengsum mellom 0 - 100:");

			int tall = parseInt(tallTxt);
			
			if (tall < 0 || tall > 100) {
				
				karakter = "Ugyldig Poengsum";
				i--;
			}
			if (tall <= 100 && tall >= 90) {
				
				karakter = "A";			
			}		
			if (tall <= 89 && tall >= 80) {
				
				karakter = "B";			
			}		
			if (tall <= 79 && tall >= 60) {
				
				karakter = "C";			
			}	
			if (tall <= 59 && tall >= 50) {
				
				karakter = "D";			
			}
			if (tall <= 49 && tall >= 40) {
				
				karakter = "E";			
			}
			if (tall <= 39 && tall >= 0) {
				
				karakter = "F";			
			}
			System.out.println(karakter);
		}
		
		
	}

}
