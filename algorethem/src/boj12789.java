/*
* 반환값 -> 간식을 번호표 준 순서대로 줄 수 있나?
*
* 조건
* 1. 1열로 줄 서 있고 맨 앞 사람만 이동할 수 있다.
* 2. 대기열과 맨 앞사람 사이에는 1명씩 들어 갈 수 있는 공간이 있다.
* 3. 현재 대기열의 사람들은 이 공간으로 올 수 있지만 반대는 불가능하다. -> 다시 대기열로 못간다.
*
* 입력
* flag = 1
* while (list가 비어있지 않다면){
*   if(list[0] == flag){
*       remove(0)
*       flag++;
*   }
*   stack.push(list[0])
*   remove(0)
*   while(stack.peek() == flag){
*      pop;
*   }
* }
*
* stack is null -> nice
* else -> sad
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class boj12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readNum = br.readLine();
        String num = br.readLine();
        br.close();

        Stack<Integer> stack = new Stack();
        ArrayList<Integer> numList = new ArrayList<>();
        for (String n: num.split(" ")) {
            numList.add(Integer.parseInt(n));
        }
        int last = Integer.parseInt(readNum);
        int flag = 1;
        int tmp = 0;

        while(flag == last+1){
            if(!numList.isEmpty()){
               tmp = numList.get(0);
            }else
            if(tmp == flag){
                numList.remove(0);
                flag++;
            } else {
                stack.push(numList.get(0));
                numList.remove(0);
            }
            while(stack.peek() == flag){
                stack.pop();
                flag++;
                if(stack.isEmpty()){
                    break;
                }
            }
        }


        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
