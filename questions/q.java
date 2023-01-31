package questions;



public class q {
    public static void main(String[] args) {
        int c=count(5);
        System.out.print(c) ;
 
     } 
     static int count(int m)
     {
        
        for(int i=1;i<=10;i++){
            return m+count(m-1);

        }
         }}
    