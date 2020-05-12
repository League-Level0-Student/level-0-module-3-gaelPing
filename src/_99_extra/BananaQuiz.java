
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{String ƒ = JOptionPane.showInputDialog(null, "do you like bananas?");
		if (ƒ.equals("yes")) {
			
			String hobby=JOptionPane.showInputDialog(null, "What is your favorit hobby?");
			JOptionPane.showMessageDialog(null, hobby +" is much better with bananas");
		}	
	if (ƒ.equals("no")) {
		System.out.println("you are crazy!");
		System.exit(0);
	}
	 if (ƒ.equals(ƒ)) {	JOptionPane.showMessageDialog(null, "YOU ARE BANANAS");	 
	 
	}
	}	


		
		
		
		
	}


//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	