
import java.util.HashMap;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        // It prints the game logo.
        GameLogic.printGameLogo();
        // Creating a new HashMap object called score.
        HashMap<String, Integer> score = new HashMap<>();
        // Calling the gameProcess method from the GameLogic class and passing the score HashMap object as a parameter.
        GameLogic.gameProcess(score);
    }


}


