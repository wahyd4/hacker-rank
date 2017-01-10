import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/30-conditional-statements
 */
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if((n>=2 && n<5) || n > 20) {
                ans = "Not Weird";
            }else if(n>= 6 &&  n <= 20) {
                ans = "Weird";
            }

        }
        System.out.println(ans);
    }
}
