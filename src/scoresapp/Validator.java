package scoresapp;

import javax.swing.JOptionPane;

/**
 *
 * @author bryanshintani
 */
public class Validator {
    
    public static int getValidScore(String aScore) {
        
        while(isValidScore(aScore) == false) {
            aScore = JOptionPane.showInputDialog(null, "Please re-enter score\n\n" + aScore + " is an invalid score");
        }
        return Integer.parseInt(aScore);
    }
    
    public static boolean isValidScore(String aScore) {
        //business rules for valid scores
        
        boolean result = true;
        
        try {
            
            int score = Integer.parseInt(aScore);
            
            if(score < 0 || score > 10) {
                result = false;
            }
            
        } catch(Exception ex) {
            
            result = false;
        }
        
        return result;
    }
}
