package practice;

public class Employee {

    private int id;
    private int salary;
    private String companyName;

    public Employee(int id, int salary, String companyName) {
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }




}
