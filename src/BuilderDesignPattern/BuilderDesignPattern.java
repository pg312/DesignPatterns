package BuilderDesignPattern;

public class BuilderDesignPattern {

    public void builderDesignPatternExample(){
        Employee employee = new Employee.EmployeeBuilder()
                .setName("example")
                .setAge(20)
                .setDesignation("IT Employee")
                .build();
        System.out.println(employee.getName()+"\t"+employee.getAge()+"\t"+employee.getDepartment());

    }
}
