import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. 입력
 *  bufferedReader로 입력
 * 2. 반복
 *  반복 조건 -> queue.size > 1
 *  1. 맨 처음의 데이터를 pop
 *  2. 두번째의 데이터를 pop후 push
 * 3. 출력
 *  queue.peek로 출력.
 */

public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int repeat = Integer.parseInt(br.readLine());
        int foot;

        for(int i = 0; i < repeat; i++){
            deque.add(i+1);
        }

        while(deque.size() > 1){
            deque.removeFirst();
            foot = deque.removeFirst();
            deque.addLast(foot);
        }

        System.out.println(deque.removeFirst());
    }
}
