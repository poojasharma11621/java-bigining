package jjjjj.Operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        /*
         * Relational Operator
         * It always yield result either 0 or 1
         * Every non Zero is"true"
         * Every zero is "false"
         * True is 1
         * False is 0
         * >,<,>>,<<,==,!=
         */
        System.out.println("enter no");
        int a=x.nextInt();
        int b=x.nextInt();

boolean result=a>b;
System.out.println(result);
result=a<b;
System.out.println(result);
result=a==b;

System.out.println(result);
result=a!=b;
System.err.println(result);    }
}
