package AlgorithmKnowledge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class bfs {
    public static void main(String[] args) {
        int[][] graph = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
        boolean[] visited = new boolean[9];
        bfs(graph,1,visited);
    }

    public static void bfs(int[][] graph,int start,boolean[] visited){
        Deque<Integer> que = new ArrayDeque<>();
        for(int val:graph[start]){
            que.add(val);
        }
        visited[start] = true;
        System.out.println(start+"번째 노드 방문");
        while(!que.isEmpty()){
            int v = que.pop();
            System.out.println(v+"번째 노드 방문");
            if(!visited[v]){
                visited[v] = true;
            }
            for(int val:graph[v]){
                if(!visited[val]){
                    que.add(val);
                    visited[val] = true;
                }
            }
        }
    }

}
