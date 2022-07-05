
class ASCII {

    public static void getPlayerCards(String Cards) {

        int L = 8;
        int H = 6;

        String[] Letters = new String[Cards.length()];
        for (int i = 0; i < Cards.length(); i++) {
            Letters[i] = String.valueOf(Cards.charAt(i));
        }
        String[] Canon = new String[H];
        String[] Buffer = new String[H];
        for (int i = 0; i < H; i++) {
            Buffer[i] = "";
        }
        String[] Answer = new String[H];
        for (int i = 0; i < H; i++) {
            Answer[i] = "";
        }


        Canon[0] = ".------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------.        ";
        Canon[1] = "|A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. |        ";
        Canon[2] = "| :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || :(): || :(): || :(): || :(): || :(): || :(): || :(): || :(): || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: |        ";
        Canon[3] = "| (__) || (__) || (__) || (__) || (__) || (__) || (__) || (__) || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || ()() || ()() || ()() || ()() || ()() || ()() || ()() || ()() || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: |        ";
        Canon[4] = "| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|        ";
        Canon[5] = "`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'        ";


        for (int j = 0; j < Cards.length(); j++) {
            switch (Letters[j]) {
                case ("A"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(0, L);
                    }
                    break;
                case "B":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L, L * 2);
                    }
                    break;
                case "C":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 2, L * 3);
                    }
                    break;
                case "D":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 3, L * 4);
                    }
                    break;
                case "E":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 4, L * 5);
                    }
                    break;
                case "F":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 5, L * 6);
                    }
                    break;
                case "G":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 6, L * 7);
                    }
                    break;
                case ("g"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 6, L * 7);
                    }
                    break;
                case "H":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 7, L * 8);
                    }
                    break;
                case ("h"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 7, L * 8);
                    }
                    break;
                case "I":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 8, L * 9);
                    }
                    break;
                case ("i"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 8, L * 9);
                    }
                    break;
                case "J":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 9, L * 10);
                    }
                    break;
                case ("j"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 9, L * 10);
                    }
                    break;
                case "K":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 10, L * 11);
                    }
                    break;
                case ("k"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 10, L * 11);
                    }
                    break;
                case "L":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 11, L * 12);
                    }
                    break;
                case ("l"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 11, L * 12);
                    }
                    break;
                case "M":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 12, L * 13);
                    }
                    break;
                case ("m"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 12, L * 13);
                    }
                    break;
                case "N":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 13, L * 14);
                    }
                    break;
                case ("n"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 13, L * 14);
                    }
                    break;
                case "O":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 14, L * 15);
                    }
                    break;
                case ("o"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 14, L * 15);
                    }
                    break;
                case "P":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 15, L * 16);
                    }
                    break;
                case ("p"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 15, L * 16);
                    }
                    break;
                case "Q":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 16, L * 17);
                    }
                    break;
                case ("q"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 16, L * 17);
                    }
                    break;
                case "R":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 17, L * 18);
                    }
                    break;
                case ("r"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 17, L * 18);
                    }
                    break;
                case "S":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 18, L * 19);
                    }
                    break;
                case ("s"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 18, L * 19);
                    }
                    break;
                case "T":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 19, L * 20);
                    }
                    break;
                case ("t"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 19, L * 20);
                    }
                    break;
                case "U":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 20, L * 21);
                    }
                    break;
                case ("u"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 20, L * 21);
                    }
                    break;
                case "V":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 21, L * 22);
                    }
                    break;
                case ("v"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 21, L * 22);
                    }
                    break;
                case "W":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 22, L * 23);
                    }
                    break;
                case ("w"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 22, L * 23);
                    }
                    break;
                case "X":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 23, L * 24);
                    }
                    break;
                case ("x"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 23, L * 24);
                    }
                    break;
                case "Y":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 24, L * 25);
                    }
                    break;
                case ("y"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 24, L * 25);
                    }
                    break;
                case "Z":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 25, L * 26);
                    }
                    break;
                case ("a"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 26, L * 27);
                    }
                    break;
                case ("b"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 27, L * 28);
                    }
                    break;
                case ("c"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 28, L * 29);
                    }
                    break;
                case ("d"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 29, L * 30);
                    }
                    break;
                case ("e"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 30, L * 31);
                    }
                    break;
                case ("f"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 31, L * 32);
                    }
                    break;


            }
            for (int i = 0; i < H; i++) {
                Answer[i] += Buffer[i];
            }
            for (int i = 0; i < H; i++) {
                Buffer[i] = "";
            }
        }

        for (int i = 0; i < H; i++) {
            System.out.println(Answer[i]);
        }

    }

    public static String getPlayerCardsString(String Cards, int line) {

        int L = 8;
        int H = 6;

        String[] Letters = new String[Cards.length()];
        for (int i = 0; i < Cards.length(); i++) {
            Letters[i] = String.valueOf(Cards.charAt(i));
        }
        String[] Canon = new String[H];
        String[] Buffer = new String[H];
        for (int i = 0; i < H; i++) {
            Buffer[i] = "";
        }
        String[] Answer = new String[H];
        for (int i = 0; i < H; i++) {
            Answer[i] = "";
        }


        Canon[0] = ".------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------..------.        ";
        Canon[1] = "|A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. ||A.--. ||K.--. ||Q.--. ||J.--. |10.--. ||9.--. ||8.--. ||7.--. |        ";
        Canon[2] = "| :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || (\\/) || :(): || :(): || :(): || :(): || :(): || :(): || :(): || :(): || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: || :/\\: |        ";
        Canon[3] = "| (__) || (__) || (__) || (__) || (__) || (__) || (__) || (__) || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || ()() || ()() || ()() || ()() || ()() || ()() || ()() || ()() || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: |        ";
        Canon[4] = "| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|| '--'A|| '--'K|| '--'Q|| '--'J|| '--10|| '--'9|| '--'8|| '--'7|        ";
        Canon[5] = "`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'        ";


        for (int j = 0; j < Cards.length(); j++) {
            switch (Letters[j]) {
                case ("A"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(0, L);
                    }
                    break;
                case "B":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L, L * 2);
                    }
                    break;
                case "C":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 2, L * 3);
                    }
                    break;
                case "D":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 3, L * 4);
                    }
                    break;
                case "E":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 4, L * 5);
                    }
                    break;
                case "F":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 5, L * 6);
                    }
                    break;
                case "G":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 6, L * 7);
                    }
                    break;
                case ("g"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 6, L * 7);
                    }
                    break;
                case "H":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 7, L * 8);
                    }
                    break;
                case ("h"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 7, L * 8);
                    }
                    break;
                case "I":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 8, L * 9);
                    }
                    break;
                case ("i"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 8, L * 9);
                    }
                    break;
                case "J":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 9, L * 10);
                    }
                    break;
                case ("j"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 9, L * 10);
                    }
                    break;
                case "K":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 10, L * 11);
                    }
                    break;
                case ("k"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 10, L * 11);
                    }
                    break;
                case "L":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 11, L * 12);
                    }
                    break;
                case ("l"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 11, L * 12);
                    }
                    break;
                case "M":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 12, L * 13);
                    }
                    break;
                case ("m"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 12, L * 13);
                    }
                    break;
                case "N":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 13, L * 14);
                    }
                    break;
                case ("n"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 13, L * 14);
                    }
                    break;
                case "O":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 14, L * 15);
                    }
                    break;
                case ("o"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 14, L * 15);
                    }
                    break;
                case "P":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 15, L * 16);
                    }
                    break;
                case ("p"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 15, L * 16);
                    }
                    break;
                case "Q":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 16, L * 17);
                    }
                    break;
                case ("q"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 16, L * 17);
                    }
                    break;
                case "R":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 17, L * 18);
                    }
                    break;
                case ("r"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 17, L * 18);
                    }
                    break;
                case "S":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 18, L * 19);
                    }
                    break;
                case ("s"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 18, L * 19);
                    }
                    break;
                case "T":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 19, L * 20);
                    }
                    break;
                case ("t"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 19, L * 20);
                    }
                    break;
                case "U":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 20, L * 21);
                    }
                    break;
                case ("u"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 20, L * 21);
                    }
                    break;
                case "V":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 21, L * 22);
                    }
                    break;
                case ("v"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 21, L * 22);
                    }
                    break;
                case "W":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 22, L * 23);
                    }
                    break;
                case ("w"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 22, L * 23);
                    }
                    break;
                case "X":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 23, L * 24);
                    }
                    break;
                case ("x"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 23, L * 24);
                    }
                    break;
                case "Y":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 24, L * 25);
                    }
                    break;
                case ("y"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 24, L * 25);
                    }
                    break;
                case "Z":
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 25, L * 26);
                    }
                    break;
                case ("a"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 26, L * 27);
                    }
                    break;
                case ("b"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 27, L * 28);
                    }
                    break;
                case ("c"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 28, L * 29);
                    }
                    break;
                case ("d"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 29, L * 30);
                    }
                    break;
                case ("e"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 30, L * 31);
                    }
                    break;
                case ("f"):
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 31, L * 32);
                    }
                    break;
                default:
                    for (int i = 0; i < H; i++) {
                        Buffer[i] = Canon[i].substring(L * 32, L * 33);
                    }


            }
            for (int i = 0; i < H; i++) {
                Answer[i] += Buffer[i];
            }
            for (int i = 0; i < H; i++) {
                Buffer[i] = "";
            }
        }

        return Answer[line];

    }
}

