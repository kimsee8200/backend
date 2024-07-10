
import java.util.*;
public class boj17478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println(reCall(s));
    }
    public static String reCall(int count){
        if(count>=0){

        }else{
            return reCall(count-1);
        }
        return null;
    }
}
