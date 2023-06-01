// Chapter 6 Practice Project 5/31/2023

import javax.swing.JOptionPane;

public class RandomGuess3
{
	public static void main(String[] args) 
	{
		// Variables and constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int LOW = 1;
		final int HIGH = 10;

		// Input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));

		// Processing phase
		magicNumber = (int) (Math.random()* HIGH) + LOW;

		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
				msg = "Sorry, your guess was to high!";
			} else {
				msg = "Sorry, your guess was too low!";
			} // end of else statement

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH)); 
			// increment the number of attempts before the userGuess is checked again
			++attempts;
		} // end of while loop

		// output phase
		JOptionPane.showMessageDialog(null, "YOU'VE WON! \nThe magic number was: " + magicNumber + "\nYou guessed it in " + attempts + " attempt(s)!");
	} // end of main
} // end of class