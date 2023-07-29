public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if ( (score > 1000) && (score < 5000) ) {
            System.out.println("Your score was greater than 1000 and less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Your score was equal or higher than 5000");
        }

    }
}
