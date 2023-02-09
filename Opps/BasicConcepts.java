package jjjjj.Opps;

class Employee{
    private int id ;
    private String name ;

    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}

public class BasicConcepts {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"Pooja");
        System.out.println(employee1.getId());
        System.out.println(employee1.getName());
    }
}
