package jjjjj.ConditionalStatement;

import java.util.Scanner;

public class leapYear {public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter year");
    int a=x.nextInt();
    if(a%4==0){
        if(a%100==0){
            if(a%400==0){
             System.out.println( "true");   

            }
            else{
                System.out.println("not aleap year"); 
                

            }}
            else{
                System.out.println("not aleap year");
            }
        }
        else{
            System.out.println("not aa leap year");
        }
     }
    }

    
           

