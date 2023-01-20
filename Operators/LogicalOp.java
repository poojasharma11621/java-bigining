package Operators;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        /*
         * Logical Operator
         * !,&&,||
         * (!)=complimentry


         * (&&)=F && X= F
         *      T && F= F
         *      T && T= T
         * 
         * 
         * (||)  F || T=T
         *       F || F=F
         *       T || X=T
         */     
        System.out.println("enter nums");
        int A=x.nextInt();
        int B=x.nextInt();
        boolean p=!true;
        System.out.println(p);
        p=A>B;
        System.out.println(p);
        p=(A>B)||(A<B);
        System.out.println(p);
        p=(A==B)&&(A!=B);
        System.out.println(p);
    }
    
}
