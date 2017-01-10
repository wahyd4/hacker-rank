import java.util.Scanner;

public class MainDiagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {

                a[a_i][a_j] = in.nextInt();
            }
        }

        //calculate
        int sumA = 0;
        int sumB = 0;

        for (int x = 0; x < a.length; x++) {
            sumA += a[x][x];
        }

        for (int y = a.length - 1; y >= 0; y--) {
            sumB += a[a.length-1-y][y];
        }
        System.out.println(Math.abs(sumA - sumB));
    }
}
