package objectt;

public class EmployeeAppV2 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Justin", "Bieber");
        employee1.setAge(14);
        Employee employee2 = new Employee("Nikola", "Tesla");
        employee2.setAge(72);
        Employee employee3 = new Employee("Marie", "Curie");
        employee3.setAge(60);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);



    }
}
