package jjjjj.Opps;
class cylinder{
    int r;int h;
    cylinder(){
    this.r=r;
    this.h=h;
   public int getr(){
        return r;
        }
        public int geth(){
       return h;
        }
}}
public class constructor {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setr(5);
        c.seth(7);
        System.out.println(c.getr);
        System.out.println(c.geth);

    }
}
