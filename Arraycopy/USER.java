package jjjjj.Arraycopy;


import java.util.Scanner;

public class USER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A =new int [50];int i;
        for(i=0;i<=10;i++){
            System.out.print("enter"+i+"element");
        A[i]=sc.nextInt();}
        for(i=0;i<=10;i++){
            System.out.print(A[i]);
        }
    }
}
