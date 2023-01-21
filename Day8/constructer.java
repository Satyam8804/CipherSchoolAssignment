// package Day8;

import java.util.Arrays;
import java.util.stream.Stream;

class Employee{
    // Constructor
       // A Constructor is a Special Method that has Same name as of Class
       // A Constructor is used to initialize or allocate memory to object
       // A Constructor cannot have return type.

       String name;
       Employee(String name){
        this.name = name;
       }

}
public class constructer {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jack");
        Employee e2 = new Employee("Harry");
        Employee e3 = new Employee("Venessa");

        Employee[] employees = new Employee[]{e1,e2,e3};

        Stream<Employee> empStream = Arrays.stream(employees);

        // printing all employee name 
        empStream.forEach(e->System.out.println("Employee Name : " +e.name));
    }
}
