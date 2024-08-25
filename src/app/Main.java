package app;

public class Main {
    static String title;

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Java Developer", "john.doe@example.com", "+1234567890", 30);
        EmployeeView employeeView = new EmployeeView();

        Car car = new Car();

        title = "Employee info";
        employeeView.printEmployee(title, employee);

        title = "Full Name";
        employeeView.printEmployeeInfo(title, employee.getFullName());

        title = "Position";
        employeeView.printEmployeeInfo(title, employee.getPosition());

        title = "Email";
        employeeView.printEmployeeInfo(title, employee.getEmail());

        title = "Phone";
        employeeView.printEmployeeInfo(title, employee.getPhone());

        title = "Age";
        employeeView.printEmployeeInfo(title, String.valueOf(employee.getAge()));

        System.out.println();
        car.start();
    }
}
