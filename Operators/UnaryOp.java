package Operators;


import java.util.Scanner;



public class UnaryOp {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
/*Operator which need only one operant to do his work
 * ++,--,+,-,
 */
//example
System.out.println("enter  a no");
int x=sc.nextInt();

int a=+x;
int b=-x;
int c=++x;
int d=--x;
System.out.println(a);
System.err.println(b);
System.err.println(c);
System.err.println(d);


    }
    
}
