package com.example.main;

import company.employees.Employee;

public class Main {
    static void main() {
        var Maxim = new Employee(500000, "Development department", "Maxim");
        Maxim.displayInfo();
        Maxim.setSalary(1000000);
        Maxim.changeDepartment("Data department");
        Maxim.displayInfo();
        Maxim.setSalary(-100);
    }
}