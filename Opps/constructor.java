package jjjjj.Opps;

import javax.swing.*;
import java.util.SortedMap;

class cylinder{
    private int r;
    private  int h;
    public cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }
    public int getr(){
        return r;

    }
    public int geth(){
        return h;
    }
    public double surfaceArea(){
        return  (2*Math.PI* r*h*(r*r));
    }
    public double volume(){
        return Math.PI *r*r*h;
    }
}
class cylinder1{
    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double volume(){
        return Math.PI*r*r*h;
    }
    public double surfaceArea(){
        return Math.PI*2*r*h;
    }
}
class cylinder2{
    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

}
class rectangle{
    private int b;
    private int h;
    public rectangle( ){
        this.b=2;
        this.h=5;
    }

    public int getBR() {
        return b;
    }

    public int getHE() {
        return h;
    }



    public rectangle(int b, int h){
       this.b=b;
       this.h=h;}
        public int getB() {
            return b;
        }

        public int getH() {
            return h;
        }
        class sphere{
        public sphere (int r,int h);
        this.r=r;
        this.h=h;

        }
        public int volume(){
        return Math.PI*r*r*h;
        }




}

public class constructor {
    public static void main(String[] args) {

//       ques  3
//    cylinder c=new cylinder(2,9);
//    System.out.println(c.getr());
//    System.out .println(c.geth());
//    System.out.println(c.volume());
//    System.out .println(c.surfaceArea());

//     ques 2
//        cylinder1 c=new cylinder1();
//        c.setR(4);
//        c.setH(10);
//        System.out.println(c.getR());
//        System.out.println(c.getH());
//        System.out.println(c.volume());
//        System.out.println(c.surfaceArea());

//    ques 1
//        cylinder2 c = new cylinder2();
//        c.setR(4);
//        c.setH(10);
//        System.out.println(c.getR());
//        System.out.println(c.getH());

//        ques
//        rectangle r1=new rectangle();
//        System.out.println(r1.getBR());
//        System.out.println(r1.getHE());
//        rectangle r2=new rectangle(2,5);
//        System.out.println(r2.getB());
//        System.out.println(r2.getH());

//        ques 5
        sphere ss= new sphere(2,5);
        ss.volume();
    }
}