package com.java.fibonacci;

public class FibonacciSeries {

    private int memo[] = new int[1001];
    public int fib(int n){
        System.out.println("Starts Fibonacci series -"+n);
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    public int fibMemonised(int n){
        System.out.println("Starts Fibonacci series -"+n);
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(memo[n]==0){
            memo[n]= fib(n-1)+fib(n-2);
        }
        return memo[n];
    }
}
