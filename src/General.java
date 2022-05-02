import java.sql.SQLOutput;

public class General {
    public static void Start() {
        Cards[] AllCards = new Cards[32];

        Cards[] Player1Hand = new Cards[8];
        Cards[] Player2Hand = new Cards[8];
        Cards[] Player3Hand = new Cards[8];
        Cards[] Player4Hand = new Cards[8];

        Cards[] PlayCards = new Cards[4];


        Cards AceOfSpades = new Cards("Ace Of Spades", 0, 11, 8, false, 1);
        Cards KingOfSpades = new Cards("King Of Spades", 1, 4, 7, false, 1);
        Cards QueenOfSpades = new Cards("Queen Of Spades", 2, 3, 6, false, 1);
        Cards JackOfSpades = new Cards("Jack Of Spades", 3, 2, 5, false, 1);
        Cards TenOfSpades = new Cards("Ten Of Spades", 4, 10, 4, false, 1);
        Cards NineOfSpades = new Cards("Nine Of Spades", 5, 0, 3, false, 1);
        Cards EightOfSpades = new Cards("Eight Of Spades", 6, 0, 2, false, 1);
        Cards SevenOfSpades = new Cards("Seven Of Spades", 7, 0, 1, false, 1);

        Cards AceOfHearts = new Cards("Ace Of Hearts", 9, 11, 8, false, 2);
        Cards KingOfHearts = new Cards("King Of Hearts", 10, 4, 7, false, 2);
        Cards QueenOfHearts = new Cards("Queen Of Hearts", 11, 3, 6, false, 2);
        Cards JackOfHearts = new Cards("Jack Of Hearts", 12, 2, 5, false, 2);
        Cards TenOfHearts = new Cards("Ten Of Hearts", 13, 10, 4, false, 2);
        Cards NineOfHearts = new Cards("Nine Of Hearts", 14, 0, 3, false, 2);
        Cards EightOfHearts = new Cards("Eight Of Hearts", 15, 0, 2, false, 2);
        Cards SevenOfHearts = new Cards("Seven Of Hearts", 16, 0, 1, false, 2);

        Cards AceOfClubs = new Cards("Ace Of Clubs", 18, 11, 8, false, 3);
        Cards KingOfClubs = new Cards("King Of Clubs", 19, 4, 7, false, 3);
        Cards QueenOfClubs = new Cards("Queen Of Clubs", 20, 3, 6, false, 3);
        Cards JackOfClubs = new Cards("Jack Of Clubs", 21, 2, 5, false, 3);
        Cards TenOfClubs = new Cards("Ten Of Clubs", 22, 10, 4, false, 3);
        Cards NineOfClubs = new Cards("Nine Of Clubs", 23, 0, 3, false, 3);
        Cards EightOfClubs = new Cards("Eight Of Clubs", 24, 0, 2, false, 3);
        Cards SevenOfClubs = new Cards("Seven Of Clubs", 25, 0, 1, false, 3);

        Cards AceOfDiamonds = new Cards("Ace Of Diamonds", 27, 11, 8, false, 4);
        Cards KingOfDiamonds = new Cards("King Of Diamonds", 28, 4, 7, false, 4);
        Cards QueenOfDiamonds = new Cards("Queen Of Diamonds", 29, 3, 6, false, 4);
        Cards JackOfDiamonds = new Cards("Jack Of Diamonds", 30, 2, 5, false, 4);
        Cards TenOfDiamonds = new Cards("Ten Of Diamonds", 31, 10, 4, false, 4);
        Cards NineOfDiamonds = new Cards("Nine Of Diamonds", 32, 0, 3, false, 4);
        Cards EightOfDiamonds = new Cards("Eight Of Diamonds", 33, 0, 2, false, 4);
        Cards SevenOfDiamonds = new Cards("Seven Of Diamonds", 34, 0, 1, false, 4);


        double A = Math.random() * 10;
        String CardClass;


        if (A <= 2.5) {
            CardClass = "Spades";
            System.out.println(CardClass);
            AceOfSpades.setValue(11);
            KingOfSpades.setValue(4);
            QueenOfSpades.setValue(3);
            JackOfSpades.setValue(20);
            TenOfSpades.setValue(10);
            NineOfSpades.setValue(14);
            EightOfSpades.setValue(0);
            SevenOfSpades.setValue(0);
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
            System.out.println(CardClass);
            AceOfHearts.setValue(11);
            KingOfHearts.setValue(4);
            QueenOfHearts.setValue(3);
            JackOfHearts.setValue(20);
            TenOfHearts.setValue(10);
            NineOfHearts.setValue(14);
            EightOfHearts.setValue(0);
            SevenOfHearts.setValue(0);
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
            System.out.println(CardClass);
            AceOfClubs.setValue(11);
            KingOfClubs.setValue(4);
            QueenOfClubs.setValue(3);
            JackOfClubs.setValue(20);
            TenOfClubs.setValue(10);
            NineOfClubs.setValue(14);
            EightOfClubs.setValue(0);
            SevenOfClubs.setValue(0);
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
            System.out.println(CardClass);
            AceOfDiamonds.setValue(11);
            KingOfDiamonds.setValue(4);
            QueenOfDiamonds.setValue(3);
            JackOfDiamonds.setValue(20);
            TenOfDiamonds.setValue(10);
            NineOfDiamonds.setValue(14);
            EightOfDiamonds.setValue(0);
            SevenOfDiamonds.setValue(0);
            AceOfDiamonds.setMaster(true);
            KingOfDiamonds.setMaster(true);
            QueenOfDiamonds.setMaster(true);
            JackOfDiamonds.setMaster(true);
            TenOfDiamonds.setMaster(true);
            NineOfDiamonds.setMaster(true);
            EightOfDiamonds.setMaster(true);
            SevenOfDiamonds.setMaster(true);


        }

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


        int i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player1Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player2Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player3Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }

