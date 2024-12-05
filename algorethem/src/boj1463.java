import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.min;

public class boj1463 {
    public static void main(String[] args) {
        // 3가지 경우, 1. 1을 뺀다 2. 2로 나누어 떨어질 때 2로 나눈다. 3. 3으로 나누어 떨어 질 수 있을 때 3으로 나누어 떨어진다.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(makeOne(n));
    }

    public static int makeOne(int n){
        int[] carry = new int[n+1];
       for(int i = 2; i <= n; i++){
           carry[i] = carry[i-1] + 1;
           if(carry[i] % 3 == 0){
               carry[i] = min(carry[i], carry[i/3]+1);
           }
           if(carry[i] % 2 == 0){
               carry[i] = min(carry[i], carry[i/2]+1);
           }
       }
       return carry[n];

    }

}
