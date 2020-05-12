
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Decenber 28th";
		String dadsBirthday = "November 3rd";
		String myBirthday = "September 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String ƒ=JOptionPane.showInputDialog("Whos birth day do you want to save");
	
		// 3. Print out what the user typed
		System.out.println(ƒ);
		// 4. if user asked for "mom"
		if (ƒ.equals("mom")) {
			System.out.println(momsBirthday);
			
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if (ƒ.equals("dad")) {
			System.out.println(dadsBirthday);
			
		}
			// print dad's birthday
		// 6. if user asked for your name
		if (ƒ.equals("My birthdaty")) {
			System.out.println(myBirthday);
			
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
