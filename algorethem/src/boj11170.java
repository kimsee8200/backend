import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11170 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int call = 0;
        for(int i = 0; i < count; i++){
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            call = 0;
            for(int j = a; j <= b; j++){
                for(String number:String.valueOf(j).split("")){
                    if (number.equals("0")){
                        call++;
                    }
                }
            }
            arr[i] = call;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

    }
}