        i = 0;
        while (i < 8) {
            int rnd = (int) (Math.random() * 32);
            if (AllCards[rnd] != null) {
                Player4Hand[i] = AllCards[rnd];
                AllCards[rnd] = null;
                i++;
            }
        }

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

        System.out.println();
        System.out.println("Player 1 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player1Hand[j]);
        }
        System.out.println();
        System.out.println("Player 2 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player2Hand[j]);
        }
        System.out.println();
        System.out.println("Player 3 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player3Hand[j]);
        }
        System.out.println();
        System.out.println("Player 4 hand is:");
        for (int j = 0; j < 8; j++) {
            System.out.println(Player4Hand[j]);
        }
        System.out.println();


        System.out.println("Game Started! The Master Cards is " + CardClass);
        double B = Math.random() * 10;
        int WhoWillBeFirst;


        if (B <= 2.5) {
            WhoWillBeFirst = 1;
            System.out.println(WhoWillBeFirst + " Player will start.");


        } else if (A > 2.5 && A <= 5) {
            WhoWillBeFirst = 2;
            System.out.println(WhoWillBeFirst + " Player will start.");


        } else if (A > 5 && A <= 7.5) {
            WhoWillBeFirst = 3;
            System.out.println(WhoWillBeFirst + " Player will start.");


        } else {
            WhoWillBeFirst = 4;
            System.out.println(WhoWillBeFirst + " Player will start.");


        }

