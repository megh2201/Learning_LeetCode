//509. Fibonacci Number
//https://leetcode.com/problems/fibonacci-number/

package easy;

public class FibonacciNumber {
    public static void main(String [] args){
        int n = 7;
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(0+" "+1);
        for(int i = 2; i <= n; i++){
            System.out.println(fibonacciNumber.fib(i));
        }
    }
    public int fib(int n) {

        if(n == 0 || n == 1){
            return 1;
        }
        int num1 = 0, num2 = 1, num = 0;

        for(int i = 2; i <= n; i++){
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
        return num2;
    }
}
