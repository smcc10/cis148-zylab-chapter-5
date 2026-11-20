import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String userString;
        String reversedString = "";

        userString = scnr.nextLine();

        while (!userString.equals("q") && !userString.equals("quit") && !userString.equals("Quit")) {
            reversedString = "";

            for  (i = userString.length() - 1; i >= 0; i--) {
                reversedString += userString.charAt(i);
            }
            System.out.println(reversedString);
            userString = scnr.nextLine();

        }
        scnr.close();
    }
}
