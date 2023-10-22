/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2Praktikum.Tugas3;

/**
 *
 * @author EKA
 */
public class Employee extends NewClass implements NewInterface {

    public Employee(String empName, int age, double empSalary, String jobDescription, String String) {
        employeename = empName;
        employeeAge = age;
        salary = empSalary;
        this.jobDescription = jobDescription;
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + employeename);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }
    @Override
    public double calculateAnnualSalary() {
        return salary * 12;
    }
    @Override
    public void applyRaise(double raisePercentage) {
        salary += (salary * raisePercentage / 100);
    }
}
