package AlgorithmKnowledge;

public class RecursionFunction {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(recursiveSum(n));
    }

    public static int recursiveSum(int n){
        if(n==1) return 1;
        return recursiveSum(n-1)+n;
    }
}
