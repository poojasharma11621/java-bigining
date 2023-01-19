import java.util.Scanner;

/**
 *Addition
 */
public class Addition {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter the value of a ");
        int a = sc.nextInt();

        System.out.print("enter the value of b ");
        int b = sc.nextInt();

        int c = a+b;
       
        System.out.println("sum of "+a+" and "+b+" is "+c);

    }
    
}