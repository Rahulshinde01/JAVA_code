class MyMainEmployee{
    int salary;
    public MyMainEmployee(){
        salary = 10000;
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_42_Constructor {
    public static void main(String[] args) {
        MyMainEmployee obj = new MyMainEmployee();
        System.out.println("salary of the employee "+ obj.getSalary());
    }
}
