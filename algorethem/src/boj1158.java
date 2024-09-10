// n명이 원을 이루며 앉아있을 때 순서대로 k 번째 앉아 있는 사람을 일어나게 하고, 그 순열을 반환함.
/*
 1. 입력
 원형큐 형식 리스트에 순차적으로 1~n의 숫자를 넣음

 2. 처리
 1. 리스트가 null이 아닐때 까지 반복문을 돈다.
 2. 반복문 내의 처리를 다음과 같이 한다.
    1. count = list.length%count
    2. 만약 3%count+1 = 0 이라면 해당 요소를 결과리스트에 저장, 제거,
    3. count++
 3. 출력
 <결과 리스트 요소>

*/




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.stream.Collectors;

public class boj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int[] elements = new int[tmp.length];
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int count = 0;
        int fcount = 0;
        for (String num:tmp){
            elements[i] = Integer.parseInt(num);
            i++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < elements[0]; i++){
            list.add(i+1);
        }

        while(!list.isEmpty()){
            System.out.println("test");
            fcount = fcount%list.size();
            if(count%elements[1] == 0&&count!=0){
                result.add(list.get(fcount-1));
                list.remove(fcount);
            }
            count++;
            fcount++;
        }

        System.out.print("<");
        for(int res : result){
            System.out.print(res);
        }
        System.out.print(">");

    }
}
