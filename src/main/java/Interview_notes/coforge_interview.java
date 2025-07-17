package Interview_notes;

import Models.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class coforge_interview {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 35, "Engineering", 90000.0),
                new Employee(2, "Jane", 28, "Marketing", 60000.0),
                new Employee(3, "Jack", 40, "Engineering", 120000.0),
                new Employee(4, "Jill", 25, "Marketing", 40000.0),
                new Employee(5, "Mike", 45, "Engineering", 110000.0),
                new Employee(6, "Sophie", 32, "HR", 75000.0),
                new Employee(7, "Paul", 37, "HR", 82000.0) );

//        1. Find the average salary of employees in each department.

        Map<String, Double> avgSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avgSal.entrySet().forEach(System.out::println);

//        2. Find the department with the highest average salary.
        Optional<Map.Entry<String, Double>> dept = avgSal.entrySet().stream().max(Map.Entry.comparingByValue());
        dept.ifPresent(stringDoubleEntry -> System.out.println("department with max average salary: " + stringDoubleEntry.getKey()));

//        3. List the names of employees who are above the age of 30 and earn more than 50,000.

        employees.stream().filter(x -> x.getAge()>30 && x.getSalary()>50000).map(Employee::getName)
                .collect(Collectors.toList()).forEach(System.out::println);

        int i = 0;
        int j = 9;
        System.out.println(""+i+j);


//        4. Find the employee with the lowest salary in each department.
        Map<String,Object> names = employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)), x -> x.get().getName())));

        names.forEach((x,y) -> System.out.println(x+":"+y));
    }
}
