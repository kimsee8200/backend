import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class boj2869 {
    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(bufferedReader.readLine());
//        int[] arr = new int[a];
//        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int divied = (v-a)%(a-b);
        int di = (v-a)/(a-b);
        if (a - v == 0) {
            System.out.println(1);
        }else if(divied==0){
            System.out.println(di +1);
        }else if(divied!=0){
            System.out.println(di +2);
        }
    }
}
