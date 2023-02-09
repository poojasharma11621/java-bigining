package jjjjj.Operators;

import java.util.Scanner;

/**
 * ConditionalOp
 */
public class ConditionalOp {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        /*
         * Conditional Operator
         * (condition ? State1 : State2)
         * if condition is true.....Print =  State1
         * .if condition is False....Print = State2
         */
        System.out.println("enter no");
    
    int c=x.nextInt();
    int a=c>100 ? 5  : 10;
    System.out.println(a);

    }
}