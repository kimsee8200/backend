import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj24416 {
    static int count = 1;
    static int count2 = 0;
    public static int PC1(int n){

        if(n == 1 || n == 2){
            return 1;
        }
        else {
            count++;
            return PC1(n - 1) + PC1(n - 2);
        }
    }

    public static int PC2 (int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(int i = 2; i<n;i++){
            count2++;
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PC1(n);
        PC2(n);
        System.out.printf("%d %d",count,count2);
    }


}