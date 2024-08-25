package app;

public class Employee {
    private String fullName;
    private String position;
    private String email;    // Email
    private String phone;    // Телефон
    private int age;

    public Employee (String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("ПІБ: %s, Посада: %s, Email: %s, Телефон: %s, Вік: %d",
                fullName, position, email, phone, age);
    }
}
