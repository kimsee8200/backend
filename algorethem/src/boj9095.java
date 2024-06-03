import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n; i++){
            int num = scanner.nextInt();
            result.add(addOTT(num));
        }
        for(int go:result){
            System.out.println(go);
        }


    }

    public static int addOTT(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);

        if(n<=4){
            return list.get(n-1);
        }
        for(int i = 4; i < n; i++){
            list.add(list.get(i-3)+list.get(i-2)+list.get(i-1));
        }

        return list.get(n-1);
    }

}
