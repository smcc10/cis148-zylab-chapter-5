import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;
        int max = 0;
        int average;

        num = scnr.nextInt();

        while (num >= 0) {
            sum += num;
            count++;

            if (num > max) {
                max = num;
            }
            num = scnr.nextInt();
        }

        if (count > 0) {
            average = sum / count;

            System.out.println(average + " " + max);
        }
    }
}
