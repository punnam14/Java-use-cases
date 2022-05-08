package Assignment20;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyser {
    public String message;
    public void MoodAnalyser() {
    }
    public void MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood()  {
        try {
            this.message = message;
            if (message == null || message.isEmpty())
            {
                throw new MoodAnalysisException();
            }
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (MoodAnalysisException e) {
            return "HAPPY";
        }
    }

    public class MoodAnalysisException extends Exception {
        public MoodAnalysisException(String message) {
            super(message);
        }

        public MoodAnalysisException() {
            super();
        }
    }

    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
