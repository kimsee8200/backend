import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup2632 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine());
        int[] carry = new int[stairs+1];
        if(stairs>=3) {
            carry[1] = 1;
            carry[2] = 2;
            for (int i = 3; i <= stairs; i++) {
                carry[i] = carry[i - 1] + carry[i - 2];
            }
            System.out.println(carry[stairs]);
        }
        else{
            System.out.println(stairs);
        }
    }

}
