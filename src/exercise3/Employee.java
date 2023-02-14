package exercise3;

public class Employee extends Person {

    private String company;
    private int salary;

    public Employee(String name, int age, String hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
