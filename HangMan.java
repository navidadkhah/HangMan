import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Console;
import java.io.FileWriter;

class Text {
    int a;
    String[] word = {"tehran", "pizza", "banana", "new york", "advanced programming", "michael jordan",
            "lionel messi", "apple", "macaroni", "university", "intel", "kitten", "python", "java",
            "data structures", "algorithm", "assembly", "basketball", "hockey", "leader", "javascript",
            "toronto", "united states of america", "psychology", "chemistry", "breaking bad", "physics",
            "abstract classes", "linux kernel", "january", "march", "time travel", "twitter", "instagram",
            "dog breeds", "strawberry", "snow", "game of thrones", "batman", "ronaldo", "soccer",
            "hamburger", "italy", "greece", "albert einstein", "hangman", "clubhouse", "call of duty",
            "science", "theory of languages and automata"};

}

class Random extends Text {
    String rand() {
        a = (int) (Math.random() * 50);
        return word[a];
    }

    char[] tedad() {
        String chra = word[a];

        int tedad = word[a].length();
        //System.out.println(tedad);
        char[] ja = new char[tedad];
        for (int i = 0; i < tedad; i++) {
            if (chra.charAt(i) == ' ') {
                ja[i] = ' ';
            } else {
                ja[i] = '_';
            }
        }
        return ja;
    }
}

public class HangMan extends Text {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    void adamak() {
        System.out.print(ANSI_CYAN + "-------\n|\n|\n|\n|\n|" + ANSI_RESET);
    }
}

class Pishro1 extends HangMan {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    void shekl(int tekrar) {
        switch (tekrar) {
            case 0 : System.out.print(ANSI_CYAN + "-------\n|\n|\n|\n|\n|" + ANSI_RESET);break;
            case 1 : System.out.print(ANSI_CYAN + "-------\n|    |\n|\n|\n|\n|" + ANSI_RESET);break;
            case 2 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|\n|\n|" + ANSI_RESET);break;
            case 3 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /\n|\n|" + ANSI_RESET);break;
            case 4 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\n|\n|" + ANSI_RESET);break;
            case 5 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|\n|" + ANSI_RESET);break;
            case 6 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|   /\n|" + ANSI_RESET);break;
            case 7 : System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|   / \\\n|" + ANSI_RESET);break;
        }
    }
}

class Pishro2 extends HangMan {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    void shekl(int tekrar) {
        switch (tekrar) {
            case 0:
                case1:
                System.out.print(ANSI_CYAN + "-------\n|\n|\n|\n|\n|" + ANSI_RESET);
                break;
            case 2:
            case 3:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|\n|\n|\n|" + ANSI_RESET);
                break;
            case 4:
            case 5:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|\n|\n|" + ANSI_RESET);
                break;
            case 6:
            case 7:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /\n|\n|" + ANSI_RESET);
                break;
            case 8:
            case 9:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\n|\n|" + ANSI_RESET);
                break;
            case 10:
            case 11:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|\n|" + ANSI_RESET);
                break;
            case 12:
            case 13:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|   /\n|" + ANSI_RESET);
                break;
            case 14:
                System.out.print(ANSI_CYAN + "-------\n|    |\n|    o\n|   /|\\\n|   / \\\n|" + ANSI_RESET);
                break;
        }
    }
}

class Vorod {

    public int Vuser(String user) throws IOException {
        File f = new File("users.txt");
        if (f.length() == 0) {
            System.out.println("++please signup first++");
            return 2;
        }
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String s;
        while ((s = freader.readLine()) != null) {
            String[] st = s.split(" ");

            String name = st[1];

            if (name.equals(user)) {
                return -1;
            }
        }
        return 1;
    }

    public int Vpass(String pass) throws IOException {
        File f = new File("users.txt");
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String s;
        while ((s = freader.readLine()) != null) {
            String[] st = s.split(" ");

            String name = st[1];

            if (name.equals(pass)) {
                return -1;
            }
        }
        return 1;
    }

}

class ScorePlayer {


    void setScores(String user, int[] emtiaz, int player, ArrayList nomre, ArrayList esm) throws IOException {

        nomre.add(0);
        esm.add(user);

        String filename2 = "scores.txt";
        FileWriter fy = new FileWriter(filename2, true);
        fy.write(user + " .......... " + nomre.get(player) + "\n");
        fy.close();

    }

    void getScores(String user, int player, ArrayList nomre, ArrayList esm) throws IOException {

        FileInputStream f = new FileInputStream("scores.txt");
        String line = "";
        int numline = 0;
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            line = s.nextLine();
            if (line.startsWith(user)) {
                break;
            }
            numline++;
        }

        int temp = (int) nomre.get(numline);
        temp += 5;
        nomre.set(numline, temp);

