import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int nowNum = 0;
        int[] num = new int[9];
        for(int i = 0; i < 9; i++){
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9;j++){
                if(i==j){
                    continue;
                }
                int i1 = sum - (num[i] + num[j]);
                if(i1 == 100){
                    num[i] = -2;
                    num[j] = -2;
                    break;
                }
            }
            if(num[i] == -2){
                break;
            }
        }

        Arrays.sort(num);
        for (int i = 2; i < 9; i++){
            System.out.println(num[i]);
        }
    }
}
