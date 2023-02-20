package exercise3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ioan", 54, "black", "BOR", 25000));
        employees.add(new Employee("Vasile", 67, "black", "BOR", 20000));
        employees.add(new Employee("Maria", 44, "blonde", "None", 0));
        employees.add(new Employee("Andrei", 32, "brown", "Freelancer", 50000));
        employees.add(new Employee("Stefan", 32, "bald", "Freelancer", 40000));

        System.out.println("3.1 Persons with higher salary than 30.000: \n" + EmployeeService.getPersonsWithHigherSalary(employees, 30000));
        System.out.println("3.2 Map persons on company: \n" + EmployeeService.mapPersonsOnCompany(employees));
        System.out.println("3.3 The sum of all salaries is: " + EmployeeService.sumOfAllSalaries(employees));
        System.out.println("3.4 The company with the highest salary is: " + EmployeeService.getCompanyWithHighestSalary(employees));
    }
}
