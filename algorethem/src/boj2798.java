import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int cards = Integer.parseInt(first[0]);
        int black = Integer.parseInt(first[1]);
        int min = 3000000;
        int res = 0;
        int carry;
        String[] second = br.readLine().split(" ");
        int[] secondNum = new int[cards];
        for (int i = 0 ; i < cards ; i++) {
            int cardNum = Integer.parseInt(second[i]);
            secondNum[i] = cardNum;
        }

        for(int i = 0; i<cards; i++) {
            for (int j = i+1; j<cards; j++) {
                for (int k = j+1; k<cards; k++) {
                    carry = black-(secondNum[i] + secondNum[j] + secondNum[k]);
                    if(carry < min && carry>=0) {
                        min = carry;
                        res = secondNum[i] + secondNum[j] + secondNum[k];
                    }
                }
            }
        }
        System.out.println(res);
    }
}
