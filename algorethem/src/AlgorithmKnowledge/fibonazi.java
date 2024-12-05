package AlgorithmKnowledge;

public class fibonazi {
    public static void main(String[] args) {
        System.out.println(fibFor(500));
        System.out.println(fib(500)); // n이 큰 숫자면 구하는데 많은 시간이 걸림.

    }
    public static int fib(int n) {
        if(n == 1||n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static int fibFor(int n){
       int[] carry = new int[n+1];
       carry[1] = 1;
       carry[2] = 1;
       for(int i = 3; i <= n; i++){
           carry[i] = carry[i-1] + carry[i-2];
       }
       return carry[n];
    }
}
