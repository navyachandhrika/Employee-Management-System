package com.Employee.application;

public interface EmployeeDAOinterface {

    //create employee
    public void createEmployee(Employee emp);
    //show all employees
    public void showAllEmployees();
    //show employees based on id
    public void showEmployeeOnId(int id);
    //update employee
    public void updateEmployee(int id, String e_name);
    //delete employee
    public void deleteEmployee(int id);

}
