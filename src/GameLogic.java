import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GameLogic {




    public static void gameProcess(HashMap<String, Integer> score) throws InterruptedException {
        while (true) {
            System.out.println("Please, enter you" +
                    "r name: (Your Score will Be saved)");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();

            System.out.println("To Start Game, type: Start");
            System.out.println("To Simulate Game, type: Simulation");
            System.out.println("To show leaderboard, type: Leaderboards");
            System.out.println("To Exit Game, type: Exit");


            String n = in.nextLine();
            if (n.equalsIgnoreCase("Simulation")) {
                Simulation.StartSimulation();
            } else if (n.equalsIgnoreCase("Start")) {
                int thisScore = StartGame.Start();
                score.put(name, thisScore);
            } else if (n.equalsIgnoreCase("exit")) {
                break;
            } else if (n.equalsIgnoreCase("leaderboards")) {
                GameLogic.printLeaders(score);
            } else {
                System.out.println("Incorrect input. Please, try again.");
            }
        }
    }

    public static void printGameLogo() {
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
    }

    public static void Player4HandCreated(List<Cards> AllCards, Cards[] Player4Hand) {
        int i;
        //Fourth Player Hand Created
        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards.get(rnd) != null) {
                Player4Hand[i] = AllCards.get(rnd);
                AllCards.set(rnd, null);
                i++;
            }
        }
    }

    public static void Player3HandCreated(List<Cards> AllCards, Cards[] Player3Hand) {
        Player4HandCreated(AllCards, Player3Hand);
    }

    public static void Player2HandCreated(List<Cards> AllCards, Cards[] Player2Hand) {
        Player4HandCreated(AllCards, Player2Hand);
    }

    public static void Player1HandCreated(List<Cards> AllCards, Cards[] Player1Hand) {
        int i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards.get(rnd) != null) {
                Player1Hand[i] = AllCards.get(rnd);
                AllCards.set(rnd, null);
                i++;
            }
        }
    }

    public static void Sort4Player(Cards[] Player4Hand) {
        Cards temp;
        boolean sorted;
        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < Player4Hand.length - 1; j++) {
                if (Player4Hand[j].uniqueIndex > Player4Hand[j + 1].uniqueIndex) {
                    temp = Player4Hand[j];
                    Player4Hand[j] = Player4Hand[j + 1];
                    Player4Hand[j + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void Sort3Player(Cards[] Player3Hand) {
        boolean sorted;
        Cards temp;
        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < Player3Hand.length - 1; j++) {
                if (Player3Hand[j].uniqueIndex > Player3Hand[j + 1].uniqueIndex) {
                    temp = Player3Hand[j];
                    Player3Hand[j] = Player3Hand[j + 1];
                    Player3Hand[j + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void Sort2Player(Cards[] Player2Hand) {
        Cards temp;
        boolean sorted;
        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < Player2Hand.length - 1; j++) {
                if (Player2Hand[j].uniqueIndex > Player2Hand[j + 1].uniqueIndex) {
                    temp = Player2Hand[j];
                    Player2Hand[j] = Player2Hand[j + 1];
                    Player2Hand[j + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void Sort1Player(Cards[] Player1Hand) {
        boolean sorted = false;
        Cards temp;
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < Player1Hand.length - 1; j++) {
                if (Player1Hand[j].uniqueIndex > Player1Hand[j + 1].uniqueIndex) {
                    temp = Player1Hand[j];
                    Player1Hand[j] = Player1Hand[j + 1];
                    Player1Hand[j + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void PrintMasterCard(String CardClass) {
        System.out.println("Game Started! The Master Cards are ");
        // The above code is a switch statement that prints out a card based on the value of the variable CardClass.
        switch (CardClass) {
            case "Diamonds" -> {
                System.out.println();
                System.out.println(" ___________________ ");
                System.out.println("|  _______________  |");
                System.out.println("|  ____DIAMONDS___  |");
                System.out.println("|  _______________  |");
                System.out.println("|         ^         |");
                System.out.println("|        / \\        |");
                System.out.println("|       /   \\       |");
                System.out.println("|       \\   /       |");
                System.out.println("|        \\ /        |");
                System.out.println("|         v         |");
                System.out.println("|  _______________  |");
                System.out.println("|  ____DIAMONDS___  |");
                System.out.println("|  _______________  |");
                System.out.println("|___________________|");
                System.out.println();
            }
            case "Hearts" -> {
                System.out.println();
                System.out.println(" ___________________ ");
                System.out.println("|  _______________  |");
                System.out.println("|  _____HEARTS____  |");
                System.out.println("|  _______________  |");
                System.out.println("|      __   __      |");
                System.out.println("|     (  \\ /  )     |");
                System.out.println("|      \\  v  /      |");
                System.out.println("|       \\   /       |");
                System.out.println("|        \\ /        |");
                System.out.println("|         v         |");
                System.out.println("|  _______________  |");
                System.out.println("|  _____HEARTS____  |");
                System.out.println("|  _______________  |");
                System.out.println("|___________________|");
                System.out.println();
            }
            case "Clubs" -> {
                System.out.println();
                System.out.println(" ___________________ ");
                System.out.println("|  _______________  |");
                System.out.println("|  _____CLUBS_____  |");
                System.out.println("|  _______________  |");
                System.out.println("|         _         |");
                System.out.println("|      __( )__      |");
                System.out.println("|     (__   __)     |");
                System.out.println("|        / \\        |");
                System.out.println("|       /   \\       |");
                System.out.println("|      _______      |");
                System.out.println("|  _______________  |");
                System.out.println("|  _____CLUBS_____  |");
                System.out.println("|  _______________  |");
                System.out.println("|___________________|");
                System.out.println();
            }
            default -> {
                System.out.println();
                System.out.println(" ___________________ ");
                System.out.println("|  _______________  |");
                System.out.println("|  _____SPADES____  |");
                System.out.println("|  _______________  |");
                System.out.println("|                   |");
                System.out.println("|         ^         |");
                System.out.println("|        / \\        |");
                System.out.println("|       /   \\       |");
                System.out.println("|      (_   _)      |");
                System.out.println("|       _|_|_       |");
                System.out.println("|  _______________  |");
                System.out.println("|  _____SPADES____  |");
                System.out.println("|  _______________  |");
                System.out.println("|___________________|");
                System.out.println();
            }
        }
    }

    public static void Game(Cards[] Player1Hand, Cards[] Player2Hand, Cards[] Player3Hand, Cards[] Player4Hand, Cards[] PlayCards) {
        Player1Turn(Player1Hand, PlayCards);
        Player2Turn(Player2Hand, PlayCards);
        Player3Turn(Player3Hand, PlayCards);
        Player4Turn(Player4Hand, PlayCards);
    }

    public static void Player1Turn(Cards[] Player1Hand, Cards[] PlayCards) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (Player1Hand[n - 1] != null) {
                PlayCards[0] = Player1Hand[n - 1];
                Player1Hand[n - 1] = null;
                break;
            } else {
                System.out.println("You have already used this card. Please, choose another card.");
            }
        }
    }

    public static void Player2Turn(Cards[] Player2Hand, Cards[] PlayCards) {
        // Checking if the card in the player's hand is the same as the card that was played. If it is, it will play
        // that card.
        for (int j = 0; j < 8; j++) {
            if (Player2Hand[j] != null && Player2Hand[j].type == PlayCards[0].type) {
                PlayCards[1] = Player2Hand[j];
                Player2Hand[j] = null;
                break;
            }
        }
        // Checking if the second card in the playcards array is null. If it is, it will loop through the player 2 hand
        // and check if the card is a master card. If it is, it will set the second card in the playcards array to the
        // master card and set the master card in the player 2 hand to null.
        if (PlayCards[1] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player2Hand[j] != null && Player2Hand[j].isMaster) {
                    PlayCards[1] = Player2Hand[j];
                    Player2Hand[j] = null;
                    break;
                }
            }
        }
        // Checking if the second card in the playcards array is null. If it is, it will loop through the player 2 hand
        // and find the first card that is not null and set it to the second card in the playcards array.
        if (PlayCards[1] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player2Hand[j] != null) {
                    PlayCards[1] = Player2Hand[j];
                    Player2Hand[j] = null;
                    break;
                }
            }
        }
    }

    public static void Player3Turn(Cards[] Player3Hand, Cards[] PlayCards) {
        // Checking if the player has a card of the same type as the first card played. If they do, they play that card. If
        // they don't, they check if they have a master card. If they do, they play that card. If they don't, they play any
        // card.
        for (int j = 0; j < 8; j++) {
            if (Player3Hand[j] != null && Player3Hand[j].type == PlayCards[0].type) {
                PlayCards[2] = Player3Hand[j];
                Player3Hand[j] = null;
                break;
            }
        }
        if (PlayCards[2] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player3Hand[j] != null && Player3Hand[j].isMaster) {
                    PlayCards[2] = Player3Hand[j];
                    Player3Hand[j] = null;
                    break;
                }
            }
        }
        if (PlayCards[2] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player3Hand[j] != null) {
                    PlayCards[2] = Player3Hand[j];
                    Player3Hand[j] = null;
                    break;
                }
            }
        }
    }

    public static void Player4Turn(Cards[] Player4Hand, Cards[] PlayCards) {
        for (int j = 0; j < 8; j++) {
            if (Player4Hand[j] != null && Player4Hand[j].type == PlayCards[0].type) {
                PlayCards[3] = Player4Hand[j];
                Player4Hand[j] = null;
                break;
            }
        }
        if (PlayCards[3] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player4Hand[j] != null && Player4Hand[j].isMaster) {
                    PlayCards[3] = Player4Hand[j];
                    Player4Hand[j] = null;
                    break;
                }
            }
        }
        if (PlayCards[3] == null) {
            for (int j = 0; j < 8; j++) {
                if (Player4Hand[j] != null) {
                    PlayCards[3] = Player4Hand[j];
                    Player4Hand[j] = null;
                    break;
                }
            }
        }
    }

    public static void whoIsWon(String separation, int pointsOf1and3, int pointsOf2and4) {
        if (pointsOf1and3 > pointsOf2and4) {
            System.out.println("Player 1 and Player 3 won!");
        } else {
            System.out.println("Player 2 and Player 4 won!");
        }
        System.out.println(separation);
    }

    public static int getOf2and4(int pointsOf2and4, Cards[] PlayCards, int k) {
        if (PlayCards[3].value > PlayCards[0].value &&
                PlayCards[3].value > PlayCards[2].value &&
                PlayCards[3].value > PlayCards[1].value) {
            if (k == 7) {
                pointsOf2and4 += 10;
            }
            System.out.println("Player 4 won this round with " + PlayCards[3]);
            System.out.println("Total amount of points is " + (int) (PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value));
            pointsOf2and4 += PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value;
        }
        return pointsOf2and4;
    }

    public static int getOf1and3(int pointsOf1and3, Cards[] PlayCards, int k) {
        if (PlayCards[2].value > PlayCards[0].value &&
                PlayCards[2].value > PlayCards[1].value &&
                PlayCards[2].value > PlayCards[3].value) {
            if (k == 7) {
                pointsOf1and3 += 10;
            }
            System.out.println("Player 3 won this round with " + PlayCards[2]);
            System.out.println("Total amount of points is " + (int) (PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value));
            pointsOf1and3 += PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value;
        }
        return pointsOf1and3;
    }

    public static int getPointsOf2and4(int pointsOf2and4, Cards[] PlayCards, int k) {
        if (PlayCards[1].value > PlayCards[0].value &&
                PlayCards[1].value > PlayCards[2].value &&
                PlayCards[1].value > PlayCards[3].value) {
            if (k == 7) {
                pointsOf2and4 += 10;
            }
            System.out.println("Player 2 won this round with " + PlayCards[1]);
            System.out.println("Total amount of points is " + (int) (PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value));
            pointsOf2and4 += PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value;
        }
        return pointsOf2and4;
    }

    public static int getPointsOf1and3(int pointsOf1and3, Cards[] PlayCards, int k) {
        if (PlayCards[0].value > PlayCards[1].value &&
                PlayCards[0].value > PlayCards[2].value &&
                PlayCards[0].value > PlayCards[3].value) {
            if (k == 7) {
                pointsOf1and3 += 10;
            }
            System.out.println("Player 1 won this round with " + PlayCards[0]);
            System.out.println("Total amount of points is " + (int) (PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value));
            pointsOf1and3 += PlayCards[0].value + PlayCards[1].value + PlayCards[2].value + PlayCards[3].value;
        }
        return pointsOf1and3;
    }

    public static String getString(Cards AceOfSpades, Cards KingOfSpades, Cards QueenOfSpades, Cards JackOfSpades, Cards TenOfSpades, Cards NineOfSpades, Cards EightOfSpades, Cards SevenOfSpades, Cards AceOfHearts, Cards KingOfHearts, Cards QueenOfHearts, Cards JackOfHearts, Cards TenOfHearts, Cards NineOfHearts, Cards EightOfHearts, Cards SevenOfHearts, Cards AceOfClubs, Cards KingOfClubs, Cards QueenOfClubs, Cards JackOfClubs, Cards TenOfClubs, Cards NineOfClubs, Cards EightOfClubs, Cards SevenOfClubs, Cards AceOfDiamonds, Cards KingOfDiamonds, Cards QueenOfDiamonds, Cards JackOfDiamonds, Cards TenOfDiamonds, Cards NineOfDiamonds, Cards EightOfDiamonds, Cards SevenOfDiamonds) {
        double A = Math.random() * 10;
        String CardClass;


        if (A <= 2.5) {
            CardClass = SpadesMaster(AceOfSpades, KingOfSpades, QueenOfSpades, JackOfSpades, TenOfSpades, NineOfSpades, EightOfSpades, SevenOfSpades);
        } else if (A > 2.5 && A <= 5) {
            CardClass = HeartsMaster(AceOfHearts, KingOfHearts, QueenOfHearts, JackOfHearts, TenOfHearts, NineOfHearts, EightOfHearts, SevenOfHearts);
        } else if (A > 5 && A <= 7.5) {
            CardClass = ClubsMaster(AceOfClubs, KingOfClubs, QueenOfClubs, JackOfClubs, TenOfClubs, NineOfClubs, EightOfClubs, SevenOfClubs);
        } else {
            CardClass = DiamondsMaster(AceOfDiamonds, KingOfDiamonds, QueenOfDiamonds, JackOfDiamonds, TenOfDiamonds, NineOfDiamonds, EightOfDiamonds, SevenOfDiamonds);
        }
        return CardClass;
    }

    public static String SpadesMaster(Cards AceOfSpades, Cards KingOfSpades, Cards QueenOfSpades, Cards JackOfSpades, Cards TenOfSpades, Cards NineOfSpades, Cards EightOfSpades, Cards SevenOfSpades) {
        String CardClass;
        CardClass = "Spades";

        AceOfSpades.setValue(11.0008);
        KingOfSpades.setValue(4.0007);
        QueenOfSpades.setValue(3.0006);
        JackOfSpades.setValue(20.0005);
        TenOfSpades.setValue(10.0004);
        NineOfSpades.setValue(14.0003);
        EightOfSpades.setValue(0.0002);
        SevenOfSpades.setValue(0.0001);
        AceOfSpades.setMaster(true);
        KingOfSpades.setMaster(true);
        QueenOfSpades.setMaster(true);
        JackOfSpades.setMaster(true);
        TenOfSpades.setMaster(true);
        NineOfSpades.setMaster(true);
        EightOfSpades.setMaster(true);
        SevenOfSpades.setMaster(true);
        return CardClass;
    }

    public static String HeartsMaster(Cards AceOfHearts, Cards KingOfHearts, Cards QueenOfHearts, Cards JackOfHearts, Cards TenOfHearts, Cards NineOfHearts, Cards EightOfHearts, Cards SevenOfHearts) {
        String CardClass;
        CardClass = "Hearts";
        AceOfHearts.setValue(11.0008);
        KingOfHearts.setValue(4.0007);
        QueenOfHearts.setValue(3.0006);
        JackOfHearts.setValue(20.0005);
        TenOfHearts.setValue(10.0004);
        NineOfHearts.setValue(14.0003);
        EightOfHearts.setValue(0.0002);
        SevenOfHearts.setValue(0.0001);
        AceOfHearts.setMaster(true);
        KingOfHearts.setMaster(true);
        QueenOfHearts.setMaster(true);
        JackOfHearts.setMaster(true);
        TenOfHearts.setMaster(true);
        NineOfHearts.setMaster(true);
        EightOfHearts.setMaster(true);
        SevenOfHearts.setMaster(true);
        return CardClass;
    }

    public static String ClubsMaster(Cards AceOfClubs, Cards KingOfClubs, Cards QueenOfClubs, Cards JackOfClubs, Cards TenOfClubs, Cards NineOfClubs, Cards EightOfClubs, Cards SevenOfClubs) {
        String CardClass;
        CardClass = "Clubs";
        AceOfClubs.setValue(11.0008);
        KingOfClubs.setValue(4.0007);
        QueenOfClubs.setValue(3.0006);
        JackOfClubs.setValue(20.0005);
        TenOfClubs.setValue(10.0004);
        NineOfClubs.setValue(14.0003);
        EightOfClubs.setValue(0.0002);
        SevenOfClubs.setValue(0.0001);
        AceOfClubs.setMaster(true);
        KingOfClubs.setMaster(true);
        QueenOfClubs.setMaster(true);
        JackOfClubs.setMaster(true);
        TenOfClubs.setMaster(true);
        NineOfClubs.setMaster(true);
        EightOfClubs.setMaster(true);
        SevenOfClubs.setMaster(true);
        return CardClass;
    }

    public static void createDeck(List<Cards> AllCards, Cards AceOfSpades, Cards KingOfSpades, Cards QueenOfSpades, Cards JackOfSpades, Cards TenOfSpades, Cards NineOfSpades, Cards EightOfSpades, Cards SevenOfSpades, Cards AceOfHearts, Cards KingOfHearts, Cards QueenOfHearts, Cards JackOfHearts, Cards TenOfHearts, Cards NineOfHearts, Cards EightOfHearts, Cards SevenOfHearts, Cards AceOfClubs, Cards KingOfClubs, Cards QueenOfClubs, Cards JackOfClubs, Cards TenOfClubs, Cards NineOfClubs, Cards EightOfClubs, Cards SevenOfClubs, Cards AceOfDiamonds, Cards KingOfDiamonds, Cards QueenOfDiamonds, Cards JackOfDiamonds, Cards TenOfDiamonds, Cards NineOfDiamonds, Cards EightOfDiamonds, Cards SevenOfDiamonds) {
        putCard(AllCards, AceOfSpades, KingOfSpades, QueenOfSpades, JackOfSpades, TenOfSpades, NineOfSpades, EightOfSpades, SevenOfSpades, AceOfHearts, KingOfHearts, QueenOfHearts, JackOfHearts, TenOfHearts, NineOfHearts, EightOfHearts, SevenOfHearts, AceOfClubs, KingOfClubs, QueenOfClubs, JackOfClubs, TenOfClubs, NineOfClubs, EightOfClubs, SevenOfClubs, AceOfDiamonds, KingOfDiamonds, QueenOfDiamonds, JackOfDiamonds, TenOfDiamonds, NineOfDiamonds, EightOfDiamonds, SevenOfDiamonds);
    }

    static void putCard(List<Cards> AllCards, Cards AceOfSpades, Cards KingOfSpades, Cards QueenOfSpades, Cards JackOfSpades, Cards TenOfSpades, Cards NineOfSpades, Cards EightOfSpades, Cards SevenOfSpades, Cards AceOfHearts, Cards KingOfHearts, Cards QueenOfHearts, Cards JackOfHearts, Cards TenOfHearts, Cards NineOfHearts, Cards EightOfHearts, Cards SevenOfHearts, Cards AceOfClubs, Cards KingOfClubs, Cards QueenOfClubs, Cards JackOfClubs, Cards TenOfClubs, Cards NineOfClubs, Cards EightOfClubs, Cards SevenOfClubs, Cards AceOfDiamonds, Cards KingOfDiamonds, Cards QueenOfDiamonds, Cards JackOfDiamonds, Cards TenOfDiamonds, Cards NineOfDiamonds, Cards EightOfDiamonds, Cards SevenOfDiamonds) {
        AllCards.add(AceOfSpades);
        AllCards.add(KingOfSpades);
        AllCards.add(QueenOfSpades);
        AllCards.add(JackOfSpades);
        AllCards.add(TenOfSpades);
        AllCards.add(NineOfSpades);
        AllCards.add(EightOfSpades);
        AllCards.add(SevenOfSpades);

        AllCards.add(AceOfHearts);
        AllCards.add(KingOfHearts);
        AllCards.add(QueenOfHearts);
        AllCards.add(JackOfHearts);
        AllCards.add(TenOfHearts);
        AllCards.add(NineOfHearts);
        AllCards.add(EightOfHearts);
        AllCards.add(SevenOfHearts);

        AllCards.add(AceOfClubs);
        AllCards.add(KingOfClubs);
        AllCards.add(QueenOfClubs);
        AllCards.add(JackOfClubs);
        AllCards.add(TenOfClubs);
        AllCards.add(NineOfClubs);
        AllCards.add(EightOfClubs);
        AllCards.add(SevenOfClubs);

        AllCards.add(AceOfDiamonds);
        AllCards.add(KingOfDiamonds);
        AllCards.add(QueenOfDiamonds);
        AllCards.add(JackOfDiamonds);
        AllCards.add(TenOfDiamonds);
        AllCards.add(NineOfDiamonds);
        AllCards.add(EightOfDiamonds);
        AllCards.add(SevenOfDiamonds);
    }

    public static String DiamondsMaster(Cards AceOfDiamonds, Cards KingOfDiamonds, Cards QueenOfDiamonds, Cards JackOfDiamonds, Cards TenOfDiamonds, Cards NineOfDiamonds, Cards EightOfDiamonds, Cards SevenOfDiamonds) {
        // The above code is setting the value of the cards and setting them to true.
        // Setting the value of the cards and setting them to true.
        String CardClass;
        CardClass = "Diamonds";
        AceOfDiamonds.setValue(11.0008);
        KingOfDiamonds.setValue(4.0007);
        QueenOfDiamonds.setValue(3.0006);
        JackOfDiamonds.setValue(20.0005);
        TenOfDiamonds.setValue(10.0004);
        NineOfDiamonds.setValue(14.0003);
        EightOfDiamonds.setValue(0.0002);
        SevenOfDiamonds.setValue(0.0001);
        AceOfDiamonds.setMaster(true);
        KingOfDiamonds.setMaster(true);
        QueenOfDiamonds.setMaster(true);
        JackOfDiamonds.setMaster(true);
        TenOfDiamonds.setMaster(true);
        NineOfDiamonds.setMaster(true);
        EightOfDiamonds.setMaster(true);
        SevenOfDiamonds.setMaster(true);
        return CardClass;
    }

    public static void printLeaders(HashMap<String, Integer> score) {

        System.out.println(score);

    }
}
