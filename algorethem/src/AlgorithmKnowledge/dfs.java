package AlgorithmKnowledge;

public class dfs {

    public static void main(String[] args) {
        int[][] graph = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
        boolean[] visited = new boolean[9];
        dfs(graph,1,visited);
    }

    public static void dfs(int[][] graph, int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v+"번째 그래프 방문");

        for(int val:graph[v]){
           if(!visited[val]){
               dfs(graph,val,visited);
           }
        }
    }
}
