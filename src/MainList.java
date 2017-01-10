import java.util.LinkedList;
import java.util.Scanner;

public class MainList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //arr num
        int k = in.nextInt(); //move
        int q = in.nextInt();  //index
        LinkedList<Integer> arr = new LinkedList<Integer>();//arr

        int[] question = new int[q]; //store question indexs
         //store array
        for (int a_i = 0; a_i < n; a_i++) {
            arr.addLast(in.nextInt());
        }

        //store question
        for (int x = 0; x < q; x++) {
            question[x] = in.nextInt();
        }


        //do move
        for (int x = 0; x < k; x++) {
            System.out.println("=============moved");
            int tempNUmber = arr.removeLast();
            arr.addFirst(tempNUmber);

            for (int i : arr) {
                System.out.println(i);
            }
        }

        //print values

        for (int x = 0; x < question.length; x++) {
            int index = question[x];
            System.out.println(arr.get(index));
        }

    }
}
