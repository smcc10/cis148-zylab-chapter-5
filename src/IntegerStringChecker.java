import java.util.Scanner;

public class IntegerStringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        int i;
        boolean flag = true;

        userString = scnr.next();

        for (i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) < '0' || userString.charAt(i) > '9') {
                flag = false;
            }
        }
        if (!flag) {
            System.out.print("no");
        }
        else {
            System.out.print("yes");
        }

    }
}