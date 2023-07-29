public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //challenge lesson 44
        //assign to already declared and initialized variables a new value
        score = 10_000;
        //set finalScore variable again to score value, the new score value
        finalScore = score;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
