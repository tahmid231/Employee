/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

public class Employee {

    static String companyName = "XYZ Corporation";
    static String companyAddress = "Dhanmondi, Dhaka";


    private String name;
    private int age;
    private String designation;
    private double salary;

 
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println();
    }


    private static int employeeCount = 0;
    public static void displayEmployeeCount() {
        System.out.println("Total Number of Employees: " + employeeCount);
    }

  
    static {
        employeeCount = 0;
    }



    public static void main(String[] args) {
   
        Employee emp1 = new Employee("Rahim", 30, "Software Engineer", 25000.0);
        Employee emp2 = new Employee("Karim", 25, "Marketing Manager", 30000.0);
        Employee emp3 = new Employee("Hakim", 40, "Sales Director", 12000.0);

    
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

        // Display total number of employees
        Employee.displayEmployeeCount();
    }
}
