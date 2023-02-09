package jjjjj;
class RT {
    int length ;int width;
    public int Area (int length,int width){
        return length *width;
    }
}

class circle{
    public double Area (int radius){
        return 3.14*radius*radius;
    }
}
    public class Rectangle {
        public static void main(String[] args) {

            //Question 1
            /*  RT obj=new RT();
            obj.length=5;
            obj.width=4;
            System.out.println(obj.Area  (5,4));*/


            //Question 2
            circle obj=new circle();
            System.out.println(obj.Area(6));

        }
    
}
