package AlgorithmKnowledge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj24479 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readNum = br.readLine();
        String[] nums = readNum.split(" ");
        int[] num = new int[nums.length];
        int i = 0;

        for(String s:nums){
            num[i] = Integer.parseInt(s);
            i++;
        }

       ArrayList<Integer>[] graph = new ArrayList[num[0]+1];
        int[] visited = new int[num[0]+1];
        int[] visitQueue = new int[num[0]+1];
        for(i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(i = 0; i<num[1];i++){
            readNum = br.readLine();
            nums = readNum.split(" ");
            graph[Integer.parseInt(nums[0])].add(Integer.parseInt(nums[1]));
            graph[Integer.parseInt(nums[1])].add(Integer.parseInt(nums[0]));
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(num[2]);
        int count = 1;
        while(!stack.isEmpty()){
            int curr = stack.pop();
            if(visited[curr]==1) continue;
            visited[curr] = 1;
            visitQueue[curr] = count;
            count++;

            Collections.sort(graph[curr],Collections.reverseOrder());
            for (Integer n:graph[curr]){
                if(visited[n]==0) {
                    stack.push(n);
                };
            }
        }

       for (i=1;i<visitQueue.length;i++){
           System.out.println(visitQueue[i]);
       }
    }
}
