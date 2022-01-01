package Chapter2.src;

public class Main {
    public static void main(String[] args) {
        // all examples of STATEMENTS
        /*
         * int myVariable = 50;
         * myVariable++;
         * myVariable--;
         * System.out.println("This is a test");
         * 
         * if (myVariable < 50) {
         * System.out.println("Nice number!");
         * } else {
         * System.out.println("Oh god....");
         * }
         */

         /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        */

        displayHighScorePosition("Michael", calculateHighScorePosition(1500));
        displayHighScorePosition("Dan", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(400));
        displayHighScorePosition("Paolo", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerNameString, int positionOnLeaderboard) {
        System.out.println(playerNameString + " managed to get into position " + positionOnLeaderboard
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
        return 4;
    }
}
