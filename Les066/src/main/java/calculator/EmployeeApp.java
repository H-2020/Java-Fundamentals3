package calculator;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1);
        employee1.setPassword("1234");
        // employee1.password = "NoOneShouldSeeMyPassword";
        Employee employee2 = new Employee(2, "Yilmaz", "Mustafa");

//        employee1.doSthPrivate();
//        System.out.println(employee1.getPassword());
    }
}
