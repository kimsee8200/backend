import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str;
        String[] lowLev = {"","5"};
        int com1;
        int com2;
        for(int i = 0; i<num; i++){
            str = br.readLine().split(" ");
            com1 = Integer.parseInt(str[1]);
            com2 = Integer.parseInt(lowLev[1]);
            if(com2>com1){
                lowLev = str;
            }
        }

        System.out.println(lowLev[0]);
    }
}