        int pointsOf1and3 = 0;
        int pointsOf2and4 = 0;
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
        boolean P1has3InARow;
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player1Hand[j].uniqueIndex - Player1Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player1Hand[j].uniqueIndex - Player1Hand[j + 1].uniqueIndex) == 1
                    && P1has4InARow != true) {
                pointsOf1and3 += 20;
                P1has3InARow = true;
                System.out.println("Player 1 has three in a row! Starting with " + Player1Hand[j - 1]);
            }
        }

        boolean P2has3InARow;
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player2Hand[j].uniqueIndex - Player2Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player2Hand[j].uniqueIndex - Player2Hand[j + 1].uniqueIndex) == 1
                    && P2has4InARow != true) {
                pointsOf2and4 += 20;
                P2has3InARow = true;
                System.out.println("Player 2 has three in a row! Starting with " + Player2Hand[j - 1]);
            }
        }

        boolean P3has3InARow;
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player3Hand[j].uniqueIndex - Player3Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player3Hand[j].uniqueIndex - Player3Hand[j + 1].uniqueIndex) == 1
                    && P3has4InARow != true) {
                pointsOf1and3 += 20;
                P3has3InARow = true;
                System.out.println("Player 3 has three in a row! Starting with " + Player3Hand[j - 1]);
            }
        }

        boolean P4has3InARow;
        for (int j = 1; j < 7; j++) {
            if (Math.abs(Player4Hand[j].uniqueIndex - Player4Hand[j - 1].uniqueIndex) == 1 && Math.abs(Player4Hand[j].uniqueIndex - Player4Hand[j + 1].uniqueIndex) == 1
                    && P4has4InARow != true) {
                pointsOf2and4 += 20;
                P3has4InARow = true;
                System.out.println("Player 4 has three in a row! Starting with " + Player4Hand[j - 1]);
            }
        }

        for (int k = 0; k < 8; k++) {


            if (WhoWillBeFirst == 1) {
                //first player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player1Hand[rand] != null) {
                        PlayCards[0] = Player1Hand[rand];
                        Player1Hand[rand] = null;
                        break;
                    } else {
                        continue;
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
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster == true) {
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
                        if (Player3Hand[j] != null && Player3Hand[j].isMaster == true) {
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
                        if (Player4Hand[j] != null && Player4Hand[j].isMaster == true) {
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


            } else if (WhoWillBeFirst == 2) {

                //second player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player2Hand[rand] != null) {
                        PlayCards[1] = Player2Hand[rand];
                        Player2Hand[rand] = null;
                        break;
                    } else {
                        continue;
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
                        if (Player3Hand[j] != null && Player3Hand[j].isMaster == true) {
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
                        PlayCards[2] = Player4Hand[j];
                        Player4Hand[j] = null;
                        break;
                    }
                }
                if (PlayCards[3] == null) {
                    for (int j = 0; j < 8; j++) {
                        if (Player4Hand[j] != null && Player4Hand[j].isMaster == true) {
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
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster == true) {
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


            } else if (WhoWillBeFirst == 3) {

                //third player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player3Hand[rand] != null) {
                        PlayCards[2] = Player3Hand[rand];
                        Player3Hand[rand] = null;
                        break;
                    } else {
                        continue;
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
                        if (Player4Hand[j] != null && Player4Hand[j].isMaster == true) {
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
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster == true) {
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
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster == true) {
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

            } else {

                //fourth player turn
                while (true) {
                    int rand = (int) (Math.random() * 8);
                    if (Player4Hand[rand] != null) {
                        PlayCards[3] = Player4Hand[rand];
                        Player4Hand[rand] = null;
                        break;
                    } else {
                        continue;
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
                        if (Player1Hand[j] != null && Player1Hand[j].isMaster == true) {
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
                        if (Player2Hand[j] != null && Player2Hand[j].isMaster == true) {
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
                        if (Player3Hand[j] != null && Player3Hand[j].isMaster == true) {
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

            System.out.println();
            System.out.println();
            System.out.println("Game " + (k + 1));
            System.out.println("                               Player 3                          ");
            System.out.println();
            System.out.println("                             " + PlayCards[2] + "                     ");
            System.out.println("                                                             ");
            System.out.println("Player 2    " + PlayCards[1] + "                   " + PlayCards[3] + "   Player 4");
            System.out.println("                                                             ");
            System.out.println("                             " + PlayCards[0] + "                     ");
            System.out.println();
            System.out.println("                               Player 1                          ");


            pointsOf1and3 += PlayCards[0].value + + PlayCards[2].value;
            pointsOf2and4 += PlayCards[1].value + + PlayCards[3].value;




            if (PlayCards[0].value > PlayCards[1].value &&
                    PlayCards[0].value > PlayCards[2].value &&
                    PlayCards[0].value > PlayCards[3].value ){
                if (k == 7){pointsOf1and3 += 10;}
                System.out.println("Player 1 won this round with " + PlayCards[0]);
                System.out.println("Total amount of points is " + (PlayCards[0].value+PlayCards[1].value+PlayCards[2].value+PlayCards[3].value));
            }
            if (PlayCards[1].value > PlayCards[0].value &&
                    PlayCards[1].value > PlayCards[2].value &&
                    PlayCards[1].value > PlayCards[3].value ){
                if (k == 7){pointsOf2and4 += 10;}
                System.out.println("Player 2 won this round with " + PlayCards[1]);
                System.out.println("Total amount of points is " + (PlayCards[0].value+PlayCards[1].value+PlayCards[2].value+PlayCards[3].value));
            }
            if (PlayCards[2].value > PlayCards[0].value &&
                    PlayCards[2].value > PlayCards[1].value &&
                    PlayCards[2].value > PlayCards[3].value ){
                if (k == 7){pointsOf1and3 += 10;}
                System.out.println("Player 3 won this round with " + PlayCards[2]);
                System.out.println("Total amount of points is " + (PlayCards[0].value+PlayCards[1].value+PlayCards[2].value+PlayCards[3].value));
            }
            if (PlayCards[3].value > PlayCards[0].value &&
                    PlayCards[3].value > PlayCards[2].value &&
                    PlayCards[3].value > PlayCards[1].value ){
                if (k == 7){pointsOf2and4 += 10;}
                System.out.println("Player 4 won this round with " + PlayCards[3]);
                System.out.println("Total amount of points is " + (PlayCards[0].value+PlayCards[1].value+PlayCards[2].value+PlayCards[3].value));
            }


            for (int m = 0; m < 4; m++) {
                PlayCards[m] = null;
            }


        }
        System.out.println("Game has finished!");
        System.out.println("Total amount of points of 1 and 3 Player is " + pointsOf1and3) ;
        System.out.println("Total amount of points of 2 and 4 Player is " + pointsOf2and4) ;


    }
}
