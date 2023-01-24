package ConditionalStatement;

import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
    System.out.println("enter ur salary");  
int a=x.nextInt();
if(a>=250000 && a<=500000){
    System.out.println("u hv to paid 5% tax "+(a*5)/100);
}
    else if (a>=500000&&a<=1000000){
        System.out.println("u hv to paid 20% tax" +(a*20)/100 );
    }
    else if(a>=1000000){
        System.out.println("u hv to paid 30% tax"+(a*30)/100);
    }
else{
    System.out.println("u do not required to pay");
}
}
    
}
