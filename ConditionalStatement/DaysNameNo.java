package ConditionalStatement;

import java.util.Scanner;

public class DaysNameNo {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("enter no");
        int d =x.nextInt(0);
        switch (d) {
        case 1 -> System.out.println("Monday");
        case 2-> System.out.println("Tuesday");
        case 3-> System.out.println("Wednesday");
        case 4-> System.out.println("thruesday");
        case 5-> System.out.println("Friday");
        case 6-> System.out.println("saturday");
        case 7-> System.out.println("sunday");
        default ->System.out.println("invalid no");
        }
        
    }
    
}
