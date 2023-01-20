import java.util.Scanner;
public class KmMile {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter value in Km");
        double k =x.nextDouble();
        double v=1.609;
        double m= k/v;
System.out.println("In"+k+"km mile is"+m);
    }
    
}
