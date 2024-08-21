import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class boj1440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = Arrays.stream(br.readLine().split(":")).map(Integer::parseInt).toList();
        int result = 0;
        int zeroCount = 0;

        for(Integer n: num){
            if(result>=3&&n>12&&n<=59){
                result-=1;
            }else if(n<=59&&n>=1){
                result+=3;
            }else if (n<=59) {
                result+=1;
            } else if (n==0) {
                zeroCount++;
            } else{
                result = 0;
                break;
            }
        }

        if(zeroCount==3) {
            result = 0;
        }

        System.out.println(result);
    }
}
