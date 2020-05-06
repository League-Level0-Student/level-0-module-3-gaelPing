
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot potato = new Robot();
		potato.penDown();
		potato.setPenWidth(10);
		potato.setSpeed(100);
		
		for (int v = 0; v < 4; v++) {
		String random = JOptionPane.showInputDialog(null, "what color would you like to use.");	
		
		if (random.equals("red")) {
			for (int i = 0; i < 4; i++) {
				potato.setPenColor(Color.red);
				potato.move(100);
				potato.turn(90);
			}

		} else if (random .equals("blue")) {
			potato.turn(90);
			for (int i = 0; i < 4; i++) {
				potato.setPenColor(Color.blue);
				potato.move(100);
				potato.turn(90);

			}
		
	} else if (random .equals("green")) {
		potato.turn(90);
		for (int i = 0; i < 4; i++) {
			potato.setPenColor(Color.green);
			potato.move(100);
			potato.turn(90);}

		
	}else if (random .equals("random")) {
		potato.turn(90);
		potato.setRandomPenColor();
			for (int i = 0; i < 4; i++) {
				potato.move(100);
				potato.turn(90);

			}
	}
		}
		// 1. Create a new Robot
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
