import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartGame {
    public static Integer Start() throws InterruptedException {


        // Printing a line of dashes.
        String separation = "---------------------------------------------------------------------------------------------------";
        System.out.println(separation);


        //There are several arrays.
        //AllCards is used to store 32 Objects of Cards.
        //Cards[] AllCards = new Cards[32];
        //These arrays are used to store info about each player hand.
        Cards[] Player1Hand = new Cards[8];
        Cards[] Player2Hand = new Cards[8];
        Cards[] Player3Hand = new Cards[8];
        Cards[] Player4Hand = new Cards[8];

        List<Cards> AllCards = new ArrayList<>(32);
        //This array will be collecting 1 card from each player.

        //Creating all Objects.
        //Spades
        Cards AceOfSpades = new Cards("Ace Of Spades", 0, 11, 8, false, 1, "A");
        Cards KingOfSpades = new Cards("King Of Spades", 1, 4, 7, false, 1, "B");
        Cards QueenOfSpades = new Cards("Queen Of Spades", 2, 3, 6, false, 1, "C");
        Cards JackOfSpades = new Cards("Jack Of Spades", 3, 2, 5, false, 1, "D");
        Cards TenOfSpades = new Cards("Ten Of Spades", 4, 10, 4, false, 1, "E");
        Cards NineOfSpades = new Cards("Nine Of Spades", 5, 0.0003, 3, false, 1, "F");
        Cards EightOfSpades = new Cards("Eight Of Spades", 6, 0.0002, 2, false, 1, "G");
        Cards SevenOfSpades = new Cards("Seven Of Spades", 7, 0.0001, 1, false, 1, "H");
        //Hearts
        Cards AceOfHearts = new Cards("Ace Of Hearts", 9, 11, 8, false, 2, "I");
        Cards KingOfHearts = new Cards("King Of Hearts", 10, 4, 7, false, 2, "G");
        Cards QueenOfHearts = new Cards("Queen Of Hearts", 11, 3, 6, false, 2, "K");
        Cards JackOfHearts = new Cards("Jack Of Hearts", 12, 2, 5, false, 2, "L");
        Cards TenOfHearts = new Cards("Ten Of Hearts", 13, 10, 4, false, 2, "M");
        Cards NineOfHearts = new Cards("Nine Of Hearts", 14, 0.0003, 3, false, 2, "N");
        Cards EightOfHearts = new Cards("Eight Of Hearts", 15, 0.0002, 2, false, 2, "O");
        Cards SevenOfHearts = new Cards("Seven Of Hearts", 16, 0.0001, 1, false, 2, "P");
        //Clubs
        Cards AceOfClubs = new Cards("Ace Of Clubs", 18, 11, 8, false, 3, "Q");
        Cards KingOfClubs = new Cards("King Of Clubs", 19, 4, 7, false, 3, "R");
        Cards QueenOfClubs = new Cards("Queen Of Clubs", 20, 3, 6, false, 3, "S");
        Cards JackOfClubs = new Cards("Jack Of Clubs", 21, 2, 5, false, 3, "T");
        Cards TenOfClubs = new Cards("Ten Of Clubs", 22, 10, 4, false, 3, "U");
        Cards NineOfClubs = new Cards("Nine Of Clubs", 23, 0.0003, 3, false, 3, "V");
        Cards EightOfClubs = new Cards("Eight Of Clubs", 24, 0.0002, 2, false, 3, "W");
        Cards SevenOfClubs = new Cards("Seven Of Clubs", 25, 0.0001, 1, false, 3, "X");
        //Diamonds
        Cards AceOfDiamonds = new Cards("Ace Of Diamonds", 27, 11, 8, false, 4, "Y");
        Cards KingOfDiamonds = new Cards("King Of Diamonds", 28, 4, 7, false, 4, "Z");
        Cards QueenOfDiamonds = new Cards("Queen Of Diamonds", 29, 3, 6, false, 4, "a");
        Cards JackOfDiamonds = new Cards("Jack Of Diamonds", 30, 2, 5, false, 4, "b");
        Cards TenOfDiamonds = new Cards("Ten Of Diamonds", 31, 10, 4, false, 4, "c");
        Cards NineOfDiamonds = new Cards("Nine Of Diamonds", 32, 0.0003, 3, false, 4, "d");
        Cards EightOfDiamonds = new Cards("Eight Of Diamonds", 33, 0.0002, 2, false, 4, "e");
        Cards SevenOfDiamonds = new Cards("Seven Of Diamonds", 34, 0.0001, 1, false, 4, "f");


        //This block of code is used to determine the type of "Master" cards,
        //by creating a random double number and determining the interval.
        // (0 , 2.5) or (2.5 , 5) or (5 , 7.5) or (7.5 , 10);
        String CardClass = GameLogic.getString(AceOfSpades, KingOfSpades, QueenOfSpades, JackOfSpades, TenOfSpades, NineOfSpades, EightOfSpades, SevenOfSpades, AceOfHearts, KingOfHearts, QueenOfHearts, JackOfHearts, TenOfHearts, NineOfHearts, EightOfHearts, SevenOfHearts, AceOfClubs, KingOfClubs, QueenOfClubs, JackOfClubs, TenOfClubs, NineOfClubs, EightOfClubs, SevenOfClubs, AceOfDiamonds, KingOfDiamonds, QueenOfDiamonds, JackOfDiamonds, TenOfDiamonds, NineOfDiamonds, EightOfDiamonds, SevenOfDiamonds);


        //This block of code is used to collect all cards into one array "AllCards"

        // Creating an array of all the cards in the deck.
        GameLogic.createDeck(AllCards, AceOfSpades, KingOfSpades, QueenOfSpades, JackOfSpades, TenOfSpades, NineOfSpades, EightOfSpades, SevenOfSpades, AceOfHearts, KingOfHearts, QueenOfHearts, JackOfHearts, TenOfHearts, NineOfHearts, EightOfHearts, SevenOfHearts, AceOfClubs, KingOfClubs, QueenOfClubs, JackOfClubs, TenOfClubs, NineOfClubs, EightOfClubs, SevenOfClubs, AceOfDiamonds, KingOfDiamonds, QueenOfDiamonds, JackOfDiamonds, TenOfDiamonds, NineOfDiamonds, EightOfDiamonds, SevenOfDiamonds);

        //This block of code is designed to provide each player with 8 random cards.
        //After designating one card to someone, the code will automatically delete it from "AllCards"
        //This action forbids creating several cards of one type.


        //First Player Hand Created
        GameLogic.Player1HandCreated(AllCards, Player1Hand);
        GameLogic.Player2HandCreated(AllCards, Player2Hand);
        GameLogic.Player3HandCreated(AllCards, Player3Hand);
        GameLogic.Player4HandCreated(AllCards, Player4Hand);

        GameLogic.Sort1Player(Player1Hand);
        GameLogic.Sort2Player(Player2Hand);
        GameLogic.Sort3Player(Player3Hand);
        GameLogic.Sort4Player(Player4Hand);

        System.out.println(separation);
        StringBuilder P1Cards = new StringBuilder();

        for (int j = 0; j < 8; j++) {
            P1Cards.append(Player1Hand[j].letter);
        }

        System.out.println(separation);


        //The game has started.This code will display the type of master cards for this particular set.

        GameLogic.PrintMasterCard(CardClass);
        Thread.sleep(1000);


        System.out.println("Press Enter to continue.");
        while (true) {
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            if (n != null) {
                break;
            }
        }


        //These variables will collect information about total amount of points of each team.
        //The teams are : 1 and 3 / 2 and 4.

        int pointsOf1and3 = 0;
        int pointsOf2and4 = 0;

        //This block of code is checking each player for combination "4 in a row"
        //If there is 4 in a row combinations, 3 in a row combination will not appear.
        //4 in a row combination will add 40 point to the team.
        //First player check
        System.out.println(separation);
        boolean P1has4InARow = false;
        for (int j = 2; j < 7; j++) {
            if (Math.abs(Player1Hand[j - 2].uniqueIndex - Player1Hand[j - 1].uniqueIndex) == 1 &&
                    Math.abs(Player1Hand[j - 1].uniqueIndex - Player1Hand[j].uniqueIndex) == 1 &&
                    Math.abs(Player1Hand[j].uniqueIndex - Player1Hand[j + 1].uniqueIndex) == 1
            ) {
                pointsOf1and3 += 40;
                P1has4InARow = true;
                System.out.println("Player 1 has four in a row! Starting with " + Player1Hand[j - 2]);
                break;
            }
        }
        //Second player check
        boolean P2has4InARow = false;
        for (int j = 2; j < 7; j++) {
            if (Math.abs(Player2Hand[j - 2].uniqueIndex - Player2Hand[j - 1].uniqueIndex) == 1 &&
                    Math.abs(Player2Hand[j - 1].uniqueIndex - Player2Hand[j].uniqueIndex) == 1 &&
                    Math.abs(Player2Hand[j].uniqueIndex - Player2Hand[j + 1].uniqueIndex) == 1) {
                pointsOf2and4 += 40;
                P2has4InARow = true;
                System.out.println("Player 2 has four in a row! Starting with " + Player2Hand[j - 2]);
                break;
            }
        }
        //Third player check
        boolean P3has4InARow = false;
        for (int j = 2; j < 7; j++) {
            if (Math.abs(Player3Hand[j - 2].uniqueIndex - Player3Hand[j - 1].uniqueIndex) == 1 &&
                    Math.abs(Player3Hand[j - 1].uniqueIndex - Player3Hand[j].uniqueIndex) == 1 &&
                    Math.abs(Player3Hand[j].uniqueIndex - Player3Hand[j + 1].uniqueIndex) == 1) {
                pointsOf1and3 += 40;
                P3has4InARow = true;
                System.out.println("Player 3 has four in a row! Starting with " + Player3Hand[j - 2]);
                break;
            }
        }
        //Fourth player check
        boolean P4has4InARow = false;
        for (int j = 2; j < 7; j++) {
            if (Math.abs(Player4Hand[j - 2].uniqueIndex - Player4Hand[j - 1].uniqueIndex) == 1 &&
                    Math.abs(Player4Hand[j - 1].uniqueIndex - Player4Hand[j].uniqueIndex) == 1 &&
                    Math.abs(Player4Hand[j].uniqueIndex - Player4Hand[j + 1].uniqueIndex) == 1) {
                pointsOf2and4 += 40;
                P4has4InARow = true;
                System.out.println("Player 4 has four in a row! Starting with " + Player4Hand[j - 2]);
                break;
            }
        }

        //Same checking for "3 in a row" combination.
        //If found, will add 20 points to the team.

        //First player check
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player1Hand[j].uniqueIndex - Player1Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player1Hand[j].uniqueIndex - Player1Hand[j + 1].uniqueIndex) == 1
                    && !P1has4InARow) {
                pointsOf1and3 += 20;
                System.out.println("Player 1 has three in a row! Starting with " + Player1Hand[j - 1]);
            }
        }

        //Second player check
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player2Hand[j].uniqueIndex - Player2Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player2Hand[j].uniqueIndex - Player2Hand[j + 1].uniqueIndex) == 1
                    && !P2has4InARow) {
                pointsOf2and4 += 20;
                System.out.println("Player 2 has three in a row! Starting with " + Player2Hand[j - 1]);
            }
        }

        //Third player check
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player3Hand[j].uniqueIndex - Player3Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player3Hand[j].uniqueIndex - Player3Hand[j + 1].uniqueIndex) == 1
                    && !P3has4InARow) {
                pointsOf1and3 += 20;
                System.out.println("Player 3 has three in a row! Starting with " + Player3Hand[j - 1]);
            }
        }

        //Fourth player check
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player4Hand[j].uniqueIndex - Player4Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player4Hand[j].uniqueIndex - Player4Hand[j + 1].uniqueIndex) == 1
                    && !P4has4InARow) {
                pointsOf2and4 += 20;
                System.out.println("Player 4 has three in a row! Starting with " + Player4Hand[j - 1]);
            }
        }
        Thread.sleep(1000);

        System.out.println(separation);

        //This code simulates behavior of 4 players.
        //The loop indicates the amount of sets in one game.
        //8 cards. 1 card for one set. 8 sets.
        Cards[] PlayCards = new Cards[4];
        for (int k = 0; k < 8; k++) {

            //Here is decided, who will be the first to show the card.
            //The general idea is the same as deciding the type of Master Cards.


            //This condition will appear when first player begins the game.
            //first player turn
            System.out.println("Player 1 will start");
            System.out.println("Set " + (k + 1));
            System.out.println("                 " + ".______..______..______..______..______..______..______..______." + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println(" ________________" + "                            Player3                             " + "________________ ");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|   Player2                                          Player4   |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("                 " + "                             Player1                            " + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 0) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 1) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 2) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 3) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 4) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 5) + "                ");
            System.out.println("------------------   1       2       3       4       5       6       7       8    -----------------");

            System.out.println("Enter Your Card (from 1 to 8)");

            GameLogic.Game(Player1Hand, Player2Hand, Player3Hand, Player4Hand, PlayCards);


            P1Cards = new StringBuilder(P1Cards.toString().replace(PlayCards[0].letter, " "));
            //This condition will appear when second player begins the game.

            // Printing the cards of the players in a nice format.
            System.out.println("Player 1 will start");
            System.out.println("Set " + (k + 1));
            System.out.println("                 " + ".______..______..______..______..______..______..______..______." + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println("                 " + "|______||______||______||______||______||______||______||______|" + "                 ");
            System.out.println(" ________________" + "                            Player3                             " + "________________ ");
            assert PlayCards[2] != null;
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[2].letter, 0) + "                           |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[2].letter, 1) + "                           |" + "| | | | | | | | |");
            System.out.println(" ________________" + "|                           " + ASCII.getPlayerCardsString(PlayCards[2].letter, 2) + "                           |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[2].letter, 3) + "                           |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[2].letter, 4) + "                           |" + "| | | | | | | | |");
            System.out.println(" ________________" + "                            " + ASCII.getPlayerCardsString(PlayCards[2].letter, 5) + "                            " + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|   Player2                                          Player4   |" + "________________|");
            assert PlayCards[1] != null;
            assert PlayCards[3] != null;
            System.out.println("| | | | | | | | |" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 0) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 0) + "   |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 1) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 1) + "   |" + "| | | | | | | | |");
            System.out.println("|________________" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 2) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 2) + "   |" + "________________|");
            System.out.println("| | | | | | | | |" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 3) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 3) + "   |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 4) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 4) + "   |" + "| | | | | | | | |");
            System.out.println("|________________" + "|   " + ASCII.getPlayerCardsString(PlayCards[1].letter, 5) + "                                        " + ASCII.getPlayerCardsString(PlayCards[3].letter, 5) + "   |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                                                              |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                                                              |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[0].letter, 0) + "                           |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                           " + ASCII.getPlayerCardsString(PlayCards[0].letter, 1) + "                           |" + "________________|");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[0].letter, 2) + "                           |" + "| | | | | | | | |");
            System.out.println("| | | | | | | | |" + "|                           " + ASCII.getPlayerCardsString(PlayCards[0].letter, 3) + "                           |" + "| | | | | | | | |");
            System.out.println("|________________" + "|                           " + ASCII.getPlayerCardsString(PlayCards[0].letter, 4) + "                           |" + "________________|");
            System.out.println("                 " + "                            " + ASCII.getPlayerCardsString(PlayCards[0].letter, 5) + "                            " + "                 ");
            System.out.println("                 " + "                            Player1                           " + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 0) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 1) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 2) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 3) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 4) + "                ");
            System.out.println("                 " + ASCII.getPlayerCardsString(P1Cards.toString(), 5) + "                ");
            System.out.println("------------------   1       2       3       4       5       6       7       8    -----------------");


            pointsOf1and3 = GameLogic.getPointsOf1and3(pointsOf1and3, PlayCards, k);

            pointsOf2and4 = GameLogic.getPointsOf2and4(pointsOf2and4, PlayCards, k);

            pointsOf1and3 = GameLogic.getOf1and3(pointsOf1and3, PlayCards, k);

            pointsOf2and4 = GameLogic.getOf2and4(pointsOf2and4, PlayCards, k);


            Thread.sleep(1000);

            for (int m = 0; m < 4; m++) {
                PlayCards[m] = null;
            }


            System.out.println(separation);
            System.out.println("Press Enter to continue.");
            while (true) {
                Scanner in = new Scanner(System.in);
                String n = in.nextLine();
                if (n != null) {
                    break;
                }
            }
        }
        // Printing out the total points of each player.
        System.out.println("Game has finished!");
        System.out.println(separation);
        System.out.println("Total amount of points of 1 and 3 Player is " + pointsOf1and3);
        System.out.println("Total amount of points of 2 and 4 Player is " + pointsOf2and4);
        System.out.println(separation);


        GameLogic.whoIsWon(separation, pointsOf1and3, pointsOf2and4);

        return pointsOf1and3;
    }


}



