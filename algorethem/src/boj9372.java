import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj9372 {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Tree treeClass = new Tree();
        int testCase = input.testCase();
        for (int i = 0; i < testCase; i++) {
            int[] info = input.makeInteger();
            int[][] tree = input.makeTree(info[0],info[1]);
            System.out.println(treeClass.findPlane(tree));
        }
    }

}


class Input {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

    public int testCase() throws IOException {
        buf.readLine();
        return Integer.parseInt(buf.readLine());
    }

    public int[] makeInteger() throws IOException {
        String[] carry = buf.readLine().split(" ");
        int[] number = new int[carry.length];
        for (int i = 0; i < carry.length; i++) {
            number[i] = Integer.parseInt(carry[i]);
        }
        return number;
    }

    public int[][] makeTree(int country, int planeInfo) throws IOException{

        int[][] tree = new int[country][country];
        for (int i = 0; i < planeInfo; i++) {
            int[] carry = makeInteger();
            tree[carry[0]][carry[1]] = 1;
            tree[carry[1]][carry[0]] = 1;
        }

        return tree;
    }
}

class Tree{
    public int findPlane(int[][] tree) {
        List<Integer> visited = new ArrayList<Integer>();

    }
}