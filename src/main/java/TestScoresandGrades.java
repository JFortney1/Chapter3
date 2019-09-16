
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jfortney
 */
public class TestScoresandGrades {

    public static void main(String[] args) {

        {
            // Declare variables to hold user input
            String input1, input2, input3;
            // Declare variables to store converted user input
            double score1,
                    score2,
                    score3,
                    average;

            // Prompt user for 5 test scores
            input1 = JOptionPane.showInputDialog(null, "Enter score 1:");
            input2 = JOptionPane.showInputDialog(null, "Enter score 2:");
            input3 = JOptionPane.showInputDialog(null, "Enter score 3:");

            // Convert test scores to data type double
            score1 = Double.parseDouble(input1);
            score2 = Double.parseDouble(input2);
            score3 = Double.parseDouble(input3);

            // Calculate test score average
            average = (score1 + score2 + score3) / 3;

            /* Design a decision structure to determine a
           letter grade that corresponds to the average.*/
            if (average <= 100) {
                if (average >= 90) {
                    JOptionPane.showMessageDialog(null, "Your average is " + average + " or A");
                } else if (average >= 80) {
                    JOptionPane.showMessageDialog(null, "Your average is " + average + " or B");
                } else if (average >= 70) {
                    JOptionPane.showMessageDialog(null, "Your average is " + average + " or C");
                } else if (average >= 60) {
                    JOptionPane.showMessageDialog(null, "Your average is " + average + " or D");
                } else if (average < 60) {
                    JOptionPane.showMessageDialog(null, "Your average is " + average + " or F");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your average is out of bounds, check test scores.");
            }
        }

    }
}
