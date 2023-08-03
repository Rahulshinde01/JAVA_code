class Employee{
    int id;
    String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class CWH_38_oop_costom_class {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id=23;
        harry.name="CodeWithHarry";
        System.out.format("The name of the employee is " + harry.name + "\nThe id of the employee is "+harry.id);
    }
}
