package loops;

import java.util.Scanner;



public class PracticeSet2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner x=new Scanner (System.in);
    /*System.out.println("enter  no for pattren");
    int n=x.nextInt();
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n+1-i;j++){
            System.out.print("*");
        }System.out.println();
    }*/

//ques2
/*int sum =0;

int n=x.nextInt();
for (int i=1;i<=n;i++){
    if(i%2==0)
  sum=sum+i;
    
  
}System.out.println(sum);*/


//qus3  

/*int n= x.nextInt();
int i=1;
while(i<=10){
    System.out.println(n+"*"+i+"="+(n*i));
    i++;
}*/

//qus 4

/*int n= x.nextInt();
int i=10;
while(i>=1){
    System.out.println(n+"*"+i+"="+(n*i));
   i-- ;
}*/
   

//qus9

/*int sum =0;

int n=x.nextInt();
for (int i=1;i<=10;i++){
    System.out.println(n+"*"+i+"="+(n*i));
   
 sum=sum + (n*i);
}System.out.println(sum);*/


//qus10(i)

/*int i=1; 
int n =5;
do{
    System.out.println(i);
}while(i>=n);
*/

//qus(ii)

int n =x.nextInt();
int i=1; 
do{
    System.out.print("*");
    i++;
}while(i<=n);

    }

}
