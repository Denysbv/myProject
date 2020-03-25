package com.loops;

import java.io.Serializable;
import java.util.*;

public class Employee implements Serializable{

    private static final long serialVersionUID = 1L;
    private String name;
    private int salary;
    private ArrayList<Employee> employeeList;
    private int employeeID;


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
        this.employeeID = 1;
    }

    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * проверяем есть ли сотрудник в списке сотрудников *
     */

    public Employee findEmployee(String name) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee checked = this.employeeList.get(i);
            if (checked.getName().equals(name)) {
                return checked;
            }
        }
        return null;
    }

    /**
     * если сотрудника нет в списке сотрудников, создаем нового
     * и присваиваем АЙДИ
     */
    public boolean addNewEmployee(String name, int salary) {
        if (findEmployee(name) == null) {
            Employee employee = new Employee(name, salary);
            employeeList.add(employee);
            employee.setEmployeeID(createID());
            return true;
        }
        return false;
    }

    private int createID() {
        return this.employeeID++;
    }

    /**
     * если сотрудник есть в списке сотрудников, удаляем
     */
    public boolean deleteEmployee(String name) {
        if (findEmployee(name) != null) {
            employeeList.remove(findEmployee(name));
            return true;
        }
        return false;
    }

}

//    @Override
//    public int compareTo(Employee o) {
//        return salary.compareTo(o.name);

