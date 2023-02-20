package exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    public static List<Person> getPersonsWithHigherSalary(List<Employee> employees, int targetSalary) {
        List<Person> results = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > targetSalary) {
                results.add(new Person(employee.getName(), employee.getAge(), employee.getHairColour()));
            }
        }
        return results;
    }

    public static Map<String, List<Person>> mapPersonsOnCompany(List<Employee> employees) {
        Map<String, List<Person>> results = new HashMap<>();
        for (Employee employee : employees) {
            if (results.containsKey(employee.getCompany())) {
                results.get(employee.getCompany()).add(new Person(employee.getName(), employee.getAge(), employee.getHairColour()));
            } else {
                List<Person> values = new ArrayList<>();
                values.add(new Person(employee.getName(), employee.getAge(), employee.getHairColour()));
                results.put(employee.getCompany(), values);
            }
        }
        return results;
    }

    public static int sumOfAllSalaries(List<Employee> employees) {
        int sumOfAllSalaries = 0;
        for (Employee employee : employees) {
            sumOfAllSalaries += employee.getSalary();
        }
        return sumOfAllSalaries;
    }

    public static String getCompanyWithHighestSalary(List<Employee> employees) {
        String companyWithHighestSalary = "";
        int highestSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > highestSalary) {
                companyWithHighestSalary = employee.getCompany();
            }
        }
        return companyWithHighestSalary;
    }
}
