import java.util.Scanner;
import java.util.Stack;

public class boj1268 {

    public static int[][] write(Scanner scanner){
        int number = scanner.nextInt();
        int[][] arr = new int[number][5];
        for(int[] aval : arr){
            for (int val:aval){
                val = scanner.nextInt();
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr =  write(scanner);
        int[] duplicate = new int[arr.length];
        int i;

        // i*10+arr[i][j]로 값을 저장 -> 10을 나눈 값으로 정렬 -> 수가 겹침. -> stack을 이용하여 겹치면 count하면 됨.
        for(int j = 0; j < 5; j++){
            for (i = 0 ; i < arr.length; i++){
                
            }
        }
    }
}
