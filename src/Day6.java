import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class Day6 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < line; i++) {
            list.add(scanner.next());
        }

        for (String str : list) {
            ArrayList<Character> evenList = new ArrayList<>();
            ArrayList<Character> oddList = new ArrayList<>();
            char[] chars = str.toCharArray();
            for (int x = 0; x < chars.length ; x++) {
                if(x/ 2 == 0) {
                    evenList.add(chars[x]);
                }else {
                    oddList.add(chars[x]);
                }

            }

            for(Character c : evenList) {
                System.out.print(c);
            }
            System.out.print(" ");
            for(Character c : oddList) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }


}
