import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
   Scanner x=new Scanner(System.in);
    System.out.print("enter ur maths grade");
    int m=x.nextInt();
    System.out.print("enter ur science grade");
    int s=x.nextInt();
    System.out.print("enter ur English grade");
    int e=x.nextInt();
int t=m+s+e;
int c=t/3;
System.out.print("CGPA OF 3 SUB is "+c);

    }
    
}
