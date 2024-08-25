package app;

public class EmployeeView {
    public void printEmployee (String title, Employee employee) {
        System.out.println(title + ": " + employee + "\n");
    }

    public void printEmployeeInfo (String title, String info) {
        System.out.println(title + ": " + info);
    }
}
