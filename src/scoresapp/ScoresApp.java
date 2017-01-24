package scoresapp;

import javax.swing.JOptionPane;

/**
 *
 * @author bryanshintani
 */
public class ScoresApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  int scoreCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of scores"));
        
        int[] quiz1 = new int[scoreCount];
        
        for(int i = 0; i < scoreCount; i++) {
            quiz1[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter score for student #" + (i + 1)));
        }
        */
        
        String scoresInput = JOptionPane.showInputDialog("Please enter scores seperated by a space");
        
        String[] scoreList = scoresInput.split(" ");
        
        int[] quiz1 = new int[scoreList.length];
        
        for(int i = 0; i < scoreList.length; i++) {
            quiz1[i] = (Validator.getValidScore(scoreList[i]));
        }
        
        ScoresCalculator sc = new ScoresCalculator(quiz1);
        
        String[] choices = {"Get List", "Get Count", "Get Total", "Get Max", "Get Min", "Get Average", "Find Score", "Exit"};
        int input = 0;
        
        do{
            input = JOptionPane.showOptionDialog(null, 
                    "Scores Operations", 
                    "Select Option", 
                    JOptionPane.OK_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    choices, 
                    "Get List");

            if(input == 0) {
                JOptionPane.showMessageDialog(null, sc.listScores());
            } else if(input == 1) {
                JOptionPane.showMessageDialog(null, "Scores Count: " + sc.getScoresCount());
            } else if(input == 2) {
                JOptionPane.showMessageDialog(null, "Scores Total: " + sc.getScoresTotal());
            } else if(input == 3) {
                JOptionPane.showMessageDialog(null, "Scores Max: " + sc.getMaxScore());
            } else if(input == 4) {
                JOptionPane.showMessageDialog(null, "Scores Min: " + sc.getMinScore());
            } else if(input == 5) {
                JOptionPane.showMessageDialog(null, "Scores Average: " + sc.getScoresAverage());
            } else if(input == 6) {
                int aScore = Integer.parseInt(JOptionPane.showInputDialog("Enter a score to search"));
                JOptionPane.showMessageDialog(null, "Find Score " + aScore + sc.findScore(aScore));
            }
        } while(input < 7);
        
        JOptionPane.showMessageDialog(null, "Thank you for using the Scores App.");
    }   
}
