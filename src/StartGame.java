import java.util.Scanner;

public class StartGame {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(
                """
                        ----------------------------------------------------------------
                          _  ___       _                   _____                     \s
                         | |/ / |     | |                 / ____|                    \s
                         | ' /| | __ _| |__   ___  _ __  | |  __  __ _ _ __ ___   ___\s
                         |  < | |/ _` | '_ \\ / _ \\| '__| | | |_ |/ _` | '_ ` _ \\ / _ \\
                         | . \\| | (_| | |_) | (_) | |    | |__| | (_| | | | | | |  __/
                         |_|\\_\\_|\\__,_|_.__/ \\___/|_|     \\_____|\\__,_|_| |_| |_|\\___|
                        ----------------------------------------------------------------""");
        System.out.println("To Start Game, type: Start");
        System.out.println("To Simulate Game, type: Simulation");

        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        if (n.equalsIgnoreCase("Simulation")){
            General.StartSimulation();
        } else if (n.equalsIgnoreCase("Start")) {
            StartRealGame.Start();
        }else{
            System.out.println("Incorrect input. Please, try again.");
        }


    }
}


