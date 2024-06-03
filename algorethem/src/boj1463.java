import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj1463 {
    public static void main(String[] args) {
        // 3가지 경우, 1. 1을 뺀다 2. 2로 나누어 떨어질 때 2로 나눈다. 3. 3으로 나누어 떨어 질 수 있을 때 3으로 나누어 떨어진다.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(makeOne(n));
    }

    public static int makeOne(int n){
        int count=0;

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);


        if(n<=3){
            return list.get(n-1);
        }

        for(int i = 3; i < n ;i++){
            list.get(i-2);
        }
        return count;
    }

}
