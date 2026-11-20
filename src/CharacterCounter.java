import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        char character = scnr.next().charAt(0);
        String string = scnr.nextLine();

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(count);
    }
}
