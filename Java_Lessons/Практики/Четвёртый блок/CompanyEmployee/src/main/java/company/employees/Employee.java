package company.employees;

public class Employee {
    private final int id;
    private static int number = 0;
    private int salary;
    protected String department;
    public final String name;

    public Employee(int salary, String department, String name) {
        if (salary <= 0)
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        if (department.isEmpty() || name.isEmpty())
            throw new IllegalArgumentException("Текстовое поле не может быть пустым");
        this.salary = salary;
        id = number;
        number++;
        this.department = department;
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Новая запись успешно создана");
    }

    public void setSalary(int salary) {
        if (salary <= 0)
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.salary = salary;
        System.out.println("Зарплата успешно установлена на " + salary);
    }

    public void changeDepartment(String department) {
        if (department.isEmpty())
            throw new IllegalArgumentException("Текстовое поле не может быть пустым");
        this.department = department;
        System.out.println("Сотрудник успешно переведён в департамент: " + department);
    }

    public void displayInfo() {
        System.out.printf("ID сотрудника: %s\n" +
                          "Имя сотрудника: %s\n" +
                          "Зарплата: %d\n" +
                          "Департамент: %s\n",
                        id, name, salary, department);
    }
}