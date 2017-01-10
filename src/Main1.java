import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] arr = time.split(":");
        boolean morning = false;
        String result = "";

        if(arr[2].indexOf("AM") != -1) {
            morning = true;
        }
        arr[2] = arr[2].substring(0, 2);

        if(morning){
            if(Integer.valueOf(arr[0]) != 12) {
                result = arr[0] + ":" + arr[1] + ":" + arr[2];
            }else {
                result = "00" + ":" + arr[1] + ":" + arr[2];
            }
        }else {
            if(Integer.valueOf(arr[0]) != 12) {
                result = (Integer.valueOf(arr[0]) + 12) + ":" + arr[1] + ":" + arr[2];
            }else {
                result = "12" + ":" + arr[1] + ":" + arr[2];
            }
        }
        System.out.println(result);
        in.close();
    }
}
