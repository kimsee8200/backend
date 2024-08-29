import java.util.ArrayList;
import java.util.Scanner;

public class cu1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int current = 0;
        int address1 = 1;
        int address2 = 1;

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        while(arr[address1][address2]!=1){ // 벽에 안 부딫힐려고
            if (arr[address1][address2] == 2){
                arr[address1][address2] = 9;
                break;
            }

            arr[address1][address2] = 9;
            if(arr[address1+1][address2]==1){
                address1++;
            }else{
                address2++;
            }


        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
