import java.util.Scanner;

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
        
    }
}
