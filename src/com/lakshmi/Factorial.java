package com.lakshmi;

public class Factorial
{
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;

         int  result = fact(n-1)*n;
         return result;
    }
    public static void main(String[] args) {

        int a = fact(3);
        System.out.println("The factorial of the number is : " + a);



    }
}

