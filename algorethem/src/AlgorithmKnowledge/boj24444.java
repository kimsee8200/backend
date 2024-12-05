package AlgorithmKnowledge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class boj24444 {
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


        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(num[2]);
        visited[num[2]] = 1;
        visitQueue[num[2]] = count;
        while(!queue.isEmpty()){
            int cur = queue.remove();
            for(int n:graph[cur]){
                if(visited[n]==0){
                    count++;
                    visited[n] = 1;
                    visitQueue[n] = count;
                }
                queue.add(n);
            }
        }

        System.out.println(Arrays.toString(visitQueue));
    }


}
