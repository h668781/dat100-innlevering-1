package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	
public static void main(String[] args) {
		
	double betale = 0;	
	
	String tallTxt = showInputDialog("Hva er dinn inntekt:");

	double tall = parseInt(tallTxt);
	double trinnskatt = 0;
	
	if (tall <= 208050 && tall >= 0) {
				
		trinnskatt = 0;	;			
	}		
	if (tall <= 292850 && tall >= 208050) {
				
		trinnskatt = 0.017;				
	}		
	if (tall <= 670000 && tall >= 292851) {
				
		trinnskatt = 0.04;			
	}	
	if (tall <= 937900 && tall >= 670001) {
				
		trinnskatt = 0.136;			
	}
	if (tall <= 1350000 && tall >= 937901) {
				
		trinnskatt = 0.166;			
	}
	if ( tall > 1350001) {
				
		trinnskatt = 0.176;			
	}
	
	betale = tall * trinnskatt;
	
	System.out.println("Din bruttoinntekt er: " + tallTxt + "KR");
	System.out.println("Du må betale: "+ betale + "KR");
		
	}
}
