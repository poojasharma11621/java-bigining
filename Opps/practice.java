package jjjjj.Opps;

import java.sql.SQLOutput;

class circle {
    public double Area(int radius) {

        return 3.14 * radius * radius;
    }}
class cellphone{
    public void vibrating(){
        System.out.println("cell is vibrating");

    }
    public void ringing(){
        System.out.println("cell is ringing");
    }
    public void calling(){
        System.out.println("cell is calling");
    }
}


class MyEmployee{
    int salary;
    String name;

    public void setsalary (int s){
        salary=s;
    }
    public int getsalary(){
        return salary;
    }
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;

    }

}
class Rectangle {
    int length ;int width;
    public int Area (int length,int width){
        return length *width;
    }
}

class square{
    public int area(int  a){
        return a*a;
    }
}

class game{
        public void running(){
            System.out.println("player is running");

        }
public void firing(){
    System.out.println("player is firing");

}public void shooting(){
        System.out.println("player is shooting");
    }
}

    public class practice {
        public static void main(String[] args) {


//            ques  6

//            circle obj = new circle();
//            System.out.println(obj.Area(6));


//            questions 4



//          Rectangle obj=new Rectangle();
//            System.out.println(obj.Area  (5,4));


//             ques 1
//            MyEmployee employee=new MyEmployee();
//            employee.setsalary (23000);
/*
            System.out.println( employee.getsalary());

            employee.setname("pooja");

            System.out.println( employee.getname());
            */

//            ques 2
         /*   cellphone moto=new cellphone();
            moto.ringing();
            moto.vibrating();
            moto.calling();


//            ques  3
      square sq=new square();
      sq.area(6);
            System.out.println( sq.area(6) );*/


//            qus 5
       game pubg=new game();
        pubg.running();
        pubg.firing();
        pubg.shooting();
        }
    }
