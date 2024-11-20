package selectionStructures;

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {

		int userInput;

		userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input : "));

		JOptionPane.showMessageDialog(null, "User Input: " + userInput);

		if (userInput % 2 == 0) {
			JOptionPane.showMessageDialog(null, userInput + " is an even number");
		}

		else if (userInput % 2 == 1) {
			JOptionPane.showMessageDialog(null, userInput + " is an odd number.");
		}

		else {

			JOptionPane.showMessageDialog(null, userInput + " Equals 0");
		}
	}

}
