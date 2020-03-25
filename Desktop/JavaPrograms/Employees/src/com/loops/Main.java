package com.loops;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;

public class Main {


    public static void main(String[] AGRS) {
        Employee employee = new Employee("b", 10);
        employee.addNewEmployee("fdd", 100000);
        employee.addNewEmployee("bob", 111111);
        employee.addNewEmployee("tit", 222222);
        employee.addNewEmployee("kil", 333333);
        employee.addNewEmployee("zak", 444444);
        employee.addNewEmployee("kok", 555555);
        employee.addNewEmployee("hih", 222222);
        employee.addNewEmployee("vbv", 666666);
        employee.addNewEmployee("mki", 100000);


        ArrayList<Employee> employeesList = employee.getEmployeeList();

        employee.deleteEmployee("bob");


        employeesList.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));


        for (Employee employee1 : employeesList) {
            System.out.println("ID: " + employee1.getEmployeeID() + ", Name - " + employee1.getName() + ", salary - " + employee1.getSalary());
        }

        System.out.println("************************************");

        for (int i = 0; i < 5; i++) {
            System.out.println("ID: " + employeesList.get(i).getEmployeeID()
                    + ", Name - " + employeesList.get(i).getName()
                    + ", salary - " + employeesList.get(i).getSalary());
        }
        System.out.println("************************************");

        int index = employeesList.size();
        for (int i=0; i < 3; i++) {
            index --;
            System.out.println("ID: " + employeesList.get(index).getEmployeeID());
        }

        System.out.println("*************************************");

        try {
            FileWriter fileWriter = new FileWriter("Empoyees.txt");
            Writer output = new BufferedWriter(fileWriter);

            for (int i = 0; i < employeesList.size(); i++) {
                output.write(employeesList.get(i).getEmployeeID()
                        + "," + employeesList.get(i).getName()
                        + "," + employeesList.get(i).getSalary() + "\n");
            }
            output.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

        Scanner scanner;
        Employee employee2 = new Employee("f", 100);
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("Empoyees.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int id = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String name = scanner.next();
                scanner.skip(scanner.delimiter());
                String sal = scanner.nextLine();
                int salary = Integer.parseInt(sal);
                employee2.addNewEmployee(name, salary);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        ArrayList<Employee> employeesList2 = employee2.getEmployeeList();
        for (Employee employee3 : employeesList2) {
            System.out.println("ID: " + employee3.getEmployeeID() + ", Name - " + employee3.getName() + ", salary - " + employee3.getSalary());
        }
    }
}


