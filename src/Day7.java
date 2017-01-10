import java.util.LinkedList;
import java.util.Scanner;


public class Day7 {

    /**
     * https://www.hackerrank.com/challenges/30-arrays
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addFirst(in.nextInt());
        }
        in.close();

        for (int number : list) {
            System.out.print(number);
            System.out.print(" ");
        }
    }
}
