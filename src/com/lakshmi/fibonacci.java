package com.lakshmi;


public class fibonacci {

    public static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {

        for(int i=1; i<=7; i++)
        {
            System.out.print(fib(i) +" ");

        }

    }
}
