import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj2579 {


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m=0;
        for (int i=0;i<n;i++){
            arr.add(scanner.nextInt());
        }
        arr2.add(arr.get(0));
        arr2.add(arr.get(0)+arr.get(1));

        int i=2;
        int j=3;
        int k=1;
        while (j<n-1){
            arr2.add(Math.max(arr2.get(k)+arr.get(i),arr2.get(k)+arr.get(j)));
            System.out.println(arr2);
            i+=2;
            j+=2;
            k++;
        }
        arr2.add(arr2.get(k)+arr.get(n-1));
        m=arr2.get(arr2.size()-1);
        System.out.print(m);
    }

}

// 규칙 1. 한번에 한 계단, 두 계단 씩 오를 수 있음
// 2. 연속된 세 개의 계단을 모두 밟으면 안된다.
// 3. 마지막 도착 계단은 반드시 밟아야한다.
//        arr2.add(Math.max(arr2.get(0)+arr.get(1),arr2.get(0)+arr.get(2)));
//        arr2.add(Math.max(arr2.get(1)+arr.get(3),arr2.get(1)+arr.get(4)));