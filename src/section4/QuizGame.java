package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String Answer = JOptionPane.showInputDialog("Who is #10 on the USWNT?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(Answer.equals("Carli Lloyd")) {
			System.out.println("Carli Lloyd");
		score ++;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	String thing = JOptionPane.showInputDialog("Who is #13 on the USWNT?");
				if(thing.equals("Alex Morgan")) {
					System.out.println("Alex Morgan");
					score ++;
				}
				String thingy = JOptionPane.showInputDialog("Who is #15 on the USWNT?");
				if(thingy.equals("Megan Rapinoe")){
				System.out.println("Megan Rapinoe");
				score++;
				}	
				String K = JOptionPane.showInputDialog("Who is #11 on the USWNT?");
				if(K.equals("Mallory Pugh")) {
					System.out.println("Mallory Pugh");
					score ++;
				}
				String A = JOptionPane.showInputDialog("Who is #12 on the USWNT?");
				if(A.equals("Tierna Davidson")) {
					System.out.println("Tierna Davidson");
					score ++;
				}
				JOptionPane.showInputDialog("Who is #20 on the USWNT?");
				if(Answer.equals("Ashlyn Harris")) {
					System.out.println("Ashlyn Harris");
					score ++;
				}
				JOptionPane.showInputDialog("Who is #8 on the USWNT?");
				if(Answer.equals("Julie Ertz")) {
					System.out.println("Julie Ertz");
					score ++;
				}
				JOptionPane.showInputDialog("Who is #17 on the USWNT?");
				if(Answer.equals("Tobin Heath")) {
					System.out.println("Tobin Heath");
					score ++;
				}
		// 6.  After all the questions have been asked, print the user's score 
				JOptionPane.showMessageDialog(null, "Your final score is "+ score + " / 8");
	}
}
