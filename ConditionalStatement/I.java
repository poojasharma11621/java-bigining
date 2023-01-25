package ConditionalStatement;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter ur salary"); 
         int income=sc.nextInt(); //1200000
         float tax = 0;

         if(income <= 250000){
             tax =  0;
         }
         else if(income >250000 && income<=500000){
             tax = tax + 0.05f*(income-250000);
         }
        else if (income>500000&&income<=1000000){
          tax =tax + 0.05f*(500000-250000);
            tax = tax +0.2f*(income-500000);
         }
         else if(income>1000000){
           tax = tax + 0.05f*(500000-250000);
            tax = tax + 0.2f*(1000000-500000);
            tax = tax + 0.3f*(income-1000000);
        }
        System.out.println("tax paid by the employee is : "+tax);

    }
    
}
