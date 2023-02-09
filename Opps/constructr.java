package jjjjj.Opps;
class cylinder{
    int r;int h;
   public void setr(int r) {
       this.r = r;
   }
    public int getr(){
       return r;
    }
    public void seth(int h){
       this.h=h;
    }
    public int geth(){
       return h;
    }
}
public class constructr {


    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setr(3);
        c.seth(10);
        System.out.println(c.setr());
        System.out.println( c.seth());

    }
}