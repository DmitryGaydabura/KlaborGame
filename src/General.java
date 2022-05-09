import java.util.Objects;

public class General {
    public static void Start() throws InterruptedException {
        String separation = "--------------------------------------------------------------------------";
        //There are several arrays.
        //AllCards is used to store 32 Objects of Cards.
        Cards[] AllCards = new Cards[32];
        //These arrays are used to store info about each player hand.
        Cards[] Player1Hand = new Cards[8];
        Cards[] Player2Hand = new Cards[8];
        Cards[] Player3Hand = new Cards[8];
        Cards[] Player4Hand = new Cards[8];
        //This array will be collecting 1 card from each player.
        Cards[] PlayCards = new Cards[4];

        //Creating all Objects.
        //Spades
        Cards AceOfSpades = new Cards("Ace Of Spades", 0, 11, 8, false, 1);
        Cards KingOfSpades = new Cards("King Of Spades", 1, 4, 7, false, 1);
        Cards QueenOfSpades = new Cards("Queen Of Spades", 2, 3, 6, false, 1);
        Cards JackOfSpades = new Cards("Jack Of Spades", 3, 2, 5, false, 1);
        Cards TenOfSpades = new Cards("Ten Of Spades", 4, 10, 4, false, 1);
        Cards NineOfSpades = new Cards("Nine Of Spades", 5, 0.0003, 3, false, 1);
        Cards EightOfSpades = new Cards("Eight Of Spades", 6, 0.0002, 2, false, 1);
        Cards SevenOfSpades = new Cards("Seven Of Spades", 7, 0.0001, 1, false, 1);
        //Hearts
        Cards AceOfHearts = new Cards("Ace Of Hearts", 9, 11, 8, false, 2);
        Cards KingOfHearts = new Cards("King Of Hearts", 10, 4, 7, false, 2);
        Cards QueenOfHearts = new Cards("Queen Of Hearts", 11, 3, 6, false, 2);
        Cards JackOfHearts = new Cards("Jack Of Hearts", 12, 2, 5, false, 2);
        Cards TenOfHearts = new Cards("Ten Of Hearts", 13, 10, 4, false, 2);
        Cards NineOfHearts = new Cards("Nine Of Hearts", 14, 0.0003, 3, false, 2);
        Cards EightOfHearts = new Cards("Eight Of Hearts", 15, 0.0002, 2, false, 2);
        Cards SevenOfHearts = new Cards("Seven Of Hearts", 16, 0.0001, 1, false, 2);
        //Clubs
        Cards AceOfClubs = new Cards("Ace Of Clubs", 18, 11, 8, false, 3);
        Cards KingOfClubs = new Cards("King Of Clubs", 19, 4, 7, false, 3);
        Cards QueenOfClubs = new Cards("Queen Of Clubs", 20, 3, 6, false, 3);
        Cards JackOfClubs = new Cards("Jack Of Clubs", 21, 2, 5, false, 3);
        Cards TenOfClubs = new Cards("Ten Of Clubs", 22, 10, 4, false, 3);
        Cards NineOfClubs = new Cards("Nine Of Clubs", 23, 0.0003, 3, false, 3);
        Cards EightOfClubs = new Cards("Eight Of Clubs", 24, 0.0002, 2, false, 3);
        Cards SevenOfClubs = new Cards("Seven Of Clubs", 25, 0.0001, 1, false, 3);
        //Diamonds
        Cards AceOfDiamonds = new Cards("Ace Of Diamonds", 27, 11, 8, false, 4);
        Cards KingOfDiamonds = new Cards("King Of Diamonds", 28, 4, 7, false, 4);
        Cards QueenOfDiamonds = new Cards("Queen Of Diamonds", 29, 3, 6, false, 4);
        Cards JackOfDiamonds = new Cards("Jack Of Diamonds", 30, 2, 5, false, 4);
        Cards TenOfDiamonds = new Cards("Ten Of Diamonds", 31, 10, 4, false, 4);
        Cards NineOfDiamonds = new Cards("Nine Of Diamonds", 32, 0.0003, 3, false, 4);
        Cards EightOfDiamonds = new Cards("Eight Of Diamonds", 33, 0.0002, 2, false, 4);
        Cards SevenOfDiamonds = new Cards("Seven Of Diamonds", 34, 0.0001, 1, false, 4);



        //This block of code is used to determine the type of "Master" cards,
        //by creating a random double number and determining the interval.
        // (0 , 2.5) or (2.5 , 5) or (5 , 7.5) or (7.5 , 10);
        double A = Math.random() * 10;
        String CardClass;


        if (A <= 2.5) {
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


        } else if (A > 2.5 && A <= 5) {
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


        } else if (A > 5 && A <= 7.5) {
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


        } else {
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


        }

        //This block of code will allow us to inspect the value of each card after choosing the type of "Master" Cards.

//        System.out.println(AceOfSpades.toString());
//        System.out.println(KingOfSpades.toString());
//        System.out.println(QueenOfSpades.toString());
//        System.out.println(JackOfSpades.toString());
//        System.out.println(TenOfSpades.toString());
//        System.out.println(NineOfSpades.toString());
//        System.out.println(EightOfSpades.toString());
//        System.out.println(SevenOfSpades.toString());
//
//        System.out.println(AceOfHearts.toString());
//        System.out.println(KingOfHearts.toString());
//        System.out.println(QueenOfHearts.toString());
//        System.out.println(JackOfHearts.toString());
//        System.out.println(TenOfHearts.toString());
//        System.out.println(NineOfHearts.toString());
//        System.out.println(EightOfHearts.toString());
//        System.out.println(SevenOfHearts.toString());
//
//        System.out.println(AceOfClubs.toString());
//        System.out.println(KingOfClubs.toString());
//        System.out.println(QueenOfClubs.toString());
//        System.out.println(JackOfClubs.toString());
//        System.out.println(TenOfClubs.toString());
//        System.out.println(NineOfClubs.toString());
//        System.out.println(EightOfClubs.toString());
//        System.out.println(SevenOfClubs.toString());
//
//        System.out.println(AceOfDiamonds.toString());
//        System.out.println(KingOfDiamonds.toString());
//        System.out.println(QueenOfDiamonds.toString());
//        System.out.println(JackOfDiamonds.toString());
//        System.out.println(TenOfDiamonds.toString());
//        System.out.println(NineOfDiamonds.toString());
//        System.out.println(EightOfDiamonds.toString());
//        System.out.println(SevenOfDiamonds.toString());

        //This block of code is used to collect all cards into one array "AllCards"

        AllCards[0] = AceOfSpades;
        AllCards[1] = KingOfSpades;
        AllCards[2] = QueenOfSpades;
        AllCards[3] = JackOfSpades;
        AllCards[4] = TenOfSpades;
        AllCards[5] = NineOfSpades;
        AllCards[6] = EightOfSpades;
        AllCards[7] = SevenOfSpades;

        AllCards[8] = AceOfHearts;
        AllCards[9] = KingOfHearts;
        AllCards[10] = QueenOfHearts;
        AllCards[11] = JackOfHearts;
        AllCards[12] = TenOfHearts;
        AllCards[13] = NineOfHearts;
        AllCards[14] = EightOfHearts;
        AllCards[15] = SevenOfHearts;

        AllCards[16] = AceOfClubs;
        AllCards[17] = KingOfClubs;
        AllCards[18] = QueenOfClubs;
        AllCards[19] = JackOfClubs;
        AllCards[20] = TenOfClubs;
        AllCards[21] = NineOfClubs;
        AllCards[22] = EightOfClubs;
        AllCards[23] = SevenOfClubs;

        AllCards[24] = AceOfDiamonds;
        AllCards[25] = KingOfDiamonds;
        AllCards[26] = QueenOfDiamonds;
        AllCards[27] = JackOfDiamonds;
        AllCards[28] = TenOfDiamonds;
        AllCards[29] = NineOfDiamonds;
        AllCards[30] = EightOfDiamonds;
        AllCards[31] = SevenOfDiamonds;

        //This block of code is designed to provide each player with 8 random cards.
        //After designating one card to someone, the code will automatically delete it from "AllCards"
        //This action forbids creating several cards of one type.


        //First Player Hand Created
        int i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player1Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }
        //Second Player Hand Created

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player2Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }
        //Third Player Hand Created

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player3Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }
        //Fourth Player Hand Created

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player4Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }


        //This block of code sorts each player hand, according to the type of cards.
        // (Cards with the same type will be close to each other)

        //First player hand is sorted
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
        //Second player hand is sorted
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
        //Third player hand is sorted
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
        //Fourth player hand is sorted
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

        //This block of code will display all arrays of Players Hands,
        //before the game actually starts.
        //This will help to determine three and four in a row combinations or debugging code
        // in case of ambiguous situations.

        System.out.println(separation);
        System.out.println("Player 1 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player1Hand[j]);
        }
        Thread.sleep(1000);
        System.out.println(separation);
        System.out.println("Player 2 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player2Hand[j]);
        }
        Thread.sleep(1000);
        System.out.println(separation);
        System.out.println("Player 3 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player3Hand[j]);
        }
        Thread.sleep(1000);
        System.out.println(separation);
        System.out.println("Player 4 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player4Hand[j]);
        }
        Thread.sleep(1000);

        System.out.println(separation);


        //The game has started.This code will display the type of master cards for this particular set.

        System.out.println("Game Started! The Master Cards is ");
        if (Objects.equals(CardClass, "Spades")) {
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
        } else if (Objects.equals(CardClass, "Hearts")) {
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

        } else if (Objects.equals(CardClass, "Clubs")) {
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
        } else {
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
        Thread.sleep(1000);



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
        for (int k = 0; k < 8; k++) {

            //Here is decided, who will be the first to show the card.
            //The general idea is the same as deciding the type of Master Cards.
            double B = Math.random() * 10;
            int WhoWillBeFirst;
            if (B <= 2.5) {
                WhoWillBeFirst = 1;
            } else if (B > 2.5 && B <= 5) {
                WhoWillBeFirst = 2;
            } else if (B > 5 && B <= 7.5) {
                WhoWillBeFirst = 3;
            } else {
                WhoWillBeFirst = 4;
            }

            //This condition will appear when first player begins the game.
            if (WhoWillBeFirst == 1) {
                //first player turn
                System.out.println("Player 1 will start");
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player1Hand[rand] != null) {
                        PlayCards[0] = Player1Hand[rand];
                        Player1Hand[rand] = null;
                        break;
                    }
                }
                //second player turn

                for (int j = 0; j < 8; j++) {
                    if (Player2Hand[j] != null && Player2Hand[j].type == PlayCards[0].type) {
                        PlayCards[1] = Player2Hand[j];
                        Player2Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }

                //third player turn

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

                //Player 4 turn

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

                //This condition will appear when second player begins the game.
            } else if (WhoWillBeFirst == 2) {
                System.out.println("Player 2 will start");
                //second player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player2Hand[rand] != null) {
                        PlayCards[1] = Player2Hand[rand];
                        Player2Hand[rand] = null;
                        break;
                    }
                }
                //third player turn

                for (int j = 0; j < 8; j++) {
                    if (Player3Hand[j] != null && Player3Hand[j].type == PlayCards[1].type) {
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

                //fourth player turn
                for (int j = 0; j < 8; j++) {
                    if (Player4Hand[j] != null && Player4Hand[j].type == PlayCards[1].type) {
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

                //first player turn

                for (int j = 0; j < 8; j++) {
                    if (Player1Hand[j] != null && Player1Hand[j].type == PlayCards[1].type) {
                        PlayCards[0] = Player1Hand[j];
                        Player1Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }

                //This condition will appear when third player begins the game.
            } else if (WhoWillBeFirst == 3) {
                System.out.println("Player 3 will start");
                //third player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player3Hand[rand] != null) {
                        PlayCards[2] = Player3Hand[rand];
                        Player3Hand[rand] = null;
                        break;
                    }
                }
                //fourth player turn

                for (int j = 0; j < 8; j++) {
                    if (Player4Hand[j] != null && Player4Hand[j].type == PlayCards[2].type) {
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

                //first player turn

                for (int j = 0; j < 8; j++) {
                    if (Player1Hand[j] != null && Player1Hand[j].type == PlayCards[2].type) {
                        PlayCards[0] = Player1Hand[j];
                        Player1Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }

                //second player turn

                for (int j = 0; j < 8; j++) {
                    if (Player2Hand[j] != null && Player2Hand[j].type == PlayCards[2].type) {
                        PlayCards[1] = Player2Hand[j];
                        Player2Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }
                //This condition will appear when fourth player begins the game.
            } else {
                System.out.println("Player 4 will start");
                //fourth player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player4Hand[rand] != null) {
                        PlayCards[3] = Player4Hand[rand];
                        Player4Hand[rand] = null;
                        break;
                    }
                }
                //first player turn

                for (int j = 0; j < 8; j++) {
                    if (Player1Hand[j] != null && Player1Hand[j].type == PlayCards[3].type) {
                        PlayCards[0] = Player1Hand[j];
                        Player1Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[0] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player1Hand[j] != null) {
                            PlayCards[0] = Player1Hand[j];
                            Player1Hand[j] = null;
                            break;
                        }
                    }
                }

                //second player turn

                for (int j = 0; j < 8; j++) {
                    if (Player2Hand[j] != null && Player2Hand[j].type == PlayCards[3].type) {
                        PlayCards[1] = Player2Hand[j];
                        Player2Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }
                if (PlayCards[1] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player2Hand[j] != null) {
                            PlayCards[1] = Player2Hand[j];
                            Player2Hand[j] = null;
                            break;
                        }
                    }
                }

                //third player turn

                for (int j = 0; j < 8; j++) {
                    if (Player3Hand[j] != null && Player3Hand[j].type == PlayCards[3].type) {
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

            //this code will make it easier to understand each set of game.
            System.out.println("Set " + (k + 1));
            System.out.println("                                |Player 3|                         ");
            System.out.println("                                    |                        ");
            System.out.println("                                    v                        ");
            System.out.println("                              " + PlayCards[2] + "                     ");
            System.out.println("                                                             ");
            System.out.println("|Player 2|  ->  " + PlayCards[1] + "                " + PlayCards[3] + "  <-  |Player 4|");
            System.out.println("                                                             ");
            System.out.println("                              " + PlayCards[0] + "                     ");
            System.out.println("                                    ^                        ");
            System.out.println("                                    |                        ");
            System.out.println("                                |Player 1|                          ");


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

            Thread.sleep(1000);

            for (int m = 0; m < 4; m++) {
                PlayCards[m] = null;
            }

            System.out.println(separation);
        }
        System.out.println("Game has finished!");
        System.out.println(separation);
        System.out.println("Total amount of points of 1 and 3 Player is " + pointsOf1and3);
        System.out.println("Total amount of points of 2 and 4 Player is " + pointsOf2and4);
        System.out.println(separation);


        if (pointsOf1and3 > pointsOf2and4) {
            System.out.println("Player 1 and Player 3 won!");
        } else {
            System.out.println("Player 2 and Player 4 won!");
        }
        System.out.println(separation);

    }


}
