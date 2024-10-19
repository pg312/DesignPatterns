package BuilderDesignPattern;

public class Employee {

    private String name;

    private int age;

    private String designation;

    private double salary;

    private String department;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    public static class EmployeeBuilder{

        Employee employee;

        EmployeeBuilder(){
            employee = new Employee();
        }

        public EmployeeBuilder setName(String name) {
            employee.name = name;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            employee.age = age;
            return this;

        }

        public EmployeeBuilder setDesignation(String designation) {
            employee.designation = designation;
            return this;

        }

        public EmployeeBuilder setSalary(double salary) {
            employee.salary = salary;
            return this;

        }

        public EmployeeBuilder setDepartment(String department) {
            employee.department = department;
            return this;

        }

        public Employee build(){
            return employee;
        }
    }
}
