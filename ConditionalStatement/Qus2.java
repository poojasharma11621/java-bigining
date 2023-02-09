package jjjjj.ConditionalStatement;

import java.util.Scanner;



public class Qus2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter ur salary"); 
        float income=x.nextInt();
        float tax =0;
            if(income<=250000){
                   System.out.println(tax =income +tax);
                    }
            else if (income>250000&& income<=500000){
                   tax= tax + 0.05f*(income-250000);
                   System.out.println(tax);
                  

                    }
            else if (income > 500000&& income<=1000000){
              tax= tax + 0.05f*(500000-250000);
                tax= tax + 0.2f*(income-500000);


                    }
             else{tax= tax + 0.05f*(500000-250000);
                tax= tax + 0.2f*(1000000-500000);
                tax=tax+0.3f*(income-1000000);


                    
                    }
System.out.println(tax);



  
    }
}
    

