/*
반환값 각줄마다 입력한 괄호를 검사하여 정상적이면 yes 아니면 no를 반환
1. 괄호 분리
 split 사용

2. 괄호 검사
 스택을 사용 if ')'? pop if stack.isEmpty -> yes else no
 답을 배열에 저장
 이 과정을 첫줄애 작성한 개수만큼 반복

3. 출력
 배열의 요소를 출력
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<String> templist = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++){
            list.add(br.readLine());
        }
        int i = 0;
        String[] prints = new String[repeat];
        for(String element : list){
            templist = List.of(element.split(""));
            for (String temp : templist){
                if(stack.isEmpty()){
                    stack.push(temp);
                }else if(temp.equals(")")&&stack.peek().equals("(")){
                    stack.pop();
                }else {
                    stack.push(temp);
                }
            }
            prints[i] = stack.isEmpty()? "YES" : "NO";
            stack.clear();
            i++;
        }
        for(String element : prints){
            System.out.println(element);
        }
    }
}
