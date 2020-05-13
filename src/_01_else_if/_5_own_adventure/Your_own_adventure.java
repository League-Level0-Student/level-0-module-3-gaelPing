package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Your_own_adventure {
public static void main(String[] args) {
	System.out.println("WELLCOM TO YOUR ADVENTURE!!");
	System.out.println(" You wake up in an abandond building."
			+ "\n You look up and see three paths");
	String path=JOptionPane.showInputDialog(null, "what path will you go down?");

	if (path.equals("right")) {System.out.println("you died");
	
		
	}
	if (path.equals("left")) {
		System.out.println("you died");
		
	}
	if (path.equals("middle")) {System.out.println("you lived");
		
	}
	
	
	
	
	
	
	
	
	
	
}
}
