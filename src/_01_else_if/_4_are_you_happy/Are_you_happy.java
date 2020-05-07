package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	
	
	String happy =JOptionPane.showInputDialog(null, "are you happy?");
	if (happy.equals("yes")) {System.out.println("good stay that way.");
		
	}
	else { 
		if (happy.equals("no")) {
			String sad=JOptionPane.showInputDialog("Why are you not happy?");
			if (sad.equals("life")) {System.out.println("hope you get better.");
			
		}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
