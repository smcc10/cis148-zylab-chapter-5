import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String userString;

        userString = scnr.nextLine();

        for (i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == ' ') {
                userString = userString.substring(0, i) + userString.substring(i + 1);
                i--;
            }
        } System.out.println(userString);
    }
}