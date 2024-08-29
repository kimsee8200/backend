package AlgorithmKnowledge;

import java.util.ArrayList;
import java.util.Scanner;

public class boj10828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> stack = new ArrayList<>();
        String[] stringCommend = new String[num];
        for (int i = 0; i < num; i++) {
           stringCommend[i] = sc.nextLine();
        }

        for (String comm:stringCommend) {
            String[] commend =comm.split(" ");
            if (commend[0].equals("empty")) {
                System.out.println(stack.isEmpty()?1:0);
            } else if(commend[0].equals("push")){
                stack.add(Integer.parseInt(commend[1]));
            }else if(commend[0].equals("pop")&&!stack.isEmpty()){
                System.out.println(stack.get(stack.size()-1));
                stack.remove(stack.size()-1);
            }else if(commend[0].equals("pop")){
                System.out.println(-1);
            } else if(commend[0].equals("top")){
                System.out.println(!stack.isEmpty()?stack.get(stack.size() - 1):-1);
            } else if(commend[0].equals("size")){
                System.out.println(stack.size());
            }
        }

    }
}
