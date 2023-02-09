package jjjjj.ConditionalStatement;

import java.util.Scanner;

public class Url {
     public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter url");
        String str=x.nextLine();
        if (str.endsWith(".com")){
          System.out.println( "commercial url");
          

        }
        else if(str.endsWith(".org")){
           System.out.println( "commercial url");
         

        }
        else if ((str.endsWith(".in"))){
           System.out.println("ndian url"); 
        }
        else{
            System.out.println("defalt");
        }

    
}
    
}
