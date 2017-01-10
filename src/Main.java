import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int intNumber = 0;
        double doubleNumber = 0.0;
        String str = "";

        intNumber = Integer.valueOf(scanner.nextLine());
        doubleNumber = Double.valueOf(scanner.nextLine());
        str += scanner.nextLine();

        System.out.println(i + intNumber);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+ doubleNumber);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + str);
    }
}