        PrintWriter pw = new PrintWriter("scores.txt");
        pw.close();

        for (int i = 0; i < nomre.size(); i++) {

            for (int j = i; j < nomre.size(); j++) {
                if ((int) nomre.get(j) > (int) nomre.get(i)) {

                    int hesab = (int) nomre.get(j);
                    nomre.set(j, nomre.get(i));
                    nomre.set(i, hesab);
                    /////
                    String avaz = (String) esm.get(j);
                    esm.set(j, esm.get(i));
                    esm.set(i, avaz);

                }
            }
        }

        File f1 = new File("scores.txt");
        FileWriter fw = new FileWriter(f1, true);
        for (int i = 0; i < esm.size(); i++) {

            fw.write(esm.get(i) + " .......... " + nomre.get(i) + "\n");

        }
        fw.close();

    }


}


class TestHang {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_RED + "***Welcome to my game***" + ANSI_RESET);
        int player = 0;
        ArrayList<Integer> nomre = new ArrayList<Integer>();
        ArrayList<String> esm = new ArrayList<String>();
        ScorePlayersFile();
        File();
        int k = 0;
        while (true) {
            Thread.sleep(1000);
            System.out.println(ANSI_CYAN + "1. signup / 2. login / 3.show leaderboard / 4.exit" + ANSI_RESET);
            int asli = input.nextInt();
            clearscreen();
            if (asli == 1) {
                MainMenu(asli, k, player, nomre, esm);
                player++;
                k++;
            }
            if (asli == 2) {
                login(player, nomre, esm);
            }
            if (asli == 3) {
                seeScores();
            } else if (asli == 4) {
                System.out.println(ANSI_YELLOW+"                    +++++++++Thank you Bye Bye+++++++++");
                System.out.println("                                 Spring 1400"+ANSI_RESET);
                Thread.sleep(1500);
                break;
            }
        }
    }

    static void game(String user, int player, ArrayList nomre, ArrayList esm) throws Exception {
        boolean is_fill = true;
        int checkRight = 0;
        int loop = 0;
        int ghalat = 0;
        int aval = 0;
        int komak = 0;
        int bargasht=0;

        char[] array = new char[26];
        Pishro1 pishro1 = new Pishro1();
        Pishro2 pishro2 = new Pishro2();
        Scanner input = new Scanner(System.in);
        HangMan hangMan = new HangMan();
        Random random = new Random();
        String kalame = random.rand();
        char[] ja = random.tedad();
        System.out.println(kalame);
        hangMan.adamak();
        System.out.println();
        for (char a : ja) {
            System.out.print(ANSI_GREEN + a + "" + ANSI_RESET);
        }
        System.out.println();
        if (kalame.length() > 9) {
            for (int i = 0; i < 26; i++) {
                if(komak==0 && bargasht==0)
                {
                    System.out.println("== for HINT enter # ==");
                }
                char vorodi = input.next().charAt(0);
                if(vorodi=='#')
                {
                    if(Help(user,nomre,esm)==1)
                    {
                        while (true) {
                            int ezafe=0;
                            int Srand=(int)(Math.random()*kalame.length());
                            vorodi=kalame.charAt(Srand);
                            for (int j = 0; j < 26; j++) {
                                if (array[j] == vorodi) {
                                    ezafe=1;
                                    break;
                                }
                            }
                            if(ezafe==0)
                            {
                                break;
                            }
                        }
                        komak=1;
                        bargasht=1;
                    }
                    else {
                        bargasht=1;
                        continue;
                    }
                }
                clearscreen();
                for (int j = 0; j < 26; j++) {
                    if (array[j] == vorodi) {
                        System.out.println(ANSI_RED + "--please choose another letter--" + ANSI_RESET);
                        aval = 1;
                        break;
                    }
                }
                if (aval == 1) {
                    aval = 0;
                    continue;
                }
                array[i] = vorodi;
                for (int j = 0; j < kalame.length(); j++) {
                    if (kalame.charAt(j) == vorodi) {
                        ja[j] = vorodi;
                        checkRight = 1;
                    }
                }
                if (checkRight == 0) {
                    ghalat += 1;
                    loop += 1;
                    pishro2.shekl(loop);

                    System.out.println();
                    for (char a : ja) {
                        System.out.print(ANSI_GREEN + a + "" + ANSI_RESET);
                    }
                } else {
                    pishro2.shekl(loop);
                    System.out.println();
                    for (char a : ja) {
                        System.out.print(ANSI_GREEN + a + "" + ANSI_RESET);
                    }
                }
                checkRight = 0;
                System.out.println();
                if (ghalat == 14) {
                    System.out.println("ohh you lost:(");
                    System.out.println("the word is: " + kalame);
                    Thread.sleep(1200);
                    clearscreen();
                    break;
                }
                for (int j = 0; j < kalame.length(); j++) {
                    if (ja[j] != kalame.charAt(j)) {
                        is_fill = false;
                        break;
                    }
                }
                if (is_fill) {
                    System.out.println("congrats you won:)   " +
                            "you got 5 scores");
                    Thread.sleep(1200);
                    clearscreen();
                    score(user, player, nomre, esm);
                    break;
                }
                is_fill = true;
                System.out.println(ANSI_RED + "cannot choose:" + ANSI_RESET);
                for (char a : array) {

                    System.out.print(ANSI_GREEN + a + " " + ANSI_RESET);
                }
                System.out.println();

            }
        } else {
            for (int i = 0; i < 26; i++) {
                if(komak==0 && bargasht==0)
                {
                    System.out.println("== for HINT enter # ==");
                }
                char vorodi = input.next().charAt(0);
                if(vorodi=='#')
                {
                    if(Help(user,nomre,esm)==1)
                    {
                        while (true) {
                            int ezafe=0;
                            int Srand=(int)(Math.random()*kalame.length());
                            vorodi=kalame.charAt(Srand);
                            for (int j = 0; j < 26; j++) {
                                if (array[j] == vorodi) {
                                    ezafe=1;
                                    break;
                                }
                            }
                            if(ezafe==0)
                            {
                                break;
                            }
                        }
                        komak=1;
                        bargasht=1;
                    }
                    else {
                        bargasht=1;
                        continue;
                    }
                }
                clearscreen();
                for (int j = 0; j < 26; j++) {
                    if (array[j] == vorodi) {
                        System.out.println(ANSI_RED + "--please choose another letter--" + ANSI_RESET);
                        aval = 1;
                        break;
                    }
                }
                if (aval == 1) {
                    aval = 0;
                    continue;
                }
                array[i] = vorodi;

                for (int j = 0; j < kalame.length(); j++) {
                    if (kalame.charAt(j) == vorodi) {
                        ja[j] = vorodi;
                        checkRight = 1;
                    }
                }
                if (checkRight == 0) {
                    ghalat += 1;
                    loop += 1;
                    pishro1.shekl(loop);

                    System.out.println();
                    for (char a : ja) {
                        System.out.print(ANSI_GREEN + a + "" + ANSI_RESET);
                    }
                } else {
                    pishro1.shekl(loop);
                    System.out.println();
                    for (char a : ja) {
                        System.out.print(ANSI_GREEN + a + "" + ANSI_RESET);
                    }
                }
                checkRight = 0;
                System.out.println();
                if (ghalat == 7) {
                    System.out.println("ohh you lost:(");
                    System.out.println("the word is: " + kalame);
                    Thread.sleep(1200);
                    clearscreen();
                    break;
                }
                for (int j = 0; j < kalame.length(); j++) {
                    if (ja[j] != kalame.charAt(j)) {
                        is_fill = false;
                        break;
                    }
                }

                if (is_fill) {

                    System.out.println("congrats you won:)   " +
                            "you got 5 scores");
                    Thread.sleep(1200);
                    clearscreen();
                    score(user, player, nomre, esm);
                    break;
                }
                is_fill = true;
                System.out.println(ANSI_RED + "cannot choose:" + ANSI_RESET);
                for (char a : array) {

                    System.out.print(ANSI_GREEN + a + " " + ANSI_RESET);
                }
                System.out.println();

            }
        }
    }

    public static void score(String user, int player, ArrayList nomre, ArrayList esm) throws Exception {

        ScorePlayer scorePlayer = new ScorePlayer();
        scorePlayer.getScores(user, player, nomre, esm);
    }

    public static void seeScores() {

        try {
            File myObj = new File("scores.txt");
            if (myObj.length() == 0) {
                System.out.println("++there is no record yet++");
            } else {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {

                    String data = myReader.nextLine();
                    System.out.println(ANSI_Blue+data+ANSI_RESET);
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int Help(String user, ArrayList nomre, ArrayList esm) throws IOException {


        FileInputStream f = new FileInputStream("scores.txt");
        String line = "";
        int numline = 0;
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            line = s.nextLine();
            if (line.startsWith(user)) {
                break;
            }
            numline++;
        }
        if ((int) nomre.get(numline)<10) {

            System.out.println(ANSI_YELLOW+"++you dont have enough score++"+ANSI_RESET);
            return -1;

        }
        else {

            int temp = (int) nomre.get(numline);
            temp -= 10;
            nomre.set(numline, temp);

            PrintWriter pw = new PrintWriter("scores.txt");
            pw.close();

            for (int i = 0; i < nomre.size(); i++) {

                for (int j = i; j < nomre.size(); j++) {
                    if ((int) nomre.get(j) > (int) nomre.get(i)) {

                        int hesab = (int) nomre.get(j);
                        nomre.set(j, nomre.get(i));
                        nomre.set(i, hesab);
                        /////
                        String avaz = (String) esm.get(j);
                        esm.set(j, esm.get(i));
                        esm.set(i, avaz);

                    }
                }
            }

            File f1 = new File("scores.txt");
            FileWriter fw = new FileWriter(f1, true);
            for (int i = 0; i < esm.size(); i++) {

                fw.write(esm.get(i) + " .......... " + nomre.get(i) + "\n");

            }
            fw.close();
            return 1;
        }
    }

    public static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void MainMenu(int kodom, int k, int player, ArrayList nomre, ArrayList esm) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("please enter username: ");
            String user = input.next();
            clearscreen();
            int check = searchUser(user);
            if (check == -1) {
                System.out.println("++this username has been taken,please choose another one++");
            } else {
                while (true) {
                    System.out.println("please enter password: (at least 6 char and contain small and big char and num and special char)");
                    String pass = input.next();
                    clearscreen();
                    Matcher rightpass = Pattern.compile(".*(?=.{6,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#/\\\\.$%*^&+=_-]).*").matcher(pass);
                    if (!rightpass.matches()) {
                        System.out.println("not accepted. try another password");
                        continue;
                    }
                    Users(user, pass, k, player, nomre, esm);
                    System.out.println("++signup successful++");
                    Thread.sleep(900);
                    clearscreen();
                    break;
                }
                break;
            }
        }
    }

    public static void login(int player, ArrayList nomre, ArrayList esm) throws Exception {
        Scanner input = new Scanner(System.in);

        int check = 0;
        String user;
        Vorod vorod = new Vorod();
        while (true) {
            clearscreen();
            System.out.println("enter username: ");
            user = input.next();
            if (vorod.Vuser(user) == 2) {
                check = 1;
                break;
            }
            if (vorod.Vuser(user) == 1) {
                System.out.println("++there is no user++");
            } else {
                break;
            }
            clearscreen();
        }
        while (true) {
            if (check == 1) {
                break;
            }
            System.out.println("enter password: ");
            //String pass=HidePass();
            String pass = input.next();

            if (vorod.Vpass( pass) == 1) {
                System.out.println("++the password is wrong++");
            } else {
                break;
            }
        }
        while (true) {
            if (check == 1) {
                break;
            }
            System.out.println(ANSI_CYAN + "1. start game / 2. show leaderboard / 3.logout" + ANSI_RESET);
            int n = input.nextInt();
            if (n == 1) {
                clearscreen();
                if (check == 0) {
                    System.out.println("loading game...");
                    Thread.sleep(1200);
                    clearscreen();
                    game(user, player, nomre, esm);
                }
                check = 0;
            } if(n==2) {
                seeScores();
                Thread.sleep(1200);
            }
            if(n==3)
            {
                System.out.println("++Back to main menu++");
                break;
            }
        }
    }

    public static String HidePass() {
        Console console = System.console();
        console.printf("enter your password: ");
        char[] password = console.readPassword();
        String passwordstring= new String(password);
        return passwordstring;
    }

    public static void Users(String user, String pass, int k, int player, ArrayList nomre, ArrayList esm) {
        int[] scores = new int[10];
        int i = 0;
        scores[k] = 0;
        int saveScores = scores[k];
        try {
            String filename = "users.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("username: " + user + "\n");
            fw.write("password: " + pass + "\n");
            fw.close();
            ScorePlayer scorePlayer = new ScorePlayer();
            scorePlayer.setScores(user, scores, player, nomre, esm);
            /*String filename2 = "scores.txt";
            FileWriter fy = new FileWriter(filename2, true);
            fy.write(user+" .......... "+scores[k]+"\n");
            fy.close();*/

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }

    }

    public static int searchUser(String user) throws IOException {
        String word = user;
        File f = new File("users.txt");
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String s;
        while ((s = freader.readLine()) != null) {
            String[] st = s.split(" ");

            String name = st[1];

            if (name.equals(word)) {
                return -1;
            }
        }
        return 1;
    }

    public static void File() {

        File f = new File("users.txt");

        try {
            if (f.createNewFile()) {
                System.out.println(ANSI_Blue+"------------------------------------------------------------"+ANSI_RESET);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ScorePlayersFile() {
        File f = new File("scores.txt");
        try {
            if (f.createNewFile()) {
                System.out.println(ANSI_Blue+"------------------------------------------------------------"+ANSI_RESET);
            }
        } catch (IOException E) {
            System.out.println(E.getMessage());
        }
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_Blue = "\u001B[34m";
}
