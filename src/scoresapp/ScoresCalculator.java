package scoresapp;
/**
 *
 * @author bryanshintani
 */
public class ScoresCalculator {
    
    //properties
    private int[] scores;
    
    //Methods
    
    //Constructor
    public ScoresCalculator(int[] scoresList) {
        
        scores = scoresList;
    }
    
    public int getScoresCount() {
        return scores.length;
    }
    
    public int getScoresTotal() {
        //declare variable to hold total
        int total = 0;
        
        //loop through array and add each score to total
        for(int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total;
    }
    
    public double getScoresAverage() {
        
        double average = (double)getScoresTotal() / getScoresCount();
        
        return average;
    }
    
    public int getMinScore() {
        
        int minScore = scores[0];
        
        for(int i = 0; i < scores.length; i++) {
            if(minScore > scores[i]) {
                minScore = scores[i];
            }
        }
        return minScore;
    }
    
    public int getMaxScore() {
        
        int maxScore = scores[0];
        
        for(int i = 0; i < scores.length; i++) {
            if(maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }
    
    public String findScore(int aScore) {
        
        String result = null;
        
        for(int i = 0; i < scores.length; i++) {
            if(aScore == scores[i]) {
                
                result = "Score " + aScore + " was found at index " + i;
                
            }
        }
        
        if(result == null) {
            result = "No match was found for " + aScore;
        }
        
        return result;
    }
    
    public String listScores() {
        String summary = "Listing of Scores\n\n";
        
        for(int i = 0; i < scores.length; i++) {
            
            summary += scores[i] + "\n";
        }
        
        return summary;
    }
}
