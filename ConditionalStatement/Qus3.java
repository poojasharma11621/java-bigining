package ConditionalStatement;

import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System .in);
        System.out.println("enter ur 3 sub marks");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        int t=(a+b+c);
        int p=t/3;
if(p>=40&& a>=33&& b>=33&& c>=33){
    System.out.println("Pass");


}
else{
    System.out.println("fail");
}
    }
    
}
